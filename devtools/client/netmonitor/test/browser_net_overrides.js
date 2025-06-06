/* Any copyright is dedicated to the Public Domain.
 * http://creativecommons.org/publicdomain/zero/1.0/ */

"use strict";

// This test might take a very long time on slow platforms such as TSAN.
requestLongerTimeout(2);

/* import-globals-from network-overrides-test-helpers.js */
Services.scriptloader.loadSubScript(
  CHROME_URL_ROOT + "network-overrides-test-helpers.js",
  this
);

function clearMemoryCache(browser) {
  info("Clearing subresource cache");
  return SpecialPowers.spawn(browser, [], () => {
    ChromeUtils.clearResourceCache();
  });
}

/**
 * Test adding and removing overrides for three resources:
 * - HTML file
 * - JS file
 * - CSS file
 */

async function testHTMLOverrideWithOptions(options) {
  const { monitor, tab, document } = await setupNetworkOverridesTest(options);

  let htmlRequest = findRequestByInitiator(document, "document");
  ok(
    !htmlRequest.querySelector(".requests-list-override"),
    "There is no override cell"
  );
  await assertOverrideColumnStatus(monitor, { visible: false });

  info("Set a network override for the HTML request");
  const overrideFileName = `index-override.html`;
  const overridePath = await setNetworkOverride(
    monitor,
    htmlRequest,
    overrideFileName,
    OVERRIDDEN_HTML
  );

  // Assert override column is checked but disabled in context menu
  await assertOverrideColumnStatus(monitor, { visible: true });

  // Assert override is only displayed for appropriate request
  assertOverrideCellStatus(htmlRequest, { overridden: true });
  const overrideCell = htmlRequest.querySelector(".requests-list-override");
  ok(
    overrideCell.getAttribute("title").includes(overrideFileName),
    "The override icon's title contains the overridden path"
  );

  const scriptRequest = findRequestByInitiator(document, "script");
  assertOverrideCellStatus(scriptRequest, { overridden: false });
  const stylesheetRequest = findRequestByInitiator(document, "stylesheet");
  assertOverrideCellStatus(stylesheetRequest, { overridden: false });

  info("Reloading to check override is applied on the page");
  let waitForEvents = waitForNetworkEvents(monitor, 1);
  tab.linkedBrowser.reload();
  await waitForEvents;

  await SpecialPowers.spawn(gBrowser.selectedBrowser, [], () => {
    ok(content.document.body.textContent.includes("Overridden content"));
  });

  htmlRequest = findRequestByInitiator(document, "document");
  // If the HTML file was properly overridden, reloading the page should only
  // create one request, because there is no longer any JS or CSS file loaded
  // by the overridden HTML response.
  is(
    document.querySelectorAll(".request-list-item").length,
    1,
    "Only one request (html file) - no additional script or stylesheet"
  );

  // Assert Response Tab shows the appropriate content
  await assertOverriddenResponseTab(document, htmlRequest, overridePath);

  // Remove Network override
  await removeNetworkOverride(monitor, htmlRequest);

  await assertOverrideColumnStatus(monitor, { visible: false });
  ok(
    !htmlRequest.querySelector(".requests-list-override"),
    "There is no override cell"
  );

  info("Reload again to check the override is no longer applied on the page");
  waitForEvents = waitForNetworkEvents(monitor, 3);
  tab.linkedBrowser.reload();
  await waitForEvents;

  is(
    document.querySelectorAll(".request-list-item").length,
    3,
    "3 requests displayed after removing the override and reloading"
  );

  // Assert HTML content is back to normal
  await SpecialPowers.spawn(gBrowser.selectedBrowser, [], () => {
    ok(content.document.body.textContent.includes("Original content"));
  });

  return teardown(monitor);
}

add_task(async function testHTMLOverrideWithoutCache() {
  await testHTMLOverrideWithOptions({ enableCache: false });
});

add_task(async function testHTMLOverrideWithCache() {
  await testHTMLOverrideWithOptions({ enableCache: true });
});

async function testScriptOverrideWithOptions(options) {
  const { monitor, tab, document } = await setupNetworkOverridesTest(options);

  async function assertScriptOverrideInContent({ override }) {
    await SpecialPowers.spawn(
      gBrowser.selectedBrowser,
      [override],
      _override => {
        is(
          !!content.document.querySelector("#created-by-original"),
          !_override,
          `original div should ${!_override ? "" : "not "}be found`
        );
        is(
          !!content.document.querySelector("#created-by-override"),
          _override,
          `override div should ${_override ? "" : "not "}be found`
        );
      }
    );
  }

  let scriptRequest = findRequestByInitiator(document, "script");
  ok(
    !scriptRequest.querySelector(".requests-list-override"),
    "There is no override cell"
  );
  await assertOverrideColumnStatus(monitor, { visible: false });

  info("Check the original div was created by the script in the content page");
  await assertScriptOverrideInContent({ override: false });

  info("Set a network override for the script request");
  const overrideFileName = `script-override.js`;
  const overridePath = await setNetworkOverride(
    monitor,
    scriptRequest,
    overrideFileName,
    OVERRIDDEN_SCRIPT,
    // If cache is used and the navigation cache is enabled, the response is
    // not available.
    Services.prefs.getBoolPref("dom.script_loader.navigation_cache") &&
      options.enableCache
  );

  // Assert override column is checked but disabled in context menu
  await assertOverrideColumnStatus(monitor, { visible: true });

  // Assert override is only displayed for appropriate request
  assertOverrideCellStatus(scriptRequest, { overridden: true });
  const overrideCell = scriptRequest.querySelector(".requests-list-override");
  ok(
    overrideCell.getAttribute("title").includes(overrideFileName),
    "The override icon's title contains the overridden path"
  );
  const htmlRequest = findRequestByInitiator(document, "document");
  assertOverrideCellStatus(htmlRequest, { overridden: false });
  const stylesheetRequest = findRequestByInitiator(document, "stylesheet");
  assertOverrideCellStatus(stylesheetRequest, { overridden: false });

  info("Reloading to check the overridden script is loaded on the page");
  let waitForEvents = waitForNetworkEvents(monitor, 3);
  tab.linkedBrowser.reload();
  await waitForEvents;

  info("Check the override div was created by the script in the content page");
  await assertScriptOverrideInContent({ override: true });

  scriptRequest = findRequestByInitiator(document, "script");

  // Assert Response Tab shows the appropriate content
  await assertOverriddenResponseTab(document, scriptRequest, overridePath);

  // Remove Network override
  await removeNetworkOverride(monitor, scriptRequest);

  await assertOverrideColumnStatus(monitor, { visible: false });
  ok(
    !scriptRequest.querySelector(".requests-list-override"),
    "There is no override cell"
  );

  info("Reload again to check the override script is no longer loaded");
  waitForEvents = waitForNetworkEvents(monitor, 3);
  tab.linkedBrowser.reload();
  await waitForEvents;

  info("Check the original div was created by the script in the content page");
  await assertScriptOverrideInContent({ override: false });

  return teardown(monitor);
}

