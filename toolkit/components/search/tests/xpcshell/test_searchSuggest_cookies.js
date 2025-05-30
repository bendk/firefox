/* Any copyright is dedicated to the Public Domain.
 * http://creativecommons.org/publicdomain/zero/1.0/ */

/**
 * Test that search suggestions from SearchSuggestionController.sys.mjs don't store
 * cookies.
 */

"use strict";

const { SearchSuggestionController } = ChromeUtils.importESModule(
  "moz-src:///toolkit/components/search/SearchSuggestionController.sys.mjs"
);

// We must make sure the FormHistoryStartup component is
// initialized in order for it to respond to FormHistory
// requests from FormHistoryAutoComplete.sys.mjs.
var formHistoryStartup = Cc[
  "@mozilla.org/satchel/form-history-startup;1"
].getService(Ci.nsIObserver);
formHistoryStartup.observe(null, "profile-after-change", null);

function countCacheEntries() {
  info("Enumerating cache entries");
  return new Promise(resolve => {
    let storage = Services.cache2.diskCacheStorage(
      Services.loadContextInfo.default
    );
    storage.asyncVisitStorage(
      {
        onCacheStorageInfo(num) {
          this._num = num;
        },
        onCacheEntryInfo(uri) {
          info("Found cache entry: " + uri.asciiSpec);
        },
        onCacheEntryVisitCompleted() {
          resolve(this._num || 0);
        },
      },
      true /* Do walk entries */
    );
  });
}

function countCookieEntries() {
  info("Enumerating cookies");
  let cookies = Services.cookies.cookies;
  let cookieCount = 0;
  for (let cookie of cookies) {
    info(
      "Cookie:" + cookie.rawHost + " " + JSON.stringify(cookie.originAttributes)
    );
    cookieCount++;
    break;
  }
  return cookieCount;
}

let engines;

add_setup(async function () {
  Services.prefs.setBoolPref("browser.search.suggest.enabled", true);
  Services.prefs.setBoolPref("browser.search.suggest.enabled.private", true);

  registerCleanupFunction(async () => {
    // Clean up all the data.
    await new Promise(resolve =>
      Services.clearData.deleteData(Ci.nsIClearDataService.CLEAR_ALL, resolve)
    );
    Services.prefs.clearUserPref("browser.search.suggest.enabled");
    Services.prefs.clearUserPref("browser.search.suggest.enabled.private");
  });

  let server = useHttpServer();
  server.registerContentType("sjs", "sjs");

  let unicodeName = ["\u30a8", "\u30c9"].join("");
  engines = [
    await SearchTestUtils.installOpenSearchEngine({
      url: `${gHttpURL}/sjs/engineMaker.sjs?${JSON.stringify({
        baseURL: `${gHttpURL}/sjs/`,
        name: unicodeName,
        method: "GET",
      })}`,
    }),
    await SearchTestUtils.installOpenSearchEngine({
      url: `${gHttpURL}/sjs/engineMaker.sjs?${JSON.stringify({
        baseURL: `${gHttpURL}/sjs/`,
        name: "engine two",
        method: "GET",
      })}`,
    }),
  ];

  // Clean up all the data.
  await new Promise(resolve =>
    Services.clearData.deleteData(Ci.nsIClearDataService.CLEAR_ALL, resolve)
  );
  Assert.equal(await countCacheEntries(), 0, "The cache should be empty");
  Assert.equal(await countCookieEntries(), 0, "Should not find any cookie");
});

add_task(async function test_private_mode() {
  await test_engine(true);
});
add_task(async function test_normal_mode() {
  await test_engine(false);
});

async function test_engine(privateMode) {
  info(`Testing ${privateMode ? "private" : "normal"} mode`);
  let controller = new SearchSuggestionController();
  let result = await controller.fetch("no results", privateMode, engines[0]);
  Assert.equal(result.local.length, 0, "Should have no local suggestions");
  Assert.equal(result.remote.length, 0, "Should have no remote suggestions");

  result = await controller.fetch("cookie", privateMode, engines[1]);
  Assert.equal(result.local.length, 0, "Should have no local suggestions");
  Assert.equal(result.remote.length, 0, "Should have no remote suggestions");
  Assert.equal(await countCacheEntries(), 0, "The cache should be empty");
  Assert.equal(await countCookieEntries(), 0, "Should not find any cookie");

  let firstPartyDomain1 = controller.firstPartyDomains.get(engines[0].name);
  Assert.ok(
    /^[\.a-z0-9-]+\.search\.suggestions\.mozilla/.test(firstPartyDomain1),
    "Check firstPartyDomain1"
  );

  let firstPartyDomain2 = controller.firstPartyDomains.get(engines[1].name);
  Assert.ok(
    /^[\.a-z0-9-]+\.search\.suggestions\.mozilla/.test(firstPartyDomain2),
    "Check firstPartyDomain2"
  );

  Assert.notEqual(
    firstPartyDomain1,
    firstPartyDomain2,
    "Check firstPartyDomain id unique per engine"
  );
}
