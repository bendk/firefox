#!/usr/bin/env python3
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at https://mozilla.org/MPL/2.0/.


import base64
import io
import json
import os
import subprocess
import sys
import tempfile
import time
import traceback

from mozlog import formatters, handlers, structuredlog
from PIL import Image, ImageChops, ImageDraw
from pixelmatch.contrib.PIL import pixelmatch
from selenium import webdriver
from selenium.common.exceptions import TimeoutException, WebDriverException
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.options import Options
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.remote.webdriver import WebDriver
from selenium.webdriver.remote.webelement import WebElement
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import WebDriverWait


class SnapTestsBase:
    _INSTANCE = None

    def __init__(self, exp):
        self._INSTANCE = os.environ.get("TEST_SNAP_INSTANCE")

        self._PROFILE_PATH = f"~/snap/{self._INSTANCE}/common/.mozilla/firefox/"
        self._LIB_PATH = rf"/snap/{self._INSTANCE}/current/usr/lib/firefox/libxul.so"
        # This needs to be the snap-based symlink geckodriver to properly setup
        # the Snap environment
        self._EXE_PATH = rf"/snap/bin/{self._INSTANCE}.geckodriver"

        # This needs to be the full path to the binary because at the moment of
        # its execution it will already be under the Snap environment, and
        # running "snap" command in this context will fail with Permission denied
        #
        # This can be trivially verified by the following shell script being used
        # as binary_location/_BIN_PATH below:
        #
        # 8<-8<-8<-8<-8<-8<-8<-8<-8<-8<-8<-8<-
        # #!/bin/sh
        # TMPDIR=${TMPDIR:-/tmp}
        # env > $TMPDIR/snap-test.txt
        # 8<-8<-8<-8<-8<-8<-8<-8<-8<-8<-8<-8<-
        #
        # One should see output generated in the instance-specific temp dir
        # /tmp/snap-private-tmp/snap.{}/tmp/snap-test.txt
        # denoting that everything properly runs under Snap as expected.
        self._BIN_PATH = rf"/snap/{self._INSTANCE}/current/usr/lib/firefox/firefox"

        snap_profile_path = tempfile.mkdtemp(
            prefix="snap-tests",
            dir=os.path.expanduser(self._PROFILE_PATH),
        )

        driver_service_args = []
        if self.need_allow_system_access():
            driver_service_args += ["--allow-system-access"]

        driver_service = Service(
            executable_path=self._EXE_PATH,
            log_output=os.path.join(
                os.environ.get("ARTIFACT_DIR", ""), "geckodriver.log"
            ),
            service_args=driver_service_args,
        )

        options = Options()
        if "TEST_GECKODRIVER_TRACE" in os.environ.keys():
            options.log.level = "trace"
        options.binary_location = self._BIN_PATH
        if not "TEST_NO_HEADLESS" in os.environ.keys():
            options.add_argument("--headless")
        if "MOZ_AUTOMATION" in os.environ.keys():
            os.environ["MOZ_LOG_FILE"] = os.path.join(
                os.environ.get("ARTIFACT_DIR"), "gecko.log"
            )
        options.add_argument("-profile")
        options.add_argument(snap_profile_path)
        self._driver = webdriver.Firefox(service=driver_service, options=options)

        self._logger = structuredlog.StructuredLogger(self.__class__.__name__)
        self._logger.add_handler(
            handlers.StreamHandler(sys.stdout, formatters.TbplFormatter())
        )

        test_filter = "test_{}".format(os.environ.get("TEST_FILTER", ""))
        object_methods = [
            method_name
            for method_name in dir(self)
            if callable(getattr(self, method_name))
            and method_name.startswith(test_filter)
        ]

        self._logger.suite_start(object_methods)

        assert self._dir is not None

        self._update_channel = None
        self._version_major = None
        self._snap_core_base = None

        self._is_debug_build = None
        if self.is_debug_build():
            self._logger.info("Running against a DEBUG build")
        else:
            self._logger.info("Running against a OPT build")

        self._driver.maximize_window()

        self._wait = WebDriverWait(self._driver, self.get_timeout())
        self._longwait = WebDriverWait(self._driver, 60)

        with open(exp) as j:
            self._expectations = json.load(j)

        # exit code ; will be set to 1 at first assertion failure
        ec = 0
        first_tab = self._driver.window_handles[0]
        channel = self.update_channel()
        if self.is_esr_128():
            channel = "esr-128"

        core_base = self.snap_core_base()
        channel_and_core = f"{channel}core{core_base}"
        self._logger.info(f"Channel & Core: {channel_and_core}")

        for m in object_methods:
            tabs_before = set()
            tabs_after = set()
            self._logger.test_start(m)
            expectations = (
                self._expectations[m]
                if not channel_and_core in self._expectations[m]
                else self._expectations[m][channel_and_core]
            )
            self._driver.switch_to.window(first_tab)

            try:
                tabs_before = set(self._driver.window_handles)
                rv = getattr(self, m)(expectations)
                assert rv is not None, "test returned no value"

                tabs_after = set(self._driver.window_handles)
                self._logger.info(f"tabs_after OK {tabs_after}")

                self._driver.switch_to.parent_frame()
                if rv:
                    self._logger.test_end(m, status="OK")
                else:
                    self._logger.test_end(m, status="FAIL")
            except Exception as ex:
                ec = 1
                test_status = "ERROR"
                if isinstance(ex, AssertionError):
                    test_status = "FAIL"
                elif isinstance(ex, TimeoutException):
                    test_status = "TIMEOUT"

                test_message = repr(ex)
                self.save_screenshot(
                    f"screenshot_{m.lower()}_{test_status.lower()}.png"
                )
                self._driver.switch_to.parent_frame()
                self.save_screenshot(
                    f"screenshot_{m.lower()}_{test_status.lower()}_parent.png"
                )
                self._logger.test_end(m, status=test_status, message=test_message)
                traceback.print_exc()

                tabs_after = set(self._driver.window_handles)
                self._logger.info(f"tabs_after EXCEPTION {tabs_after}")
            finally:
                self._logger.info(f"tabs_before {tabs_before}")
                tabs_opened = tabs_after - tabs_before
                self._logger.info(f"opened {len(tabs_opened)} tabs")
                self._logger.info(f"opened {tabs_opened} tabs")
                closed = 0
                for tab in tabs_opened:
                    self._logger.info(f"switch to {tab}")
                    self._driver.switch_to.window(tab)
                    self._logger.info(f"close {tab}")
                    self._driver.close()
                    closed += 1
                    self._logger.info(
                        f"wait EC.number_of_windows_to_be({len(tabs_after) - closed})"
                    )
                    self._wait.until(
                        EC.number_of_windows_to_be(len(tabs_after) - closed)
                    )

                self._driver.switch_to.window(first_tab)

        if not "TEST_NO_QUIT" in os.environ.keys():
            self._driver.quit()

        self._logger.info(f"Exiting with {ec}")
        self._logger.suite_end()
        sys.exit(ec)

    def get_screenshot_destination(self, name):
        final_name = name
        if "MOZ_AUTOMATION" in os.environ.keys():
            final_name = os.path.join(os.environ.get("ARTIFACT_DIR"), name)
        return final_name

    def save_screenshot(self, name):
        final_name = self.get_screenshot_destination(name)
        self._logger.info(f"Saving screenshot '{name}' to '{final_name}'")
        try:
            self._driver.save_screenshot(final_name)
        except WebDriverException as ex:
            self._logger.info(f"Saving screenshot FAILED due to {ex}")

    def get_timeout(self):
        if "TEST_TIMEOUT" in os.environ.keys():
            return int(os.getenv("TEST_TIMEOUT"))
        else:
            return 5

    def maybe_collect_reference(self):
        return "TEST_COLLECT_REFERENCE" in os.environ.keys()

    def open_tab(self, url):
        opened_tabs = len(self._driver.window_handles)

        self._driver.switch_to.new_window("tab")
        self._wait.until(EC.number_of_windows_to_be(opened_tabs + 1))
        self._driver.get(url)

        return self._driver.current_window_handle

    def is_debug_build(self):
        if self._is_debug_build is None:
            self._is_debug_build = (
                "with debug_info"
                in subprocess.check_output(["file", self._LIB_PATH]).decode()
            )
        return self._is_debug_build

    def need_allow_system_access(self):
        geckodriver_output = subprocess.check_output(
            [self._EXE_PATH, "--help"]
        ).decode()
        return "--allow-system-access" in geckodriver_output

    def update_channel(self):
        if self._update_channel is None:
            self._driver.set_context("chrome")
            self._update_channel = self._driver.execute_script(
                "return Services.prefs.getStringPref('app.update.channel');"
            )
            self._logger.info(f"Update channel: {self._update_channel}")
            self._driver.set_context("content")
        return self._update_channel

    def snap_core_base(self):
        if self._snap_core_base is None:
            self._driver.set_context("chrome")
            self._snap_core_base = self._driver.execute_script(
                "return Services.sysinfo.getProperty('distroVersion');"
            )
            self._logger.info(f"Snap Core: {self._snap_core_base}")
            self._driver.set_context("content")
        return self._snap_core_base

    def version(self):
        self._driver.set_context("chrome")
        version = self._driver.execute_script("return AppConstants.MOZ_APP_VERSION;")
        self._driver.set_context("content")
        return version

    def version_major(self):
        if self._version_major is None:
            self._driver.set_context("chrome")
            self._version_major = self._driver.execute_script(
                "return AppConstants.MOZ_APP_VERSION.split('.')[0];"
            )
            self._logger.info(f"Version major: {self._version_major}")
            self._driver.set_context("content")
        return self._version_major

    def is_esr_128(self):
        return self.update_channel() == "esr" and self.version_major() == "128"

    def assert_rendering(self, exp, element_or_driver):
        # wait a bit for things to settle down
        time.sleep(0.5)

        # Convert as RGB otherwise we cannot get difference
        png_bytes = (
            element_or_driver.screenshot_as_png
            if isinstance(element_or_driver, WebElement)
            else (
                element_or_driver.get_screenshot_as_png()
                if isinstance(element_or_driver, WebDriver)
                else base64.b64decode(element_or_driver)
            )
        )
        svg_png = Image.open(io.BytesIO(png_bytes)).convert("RGB")
        svg_png_cropped = svg_png.crop((0, 35, svg_png.width - 20, svg_png.height - 10))

        if self.maybe_collect_reference():
            new_ref = "new_{}".format(exp["reference"])
            new_ref_file = self.get_screenshot_destination(new_ref)
            self._logger.info(
                f"Collecting new reference screenshot: {new_ref} => {new_ref_file}"
            )

            with open(new_ref_file, "wb") as current_screenshot:
                svg_png_cropped.save(current_screenshot)

            return

        svg_ref = Image.open(os.path.join(self._dir, exp["reference"])).convert("RGB")
        diff = ImageChops.difference(svg_ref, svg_png_cropped)

        bbox = diff.getbbox()

        mismatch = 0
        try:
            mismatch = pixelmatch(
                svg_png_cropped, svg_ref, diff, includeAA=False, threshold=0.15
            )
            if mismatch == 0:
                return
            self._logger.info(f"Non empty differences from pixelmatch: {mismatch}")
        except ValueError as ex:
            self._logger.info(f"Problem at pixelmatch: {ex}")
            current_rendering_png = "pixelmatch_current_rendering_{}".format(
                exp["reference"]
            )
            with open(
                self.get_screenshot_destination(current_rendering_png), "wb"
            ) as current_screenshot:
                svg_png_cropped.save(current_screenshot)

            reference_rendering_png = "pixelmatch_reference_rendering_{}".format(
                exp["reference"]
            )
            with open(
                self.get_screenshot_destination(reference_rendering_png), "wb"
            ) as current_screenshot:
                svg_ref.save(current_screenshot)

        if bbox is not None:
            (left, upper, right, lower) = bbox
            assert mismatch > 0, "Really mismatching"

            bbox_w = right - left
            bbox_h = lower - upper

            diff_px_on_bbox = round((mismatch * 1.0 / (bbox_w * bbox_h)) * 100, 3)
            allowance = exp["allowance"] if "allowance" in exp else 0.15
            self._logger.info(
                f"Bbox: {bbox_w}x{bbox_h} => {diff_px_on_bbox}% ({allowance}% allowed)"
            )

            if diff_px_on_bbox <= allowance:
                return

            (diff_r, diff_g, diff_b) = diff.getextrema()

            draw_ref = ImageDraw.Draw(svg_ref)
            draw_ref.rectangle(bbox, outline="red")

            draw_rend = ImageDraw.Draw(svg_png_cropped)
            draw_rend.rectangle(bbox, outline="red")

            draw_diff = ImageDraw.Draw(diff)
            draw_diff.rectangle(bbox, outline="red")

            # Some differences have been found, let's verify
            self._logger.info(f"Non empty differences bbox: {bbox}")

            buffered = io.BytesIO()
            diff.save(buffered, format="PNG")

            if "TEST_DUMP_DIFF" in os.environ.keys():
                diff_b64 = base64.b64encode(buffered.getvalue())
                self._logger.info(
                    "data:image/png;base64,{}".format(diff_b64.decode("utf-8"))
                )

            differences_png = "differences_{}".format(exp["reference"])
            with open(
                self.get_screenshot_destination(differences_png), "wb"
            ) as diff_screenshot:
                diff_screenshot.write(buffered.getvalue())

            current_rendering_png = "current_rendering_{}".format(exp["reference"])
            with open(
                self.get_screenshot_destination(current_rendering_png), "wb"
            ) as current_screenshot:
                svg_png_cropped.save(current_screenshot)

            reference_rendering_png = "reference_rendering_{}".format(exp["reference"])
            with open(
                self.get_screenshot_destination(reference_rendering_png), "wb"
            ) as current_screenshot:
                svg_ref.save(current_screenshot)

            (left, upper, right, lower) = bbox
            assert right >= left, f"Inconsistent boundaries right={right} left={left}"
            assert (
                lower >= upper
            ), f"Inconsistent boundaries lower={lower} upper={upper}"
            if ((right - left) <= 2) or ((lower - upper) <= 2):
                self._logger.info("Difference is a <= 2 pixels band, ignoring")
                return

            assert (
                diff_px_on_bbox <= allowance
            ), "Mismatching screenshots for {}".format(exp["reference"])


