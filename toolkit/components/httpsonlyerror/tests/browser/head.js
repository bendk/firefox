// Enable HTTPS-Only Mode
add_setup(async function () {
  await SpecialPowers.pushPrefEnv({
    set: [["dom.security.https_only_mode", true]],
  });
});

// Copied from: https://searchfox.org/mozilla-central/rev/9f074fab9bf905fad62e7cc32faf121195f4ba46/browser/base/content/test/about/head.js

async function injectErrorPageFrame(tab, src, sandboxed) {
  let loadedPromise = BrowserTestUtils.browserLoaded(
    tab.linkedBrowser,
    true,
    null,
    true
  );

  await SpecialPowers.spawn(
    tab.linkedBrowser,
    [src, sandboxed],
    async function (frameSrc, frameSandboxed) {
      let iframe = content.document.createElement("iframe");
      iframe.src = frameSrc;
      if (frameSandboxed) {
        iframe.setAttribute("sandbox", "allow-scripts");
      }
      content.document.body.appendChild(iframe);
    }
  );

  await loadedPromise;
}

async function openErrorPage(src, useFrame, privateWindow, sandboxed) {
  let gb = gBrowser;
  if (privateWindow) {
    gb = privateWindow.gBrowser;
  }
  let dummyPage =
    getRootDirectory(gTestPath).replace(
      "chrome://mochitests/content",
      "https://example.com"
    ) + "dummy_page.html";

  let tab;
  if (useFrame) {
    info("Loading error page in an iframe");
    tab = await BrowserTestUtils.openNewForegroundTab(gb, dummyPage);
    await injectErrorPageFrame(tab, src, sandboxed);
  } else {
    let ErrorPageLoaded;
    tab = await BrowserTestUtils.openNewForegroundTab(
      gb,
      () => {
        gb.selectedTab = BrowserTestUtils.addTab(gb, src);
        let browser = gb.selectedBrowser;
        ErrorPageLoaded = BrowserTestUtils.waitForErrorPage(browser);
      },
      false
    );
    info("Loading and waiting for the error page");
    await ErrorPageLoaded;
  }

  return tab;
}

/**
 * On a loaded HTTPS-Only error page, waits until the "Open Insecure"
 * button gets enabled and then presses it.
 *
 * @returns {Promise<void>}
 */
function waitForAndClickOpenInsecureButton(browser) {
  return SpecialPowers.spawn(browser, [], async function () {
    let openInsecureButton = content.document.getElementById("openInsecure");
    Assert.notEqual(
      openInsecureButton,
      null,
      "openInsecureButton should exist."
    );
    info("Waiting for openInsecureButton to be enabled.");
    function callback() {
      if (!openInsecureButton.classList.contains("disabled")) {
        info("openInsecureButton was enabled, waiting two frames.");
        observer.disconnect();
        content.requestAnimationFrame(() => {
          content.requestAnimationFrame(() => {
            info("clicking openInsecureButton.");
            openInsecureButton.click();
          });
        });
      }
    }
    const observer = new content.MutationObserver(callback);
    observer.observe(openInsecureButton, { attributeFilter: ["class"] });
    callback();
  });
}