add_task(async function testScriptOverrideWithoutCache() {
  await testScriptOverrideWithOptions({ enableCache: false });
});

add_task(async function testScriptOverrideWithCache() {
  await testScriptOverrideWithOptions({ enableCache: true });
});

async function testStylesheetOverrideWithOptions(options) {
  const { monitor, tab, document } = await setupNetworkOverridesTest(options);

  async function assertStylesheetOverrideInContent({ override }) {
    await SpecialPowers.spawn(
      gBrowser.selectedBrowser,
      [override],
      _override => {
        const body = content.document.body;
        const color = content.getComputedStyle(body).color;
        is(color, _override ? "rgb(0, 0, 255)" : "rgb(255, 0, 0)");
      }
    );
  }

  let stylesheetRequest = findRequestByInitiator(document, "stylesheet");
  ok(
    !stylesheetRequest.querySelector(".requests-list-override"),
    "There is no override cell"
  );
  await assertOverrideColumnStatus(monitor, { visible: false });

  info("Check the original div was created by the script in the content page");
  await assertStylesheetOverrideInContent({ override: false });

  info("Set a network override for the stylesheet request");
  const overrideFileName = `style-override.css`;
  const overridePath = await setNetworkOverride(
    monitor,
    stylesheetRequest,
    overrideFileName,
    OVERRIDDEN_STYLESHEET,
    // If cache is used, the response is not available.
    options.enableCache
  );

  // Assert override column is checked but disabled in context menu
  await assertOverrideColumnStatus(monitor, { visible: true });

  // Assert override is only displayed for appropriate request
  assertOverrideCellStatus(stylesheetRequest, { overridden: true });
  const overrideCell = stylesheetRequest.querySelector(
    ".requests-list-override"
  );
  ok(
    overrideCell.getAttribute("title").includes(overrideFileName),
    "The override icon's title contains the overridden path"
  );
  const htmlRequest = findRequestByInitiator(document, "document");
  assertOverrideCellStatus(htmlRequest, { overridden: false });
  const scriptRequest = findRequestByInitiator(document, "script");
  assertOverrideCellStatus(scriptRequest, { overridden: false });

  await clearMemoryCache(tab.linkedBrowser);

  info("Reloading to check the overridden script is loaded on the page");
  let waitForEvents = waitForNetworkEvents(monitor, 3);
  tab.linkedBrowser.reload();
  await waitForEvents;

  info("Check the overridden stylesheet was loaded in the content page");
  await assertStylesheetOverrideInContent({ override: true });

  info("Check the response tab");
  stylesheetRequest = findRequestByInitiator(document, "stylesheet");
  await assertOverriddenResponseTab(document, stylesheetRequest, overridePath);

  info("Remove the network override");
  await removeNetworkOverride(monitor, stylesheetRequest);
  await assertOverrideColumnStatus(monitor, { visible: false });
  ok(
    !stylesheetRequest.querySelector(".requests-list-override"),
    "There is no override cell"
  );

  await clearMemoryCache(tab.linkedBrowser);

  info("Reload again to check the overridden stylesheet is no longer loaded");
  waitForEvents = waitForNetworkEvents(monitor, 3);
  tab.linkedBrowser.reload();
  await waitForEvents;

  info("Check the original div was created by the script in the content page");
  await assertStylesheetOverrideInContent({ override: false });

  return teardown(monitor);
}

add_task(async function testStylesheetOverrideWithoutCache() {
  await testStylesheetOverrideWithOptions({ enableCache: false });
});

add_task(async function testStylesheetOverrideWithCache() {
  await testStylesheetOverrideWithOptions({ enableCache: true });
});

async function assertOverriddenResponseTab(doc, request, overrideFileName) {
  EventUtils.sendMouseEvent({ type: "mousedown" }, request);
  await waitFor(
    () => doc.querySelector("#response-tab"),
    "Wait for the response tab to be displayed"
  );
  ok(
    doc.querySelector(".tab-response-overridden"),
    "Response tab is marked as overridden"
  );
  const responsePanelTab = doc.querySelector("#response-tab");
  ok(
    responsePanelTab.getAttribute("title").includes(overrideFileName),
    "The response panel tab title contains the overridden path"
  );
}
