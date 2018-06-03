$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("US7.feature");
formatter.feature({
  "line": 1,
  "name": "Filtering the source of contacts",
  "description": "As a user\r\nI want to be able to filter the contacts list by source\r\nSo that i can see contacts from a source at a time",
  "id": "filtering-the-source-of-contacts",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2415045667,
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
  "duration": 3231945328,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 54892357,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.theContactListMustDisplayContactsFromBothSources()"
});
formatter.result({
  "duration": 2057782753,
  "status": "passed"
});
formatter.after({
  "duration": 535249810,
  "status": "passed"
});
formatter.before({
  "duration": 1615769906,
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
  "duration": 2722883394,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreNotEnabled()"
});
formatter.result({
  "duration": 152484607,
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
  "duration": 39406896,
  "status": "passed"
});
formatter.after({
  "duration": 529949292,
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
  "duration": 1624759817,
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
  "duration": 2617417132,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 44680792,
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
  "duration": 72876557,
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
  "duration": 1216599172,
  "status": "passed"
});
formatter.after({
  "duration": 540870875,
  "status": "passed"
});
formatter.before({
  "duration": 1600176501,
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
  "duration": 2988310417,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 47250641,
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
  "duration": 70914618,
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
  "duration": 1599512068,
  "status": "passed"
});
formatter.after({
  "duration": 543540279,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 26,
      "value": "# This test is commented because it appears that when the web driver changes pages the values stored on session are not maintained,"
    },
    {
      "line": 27,
      "value": "# which makes it impossible to run this test automatically. Therefore, this scenario will tested manually. Even so, the code for"
    },
    {
      "line": 28,
      "value": "# the steps is already in case someday the web driver maintains session variables between pages."
    }
  ],
  "line": 29,
  "name": "Keep Facebook or LinkedIn filtering options on session",
  "description": "",
  "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I turn \"\u003cfilter\u003e\" switch off",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Go to resolve conflicts page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Return to landing page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "The \"\u003cfilter\u003e\" switch must still be off",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "The contacts list should not display results with the \"\u003cfilter\u003e\" source",
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session;",
  "rows": [
    {
      "cells": [
        "filter"
      ],
      "line": 38,
      "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session;;1"
    },
    {
      "cells": [
        "LinkedIn"
      ],
      "line": 39,
      "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session;;2"
    },
    {
      "cells": [
        "Facebook"
      ],
      "line": 40,
      "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1632246548,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Keep Facebook or LinkedIn filtering options on session",
  "description": "",
  "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I turn \"LinkedIn\" switch off",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Go to resolve conflicts page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Return to landing page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "The \"LinkedIn\" switch must still be off",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "The contacts list should not display results with the \"LinkedIn\" source",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
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
  "duration": 2939739295,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 43208610,
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
  "duration": 66350009,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.goToResolveConflictsPage()"
});
formatter.result({
  "duration": 1080082854,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.returnToLandingPage()"
});
formatter.result({
  "duration": 677643193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LinkedIn",
      "offset": 5
    }
  ],
  "location": "US7StepsDef.theSwitchMustStillBeOff(String)"
});
formatter.result({
  "duration": 89220822,
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
  "duration": 1167303081,
  "status": "passed"
});
formatter.after({
  "duration": 536032398,
  "status": "passed"
});
formatter.before({
  "duration": 1607207392,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Keep Facebook or LinkedIn filtering options on session",
  "description": "",
  "id": "filtering-the-source-of-contacts;keep-facebook-or-linkedin-filtering-options-on-session;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I turn \"Facebook\" switch off",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Go to resolve conflicts page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Return to landing page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "The \"Facebook\" switch must still be off",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "The contacts list should not display results with the \"Facebook\" source",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
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
  "duration": 2912770655,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 43648405,
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
  "duration": 75266256,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.goToResolveConflictsPage()"
});
formatter.result({
  "duration": 1192951606,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.returnToLandingPage()"
});
formatter.result({
  "duration": 691484710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook",
      "offset": 5
    }
  ],
  "location": "US7StepsDef.theSwitchMustStillBeOff(String)"
});
formatter.result({
  "duration": 90975263,
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
  "duration": 1538744468,
  "status": "passed"
});
formatter.after({
  "duration": 532698924,
  "status": "passed"
});
formatter.before({
  "duration": 1606812816,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 42,
      "value": "# This test is commented because it appears that when the web driver changes pages the values stored on session are not maintained,"
    },
    {
      "line": 43,
      "value": "# which makes it impossible to run this test automatically. Therefore, this scenario will tested manually. Even so, the code for"
    },
    {
      "line": 44,
      "value": "# the steps is already in case someday the web driver maintains session variables between pages."
    }
  ],
  "line": 45,
  "name": "Keep both Facebook and LinkedIn filtering options on session at the same time",
  "description": "",
  "id": "filtering-the-source-of-contacts;keep-both-facebook-and-linkedin-filtering-options-on-session-at-the-same-time",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "I access the landing page of COS - US7",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "Facebook and Linkedin switches are enabled",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I turn both Facebook and LinkedIn switches off",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Go to resolve conflicts page",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Return to landing page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Both Facebook and LinkedIn switches must still be off",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "the \"No matching records found\" message should be displayed",
  "keyword": "And "
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
  "duration": 3179560460,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.facebookAndLinkedinSwitchesAreEnabled()"
});
formatter.result({
  "duration": 43097019,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.iTurnBothFacebookAndLinkedInSwitchesOff()"
});
formatter.result({
  "duration": 130254159,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.goToResolveConflictsPage()"
});
formatter.result({
  "duration": 1197154824,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.returnToLandingPage()"
});
formatter.result({
  "duration": 694803961,
  "status": "passed"
});
formatter.match({
  "location": "US7StepsDef.bothFacebookAndLinkedInSwitchesMustStillBeOff()"
});
formatter.result({
  "duration": 81607915,
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
  "duration": 25172991,
  "status": "passed"
});
formatter.after({
  "duration": 531434604,
  "status": "passed"
});
});