class SnapTests(SnapTestsBase):
    def __init__(self, exp):
        self._dir = "basic_tests"
        super(__class__, self).__init__(exp)

    def test_snap_core_base(self, exp):
        assert self.snap_core_base() in ["22", "24"], "Core base should be 22 or 24"

        return True

    def test_about_support(self, exp):
        self.open_tab("about:support")

        version_box = self._wait.until(
            EC.visibility_of_element_located((By.ID, "version-box"))
        )
        self._wait.until(lambda d: len(version_box.text) > 0)
        self._logger.info(f"about:support version: {version_box.text}")
        assert version_box.text == exp["version_box"], "version text should match"

        distributionid_box = self._wait.until(
            EC.visibility_of_element_located((By.ID, "distributionid-box"))
        )
        self._wait.until(lambda d: len(distributionid_box.text) > 0)
        self._logger.info(f"about:support distribution ID: {distributionid_box.text}")
        assert (
            distributionid_box.text == exp["distribution_id"]
        ), "distribution_id should match"

        windowing_protocol = self._driver.execute_script(
            "return document.querySelector('th[data-l10n-id=\"graphics-window-protocol\"').parentNode.lastChild.textContent;"
        )
        self._logger.info(f"about:support windowing protocol: {windowing_protocol}")
        assert windowing_protocol == "wayland", "windowing protocol should be wayland"

        return True

    def test_about_buildconfig(self, exp):
        self.open_tab("about:buildconfig")

        source_link = self._wait.until(
            EC.visibility_of_element_located((By.CSS_SELECTOR, "a"))
        )
        self._wait.until(lambda d: len(source_link.text) > 0)
        self._logger.info(f"about:buildconfig source: {source_link.text}")
        assert source_link.text.startswith(
            exp["source_repo"]
        ), "source repo should exists and match"

        build_flags_box = self._wait.until(
            EC.visibility_of_element_located((By.CSS_SELECTOR, "p:last-child"))
        )
        self._wait.until(lambda d: len(build_flags_box.text) > 0)
        self._logger.info(f"about:support buildflags: {build_flags_box.text}")
        assert (
            build_flags_box.text.find(exp["official"]) >= 0
        ), "official build flag should be there"

        return True

    def test_youtube(self, exp):
        # Skip because unreliable
        return True

        self.open_tab("https://www.youtube.com/channel/UCYfdidRxbB8Qhf0Nx7ioOYw")

        # Wait so we leave time to breathe and not be classified as a bot
        time.sleep(5)

        # Wait for the consent dialog and accept it
        self._logger.info("Wait for consent form")
        try:
            self._wait.until(
                EC.visibility_of_element_located(
                    (By.CSS_SELECTOR, "button[aria-label*=Accept]")
                )
            ).click()
        except TimeoutException:
            self._logger.info("Wait for consent form: timed out, maybe it is not here")

        # Wait so we leave time to breathe and not be classified as a bot
        time.sleep(3)

        # Wait for the cable TV dialog and accept it
        self._logger.info("Wait for cable proposal")
        try:
            self._wait.until(
                EC.visibility_of_element_located(
                    (By.CSS_SELECTOR, "button[aria-label*=Dismiss]")
                )
            ).click()
        except TimeoutException:
            self._logger.info(
                "Wait for cable proposal: timed out, maybe it is not here"
            )

        # Wait so we leave time to breathe and not be classified as a bot
        time.sleep(3)

        # Find first video and click it
        self._logger.info("Wait for one video")
        self._wait.until(
            EC.visibility_of_element_located((By.ID, "video-title-link"))
        ).click()

        # Wait so we leave time to breathe and not be classified as a bot
        time.sleep(3)

        # Wait for duration to be set to something
        self._logger.info("Wait for video to start")
        video = None
        try:
            video = self._longwait.until(
                EC.visibility_of_element_located((By.CLASS_NAME, "html5-main-video"))
            )
            self._longwait.until(
                lambda d: type(video.get_property("duration")) is float
            )
            self._logger.info(
                "video duration: {}".format(video.get_property("duration"))
            )
            assert (
                video.get_property("duration") > exp["duration"]
            ), "youtube video should have duration"

            self._wait.until(
                lambda d: video.get_property("currentTime") > exp["playback"]
            )
            self._logger.info(
                "video played: {}".format(video.get_property("currentTime"))
            )
            assert (
                video.get_property("currentTime") > exp["playback"]
            ), "youtube video should perform playback"
        except TimeoutException as ex:
            self._logger.info("video detection timed out")
            self._logger.info(f"video: {video}")
            if video:
                self._logger.info(
                    "video duration: {}".format(video.get_property("duration"))
                )
            raise ex

        return True

    def wait_for_enable_drm(self):
        rv = True
        self._driver.set_context("chrome")
        self._driver.execute_script(
            "Services.prefs.setBoolPref('media.gmp-manager.updateEnabled', true);"
        )

        enable_drm_button = self._wait.until(
            EC.visibility_of_element_located(
                (By.CSS_SELECTOR, ".notification-button[label='Enable DRM']")
            )
        )
        self._logger.info("Enabling DRMs")
        enable_drm_button.click()
        self._wait.until(
            EC.invisibility_of_element_located(
                (By.CSS_SELECTOR, ".notification-button[label='Enable DRM']")
            )
        )

        self._logger.info("Installing DRMs")
        self._wait.until(
            EC.visibility_of_element_located(
                (By.CSS_SELECTOR, ".infobar[value='drmContentCDMInstalling']")
            )
        )

        self._logger.info("Waiting for DRMs installation to complete")
        self._longwait.until(
            EC.invisibility_of_element_located(
                (By.CSS_SELECTOR, ".infobar[value='drmContentCDMInstalling']")
            )
        )

        self._driver.set_context("content")
        return rv

    def test_youtube_film(self, exp):
        # Bug 1885473: require sign-in?
        return True

        self.open_tab("https://www.youtube.com/watch?v=i4FSx9LXVSE")
        if not self.wait_for_enable_drm():
            self._logger.info("Skipped on ESR because cannot enable DRM")
            return True

        # Wait for duration to be set to something
        self._logger.info("Wait for video to start")
        video = self._wait.until(
            EC.visibility_of_element_located(
                (By.CSS_SELECTOR, "video.html5-main-video")
            )
        )
        self._wait.until(lambda d: type(video.get_property("duration")) is float)
        self._logger.info("video duration: {}".format(video.get_property("duration")))
        assert (
            video.get_property("duration") > exp["duration"]
        ), "youtube video should have duration"

        self._driver.execute_script("arguments[0].click();", video)
        video.send_keys("k")

        self._wait.until(lambda d: video.get_property("currentTime") > exp["playback"])
        self._logger.info("video played: {}".format(video.get_property("currentTime")))
        assert (
            video.get_property("currentTime") > exp["playback"]
        ), "youtube video should perform playback"

        return True


if __name__ == "__main__":
    SnapTests(exp=sys.argv[1])
