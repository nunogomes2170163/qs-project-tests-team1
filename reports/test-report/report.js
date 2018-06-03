$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("US7.feature");
formatter.feature({
  "line": 1,
  "name": "Filtering the source of contacts",
  "description": "As a user\r\nI want to be able to filter the contacts list by source\r\nSo that i can see contacts from a source at a time",
  "id": "filtering-the-source-of-contacts",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2466756619,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Landing page\u0027s sub tittle and contact list contains both source of contacts",
  "description": "",
  "id": "filtering-the-source-of-contacts;landing-page\u0027s-sub-tittle-and-contact-list-contains-both-source-of-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the contact list must display contacts from both sources",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 37
    }
  ],
  "location": "US7StepsDef.iAccessTheLandingPageOfCOSUS(int)"
});
formatter.result({
  "duration": 2828543296,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 46056339,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.theContactListMustDisplayContactsFromBothSources()"
});
formatter.result({
  "duration": 2008342617,
  "status": "passed"
});
formatter.after({
  "duration": 532388588,
  "status": "passed"
});
formatter.before({
  "duration": 1646843302,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Landing page\u0027s sub tittle and contact list should not contain from Skype and Twitter sources",
  "description": "",
  "id": "filtering-the-source-of-contacts;landing-page\u0027s-sub-tittle-and-contact-list-should-not-contain-from-skype-and-twitter-sources",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Facebook and Linkedin switches are not enabled",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the \"No matching records found\" message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 37
    }
  ],
  "location": "US7StepsDef.iAccessTheLandingPageOfCOSUS(int)"
});
formatter.result({
  "duration": 2657249967,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreNotEnabled()"
});
formatter.result({
  "duration": 148891121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No matching records found",
      "offset": 5
    }
  ],
  "location": "US7StepsDef.theMessageShouldBeDisplayed(String)"
});
formatter.result({
  "duration": 30968005,
  "status": "passed"
});
formatter.after({
  "duration": 541817200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Filtering source of contacts by Facebook and LinkedIn",
  "description": "",
  "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I turn \"\u003cfilter\u003e\" switch off",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The contacts list should not display results with the \"\u003cfilter\u003e\" source",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin;",
  "rows": [
    {
      "cells": [
        "filter"
      ],
      "line": 22,
      "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin;;1"
    },
    {
      "cells": [
        "LinkedIn"
      ],
      "line": 23,
      "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin;;2"
    },
    {
      "cells": [
        "Facebook"
      ],
      "line": 24,
      "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1627220993,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Filtering source of contacts by Facebook and LinkedIn",
  "description": "",
  "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I turn \"LinkedIn\" switch off",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The contacts list should not display results with the \"LinkedIn\" source",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 37
    }
  ],
  "location": "US7StepsDef.iAccessTheLandingPageOfCOSUS(int)"
});
formatter.result({
  "duration": 2934221433,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 41956323,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LinkedIn",
      "offset": 8
    }
  ],
  "location": "US7StepsDef.iTurnSwitchOff(String)"
});
formatter.result({
  "duration": 72531940,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LinkedIn",
      "offset": 55
    }
  ],
  "location": "US7StepsDef.theContactsListShouldNotDisplayResultsWithTheSource(String)"
});
formatter.result({
  "duration": 1093802570,
  "status": "passed"
});
formatter.after({
  "duration": 528998955,
  "status": "passed"
});
formatter.before({
  "duration": 1646210959,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Filtering source of contacts by Facebook and LinkedIn",
  "description": "",
  "id": "filtering-the-source-of-contacts;filtering-source-of-contacts-by-facebook-and-linkedin;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I turn \"Facebook\" switch off",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The contacts list should not display results with the \"Facebook\" source",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 37
    }
  ],
  "location": "US7StepsDef.iAccessTheLandingPageOfCOSUS(int)"
});
formatter.result({
  "duration": 3061474336,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 70352292,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 8
    }
  ],
  "location": "US7StepsDef.iTurnSwitchOff(String)"
});
formatter.result({
  "duration": 87180478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 55
    }
  ],
  "location": "US7StepsDef.theContactsListShouldNotDisplayResultsWithTheSource(String)"
});
formatter.result({
  "duration": 1474523418,
  "status": "passed"
});
formatter.after({
  "duration": 540098133,
  "status": "passed"
});
});