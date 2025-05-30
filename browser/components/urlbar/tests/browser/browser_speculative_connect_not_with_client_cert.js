/* eslint-disable mozilla/no-arbitrary-setTimeout */
/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

"use strict";

// Tests that we don't speculatively connect when user certificates are installed

const { MockRegistrar } = ChromeUtils.importESModule(
  "resource://testing-common/MockRegistrar.sys.mjs"
);

const certOverrideService = Cc[
  "@mozilla.org/security/certoverride;1"
].getService(Ci.nsICertOverrideService);

const host = "localhost";
let uri;
let handshakeDone = false;
let expectingChooseCertificate = false;
let chooseCertificateCalled = false;

const clientAuthDialogService = {
  chooseCertificate(hostname, certArray, loadContext, caNames, callback) {
    ok(
      expectingChooseCertificate,
      `${
        expectingChooseCertificate ? "" : "not "
      }expecting chooseCertificate to be called`
    );
    is(
      certArray.length,
      1,
      "should have only one client certificate available"
    );
    ok(
      !chooseCertificateCalled,
      "chooseCertificate should only be called once"
    );
    chooseCertificateCalled = true;
    callback.certificateChosen(certArray[0], false);
  },

  QueryInterface: ChromeUtils.generateQI(["nsIClientAuthDialogService"]),
};

/**
 * A helper class to use with nsITLSServerConnectionInfo.setSecurityObserver.
 * Implements nsITLSServerSecurityObserver and simulates an extremely
 * rudimentary HTTP server that expects an HTTP/1.1 GET request and responds
 * with a 200 OK.
 */
class SecurityObserver {
  constructor(input, output) {
    this.input = input;
    this.output = output;
  }

  onHandshakeDone() {
    info("TLS handshake done");
    handshakeDone = true;

    let output = this.output;
    this.input.asyncWait(
      {
        onInputStreamReady(readyInput) {
          try {
            let request = NetUtil.readInputStreamToString(
              readyInput,
              readyInput.available()
            );
            ok(
              request.startsWith("GET /") && request.includes("HTTP/1.1"),
              "expecting an HTTP/1.1 GET request"
            );
            let response =
              "HTTP/1.1 200 OK\r\nContent-Type:text/plain\r\n" +
              "Connection:Close\r\nContent-Length:2\r\n\r\nOK";
            output.write(response, response.length);
          } catch (e) {
            console.log(e.message);
            // This will fail when we close the speculative connection.
          }
        },
      },
      0,
      0,
      Services.tm.currentThread
    );
  }
}

function startServer(cert) {
  let tlsServer = Cc["@mozilla.org/network/tls-server-socket;1"].createInstance(
    Ci.nsITLSServerSocket
  );
  tlsServer.init(-1, true, -1);
  tlsServer.serverCert = cert;

  let securityObservers = [];

  let listener = {
    onSocketAccepted(socket, transport) {
      info("Accepted TLS client connection");
      let connectionInfo = transport.securityCallbacks.getInterface(
        Ci.nsITLSServerConnectionInfo
      );
      let input = transport.openInputStream(0, 0, 0);
      let output = transport.openOutputStream(0, 0, 0);
      connectionInfo.setSecurityObserver(new SecurityObserver(input, output));
    },

    onStopListening() {
      info("onStopListening");
      for (let securityObserver of securityObservers) {
        securityObserver.input.close();
        securityObserver.output.close();
      }
    },
  };

  tlsServer.setSessionTickets(false);
  tlsServer.setRequestClientCertificate(Ci.nsITLSServerSocket.REQUEST_ALWAYS);

  tlsServer.asyncListen(listener);

  return tlsServer;
}

let server;

function getTestServerCertificate() {
  const certDB = Cc["@mozilla.org/security/x509certdb;1"].getService(
    Ci.nsIX509CertDB
  );
  for (const cert of certDB.getCerts()) {
    if (cert.commonName == "Mochitest client") {
      return cert;
    }
  }
  return null;
}

add_setup(async function () {
  await SpecialPowers.pushPrefEnv({
    set: [
      ["browser.urlbar.autoFill", true],
      // Turn off search suggestion so we won't speculative connect to the search engine.
      ["browser.search.suggest.enabled", false],
      ["browser.urlbar.speculativeConnect.enabled", true],
      // In mochitest this number is 0 by default but we have to turn it on.
      ["network.http.speculative-parallel-limit", 6],
      // The http server is using IPv4, so it's better to disable IPv6 to avoid weird
      // networking problem.
      ["network.dns.disableIPv6", true],
      ["security.default_personal_cert", "Ask Every Time"],
    ],
  });

  let clientAuthDialogServiceCID = MockRegistrar.register(
    "@mozilla.org/security/ClientAuthDialogService;1",
    clientAuthDialogService
  );

  let cert = getTestServerCertificate();
  server = startServer(cert);
  uri = `https://${host}:${server.port}/`;
  info(`running tls server at ${uri}`);
  await PlacesTestUtils.addVisits([
    {
      uri,
      title: "test visit for speculative connection",
      transition: Ci.nsINavHistoryService.TRANSITION_TYPED,
    },
  ]);

  certOverrideService.rememberValidityOverride(
    "localhost",
    server.port,
    {},
    cert,
    true
  );

  registerCleanupFunction(async function () {
    await PlacesUtils.history.clear();
    MockRegistrar.unregister(clientAuthDialogServiceCID);
    certOverrideService.clearValidityOverride("localhost", server.port, {});
  });
});

add_task(
  async function popup_mousedown_no_client_cert_dialog_until_navigate_test() {
    // To not trigger autofill, search keyword starts from the second character.
    let searchString = host.substr(1, 4);
    let completeValue = uri;
    info(`Searching for '${searchString}'`);
    await UrlbarTestUtils.promiseAutocompleteResultPopup({
      window,
      value: searchString,
      fireInputEvent: true,
    });
    let listitem = await UrlbarTestUtils.waitForAutocompleteResultAt(window, 1);
    let details = await UrlbarTestUtils.getDetailsOfResultAt(window, 1);
    info(`The url of the second item is ${details.url}`);
    is(details.url, completeValue, "The second item has the url we visited.");

    expectingChooseCertificate = false;
    EventUtils.synthesizeMouseAtCenter(listitem, { type: "mousedown" }, window);
    is(
      UrlbarTestUtils.getSelectedRow(window),
      listitem,
      "The second item is selected"
    );

    // We shouldn't have triggered a speculative connection, because a client
    // certificate is installed.
    SimpleTest.requestFlakyTimeout("Wait for UI");
    await new Promise(resolve => setTimeout(resolve, 200));

    // Now mouseup, expect that we choose a client certificate, and expect that
    // we successfully load a page.
    expectingChooseCertificate = true;
    EventUtils.synthesizeMouseAtCenter(listitem, { type: "mouseup" }, window);
    await BrowserTestUtils.browserLoaded(gBrowser.selectedBrowser);
    ok(chooseCertificateCalled, "chooseCertificate must have been called");
    server.close();
  }
);
