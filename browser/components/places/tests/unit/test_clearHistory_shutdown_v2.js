/* -*- indent-tabs-mode: nil; js-indent-level: 2 -*- */
/* vim:set ts=2 sw=2 sts=2 et: */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

/**
 * Tests that requesting clear history at shutdown will really clear history.
 */

const URIS = [
  "http://a.example1.com/",
  "http://b.example1.com/",
  "http://b.example2.com/",
  "http://c.example3.com/",
];

const FTP_URL = "ftp://localhost/clearHistoryOnShutdown/";

const { Sanitizer } = ChromeUtils.importESModule(
  "resource:///modules/Sanitizer.sys.mjs"
);

// Send the profile-after-change notification to the form history component to ensure
// that it has been initialized.
var formHistoryStartup = Cc[
  "@mozilla.org/satchel/form-history-startup;1"
].getService(Ci.nsIObserver);
formHistoryStartup.observe(null, "profile-after-change", null);
ChromeUtils.defineESModuleGetters(this, {
  FormHistory: "resource://gre/modules/FormHistory.sys.mjs",
});

var timeInMicroseconds = Date.now() * 1000;

add_task(async function test_execute() {
  info("Avoiding full places initialization importing default bookmarks.");
  let { PlacesBrowserStartup } = ChromeUtils.importESModule(
    "moz-src:///browser/components/places/PlacesBrowserStartup.sys.mjs"
  );
  PlacesBrowserStartup.willImportDefaultBookmarks();

  Sanitizer.onStartup();

  Services.prefs.setBoolPref(Sanitizer.PREF_SHUTDOWN_BRANCH + "cache", true);
  Services.prefs.setBoolPref(
    Sanitizer.PREF_SHUTDOWN_BRANCH + "cookiesAndStorage",
    true
  );
  Services.prefs.setBoolPref(
    Sanitizer.PREF_SHUTDOWN_BRANCH + "browsingHistoryAndDownloads",
    true
  );
  Services.prefs.setBoolPref(Sanitizer.PREF_SHUTDOWN_BRANCH + "formdata", true);
  Services.prefs.setBoolPref(
    Sanitizer.PREF_SHUTDOWN_BRANCH + "cookiesAndStorage",
    true
  );
  Services.prefs.setBoolPref(
    Sanitizer.PREF_SHUTDOWN_BRANCH + "siteSettings",
    true
  );

  Services.prefs.setBoolPref(Sanitizer.PREF_SANITIZE_ON_SHUTDOWN, true);

  info("Add visits.");
  for (let aUrl of URIS) {
    await PlacesTestUtils.addVisits({
      uri: uri(aUrl),
      visitDate: timeInMicroseconds++,
      transition: PlacesUtils.history.TRANSITION_TYPED,
    });
  }
  info("Add cache.");
  await storeCache(FTP_URL, "testData");
  info("Add form history.");
  await addFormHistory();
  Assert.equal(await getFormHistoryCount(), 1, "Added form history");

  info("Simulate and wait shutdown.");
  await shutdownPlaces();

  Assert.equal(await getFormHistoryCount(), 0, "Form history cleared");

  let stmt = DBConn(true).createStatement(
    "SELECT id FROM moz_places WHERE url = :page_url "
  );

  try {
    URIS.forEach(function (aUrl) {
      stmt.params.page_url = aUrl;
      Assert.ok(!stmt.executeStep());
      stmt.reset();
    });
  } finally {
    stmt.finalize();
  }

  info("Check cache");
  // Check cache.
  await checkCache(FTP_URL);
});

function addFormHistory() {
  let now = Date.now() * 1000;
  return FormHistory.update({
    op: "add",
    fieldname: "testfield",
    value: "test",
    timesUsed: 1,
    firstUsed: now,
    lastUsed: now,
  });
}

async function getFormHistoryCount() {
  return FormHistory.count({ fieldname: "testfield" });
}

function storeCache(aURL, aContent) {
  let cache = Services.cache2;
  let storage = cache.diskCacheStorage(Services.loadContextInfo.default);

  return new Promise(resolve => {
    let storeCacheListener = {
      onCacheEntryCheck() {
        return Ci.nsICacheEntryOpenCallback.ENTRY_WANTED;
      },

      onCacheEntryAvailable(entry, isnew, status) {
        Assert.equal(status, Cr.NS_OK);

        entry.setMetaDataElement("servertype", "0");
        var os = entry.openOutputStream(0, -1);

        var written = os.write(aContent, aContent.length);
        if (written != aContent.length) {
          do_throw(
            "os.write has not written all data!\n" +
              "  Expected: " +
              written +
              "\n" +
              "  Actual: " +
              aContent.length +
              "\n"
          );
        }
        os.close();
        resolve();
      },
    };

    storage.asyncOpenURI(
      Services.io.newURI(aURL),
      "",
      Ci.nsICacheStorage.OPEN_NORMALLY,
      storeCacheListener
    );
  });
}

function checkCache(aURL) {
  let cache = Services.cache2;
  let storage = cache.diskCacheStorage(Services.loadContextInfo.default);

  return new Promise(resolve => {
    let checkCacheListener = {
      onCacheEntryAvailable(entry, isnew, status) {
        Assert.equal(status, Cr.NS_ERROR_CACHE_KEY_NOT_FOUND);
        resolve();
      },
    };

    storage.asyncOpenURI(
      Services.io.newURI(aURL),
      "",
      Ci.nsICacheStorage.OPEN_READONLY,
      checkCacheListener
    );
  });
}
