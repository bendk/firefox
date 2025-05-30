/* Any copyright is dedicated to the Public Domain.
 * http://creativecommons.org/publicdomain/zero/1.0/
 */

"use strict";

const { EnterprisePolicyTesting } = ChromeUtils.importESModule(
  "resource://testing-common/EnterprisePolicyTesting.sys.mjs"
);

add_setup(function setup() {
  // Instantiate the enterprise policy service.
  void Cc["@mozilla.org/enterprisepolicies;1"].getService(Ci.nsIObserver);
});

add_task(async function testPolicyDisablesNimbus() {
  info("Enabling policy");
  await EnterprisePolicyTesting.setupPolicyEngineWithJson({
    policies: {
      DisableFirefoxStudies: true,
    },
  });

  info("Is policy engine active?");
  Assert.equal(
    Services.policies.status,
    Ci.nsIEnterprisePolicies.ACTIVE,
    "Policy engine is active"
  );

  const loader = NimbusTestUtils.stubs.rsLoader();
  const manager = loader.manager;
  await manager.store.init();
  await manager.onStartup();

  Assert.ok(!manager.studiesEnabled, "ExperimentManager is disabled");

  const setTimerStub = sinon.stub(loader, "setTimer");
  const updateRecipes = sinon.stub(loader, "updateRecipes");

  await loader.enable();

  Assert.ok(
    !loader._initialized,
    "RemoteSettingsExperimentLoader not initailized"
  );
  Assert.ok(
    setTimerStub.notCalled,
    "RemoteSettingsExperimentLoader not polling for recipes"
  );
  Assert.ok(
    updateRecipes.notCalled,
    "RemoteSettingsExperimentLoader not updating recipes after startup"
  );
});
