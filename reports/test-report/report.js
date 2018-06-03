$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("US9.feature");
formatter.feature({
  "line": 1,
  "name": "Resolve a detected conflict and merge the selected information in one contact or dismiss conflicts if not related",
  "description": "As a user\nI want to be able to merge information on the conflicts detected or to be able to dismiss a conflict because it is not related with the conflict\nSo that I can export the information later in the csv file",
  "id": "resolve-a-detected-conflict-and-merge-the-selected-information-in-one-contact-or-dismiss-conflicts-if-not-related",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2136171900,
  "status": "passed"
});
formatter.before({
  "duration": 992516847,
  "status": "passed"
});
formatter.before({
  "duration": 993226780,
  "status": "passed"
});
formatter.before({
  "duration": 994554119,
  "status": "passed"
});
formatter.before({
  "duration": 1960483576,
  "status": "passed"
});
formatter.before({
  "duration": 1317902141,
  "status": "passed"
});
formatter.before({
  "duration": 997766561,
  "status": "passed"
});
formatter.before({
  "duration": 1000241794,
  "status": "passed"
});
formatter.before({
  "duration": 990503992,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Removing one contact from single conflict page",
  "description": "",
  "id": "resolve-a-detected-conflict-and-merge-the-selected-information-in-one-contact-or-dismiss-conflicts-if-not-related;removing-one-contact-from-single-conflict-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the user is on the \"RESOLVE SINGLE CONFLICT\" of the users with GUIDs \"d47f5d81-5376-4b2d-a3a3-7ec92qw246f8|d47f5d81-5376-4b2d-a3a3-7ec92qw246qw|0e7b141f-11f8-4dcb-b78d-d7aa71160fa3\" US91",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the remove button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "there should be presented only two columns",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "the remove button on each one of the columns should not be displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "RESOLVE SINGLE CONFLICT",
      "offset": 20
    },
    {
      "val": "d47f5d81-5376-4b2d-a3a3-7ec92qw246f8|d47f5d81-5376-4b2d-a3a3-7ec92qw246qw|0e7b141f-11f8-4dcb-b78d-d7aa71160fa3",
      "offset": 70
    }
  ],
  "location": "US9StepsDef.theUserIsOnResolveSingleConflictPageWithThreeConflicts(String,String)"
});
formatter.result({
  "duration": 2969690659,
  "status": "passed"
});
formatter.match({
  "location": "US9StepsDef.userClicksRemove()"
});
formatter.result({
  "duration": 57569385,
  "status": "passed"
});
formatter.match({
  "location": "US9StepsDef.thereShouldOnlyBeTwoColumns()"
});
formatter.result({
  "duration": 13234793,
  "error_message": "java.lang.AssertionError: expected:\u003c2\u003e but was:\u003c3\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:645)\n\tat org.junit.Assert.assertEquals(Assert.java:631)\n\tat US9StepsDef.thereShouldOnlyBeTwoColumns(US9StepsDef.java:145)\n\tat ✽.Then there should be presented only two columns(US9.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "US9StepsDef.theRemoveButtonShouldNotBeDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 95402818,
  "status": "passed"
});
formatter.after({
  "duration": 1077050803,
  "status": "passed"
});
formatter.after({
  "duration": 1070648824,
  "status": "passed"
});
formatter.after({
  "duration": 289165181,
  "status": "passed"
});
formatter.after({
  "duration": 575032911,
  "status": "passed"
});
formatter.after({
  "duration": 43841688,
  "status": "passed"
});
formatter.after({
  "duration": 91791995,
  "status": "passed"
});
formatter.after({
  "duration": 42238395,
  "status": "passed"
});
formatter.after({
  "duration": 40291738,
  "status": "passed"
});
formatter.before({
  "duration": 1317603110,
  "status": "passed"
});
formatter.before({
  "duration": 1326545138,
  "status": "passed"
});
formatter.before({
  "duration": 992707085,
  "status": "passed"
});
formatter.before({
  "duration": 993563798,
  "status": "passed"
});
formatter.before({
  "duration": 995648542,
  "status": "passed"
});
formatter.before({
  "duration": 991065737,
  "status": "passed"
});
formatter.before({
  "duration": 996090403,
  "status": "passed"
});
formatter.before({
  "duration": 1319986481,
  "status": "passed"
});
formatter.before({
  "duration": 1645342831,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Resolve a contact conflict with two contacts",
  "description": "",
  "id": "resolve-a-detected-conflict-and-merge-the-selected-information-in-one-contact-or-dismiss-conflicts-if-not-related;resolve-a-contact-conflict-with-two-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "the user is on the \"RESOLVE SINGLE CONFLICT\" of the users with GUIDs \"d4f8d88d-afe1-4c63-821a-27as83d6bb49%7Cd4f8d88d-afe1-4c63-821a-278883d6bb49\" US9",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user clicks on the save button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the \"CONTACT CONFLICTS\" page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "all the conflicts related to the previous contacts should not appear on any of the columns",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "RESOLVE SINGLE CONFLICT",
      "offset": 20
    },
    {
      "val": "d4f8d88d-afe1-4c63-821a-27as83d6bb49%7Cd4f8d88d-afe1-4c63-821a-278883d6bb49",
      "offset": 70
    }
  ],
  "location": "US9StepsDef.theUserIsOnResolveSingleConflictPage(String,String)"
});
formatter.result({
  "duration": 286648629,
  "status": "passed"
});
formatter.match({
  "location": "US9StepsDef.theUserSaves()"
});
formatter.result({
  "duration": 68772164,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CONTACT CONFLICTS",
      "offset": 5
    }
  ],
  "location": "US9StepsDef.thePreviousPageShouldBeDisplayed(String)"
});
formatter.result({
  "duration": 3100200748,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for text (\u0027CONTACT CONFLICTS\u0027) to be present in element [[PhantomJSDriver: phantomjs on MAC (e9fd3da0-675c-11e8-8c9f-37c61332aaa3)] -\u003e xpath: //h2] (tried for 3 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027MBP-de-David\u0027, ip: \u00272001:8a0:f203:c00:4b4:da89:e031:b6bb\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.4\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.phantomjs.PhantomJSDriver\nCapabilities {acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: phantomjs, cssSelectorsEnabled: true, databaseEnabled: false, driverName: ghostdriver, driverVersion: 1.2.0, handlesAlerts: false, javascriptEnabled: true, locationContextEnabled: false, nativeEvents: true, platform: MAC, platformName: MAC, proxy: Proxy(direct), rotatable: false, takesScreenshot: true, version: 2.1.1, webStorageEnabled: false}\nSession ID: e9fd3da0-675c-11e8-8c9f-37c61332aaa3\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\n\tat US9StepsDef.thePreviousPageShouldBeDisplayed(US9StepsDef.java:158)\n\tat ✽.Then the \"CONTACT CONFLICTS\" page should be displayed(US9.feature:17)\n",
  "status": "failed"
});
formatter.match({
  "location": "US9StepsDef.allConflictsShouldBeResolved()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 47148420,
  "status": "passed"
});
formatter.after({
  "duration": 38154135,
  "status": "passed"
});
formatter.after({
  "duration": 598855198,
  "status": "passed"
});
formatter.after({
  "duration": 426764258,
  "status": "passed"
});
formatter.after({
  "duration": 61830864,
  "status": "passed"
});
formatter.after({
  "duration": 49158102,
  "status": "passed"
});
formatter.after({
  "duration": 99923300,
  "status": "passed"
});
formatter.after({
  "duration": 39610699,
  "status": "passed"
});
formatter.after({
  "duration": 88941653,
  "status": "passed"
});
});