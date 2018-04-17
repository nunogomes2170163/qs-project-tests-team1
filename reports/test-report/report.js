$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("US1.feature");
formatter.feature({
  "line": 1,
  "name": "Access to the Contacts Orchestrator Solution\u0027s (COS) Landing Page",
  "description": "As a user\r\nI want to access to the URL address provided for the landing page\r\nSo that I can see the list of the contacts available",
  "id": "access-to-the-contacts-orchestrator-solution\u0027s-(cos)-landing-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3801793312,
  "status": "passed"
});
formatter.before({
  "duration": 1648045648,
  "status": "passed"
});
formatter.before({
  "duration": 2443685480,
  "status": "passed"
});
formatter.before({
  "duration": 2864488503,
  "status": "passed"
});
formatter.before({
  "duration": 2398718104,
  "status": "passed"
});
formatter.before({
  "duration": 2582884908,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Nuno"
    }
  ],
  "line": 7,
  "name": "Landing page\u0027s title and text contains \"Contacts Orchestrator Solution\"",
  "description": "",
  "id": "access-to-the-contacts-orchestrator-solution\u0027s-(cos)-landing-page;landing-page\u0027s-title-and-text-contains-\"contacts-orchestrator-solution\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I access the landing page of COS",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the title of the page should be \"Contacts Orchestrator Solution\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I can see the text \"Contacts Orchestrator Solution\"",
  "keyword": "And "
});
formatter.match({
  "location": "US1StepsDef.iAccessTheLandingPageOfCOS()"
});
formatter.result({
  "duration": 1848960756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contacts Orchestrator Solution",
      "offset": 33
    }
  ],
  "location": "US1StepsDef.theTitleOfThePageShouldBe(String)"
});
formatter.result({
  "duration": 10544500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contacts Orchestrator Solution",
      "offset": 20
    }
  ],
  "location": "US1StepsDef.iCanSeeTheText(String)"
});
formatter.result({
  "duration": 125581105,
  "status": "passed"
});
formatter.after({
  "duration": 4202484,
  "status": "passed"
});
formatter.after({
  "duration": 18021740,
  "status": "passed"
});
formatter.after({
  "duration": 3898712,
  "status": "passed"
});
formatter.after({
  "duration": 3627031,
  "status": "passed"
});
formatter.after({
  "duration": 5006586,
  "status": "passed"
});
formatter.after({
  "duration": 4011031,
  "status": "passed"
});
formatter.before({
  "duration": 2189852775,
  "status": "passed"
});
formatter.before({
  "duration": 1618757357,
  "status": "passed"
});
formatter.before({
  "duration": 2821545058,
  "status": "passed"
});
formatter.before({
  "duration": 3636364101,
  "status": "passed"
});
formatter.before({
  "duration": 3076632236,
  "status": "passed"
});
formatter.before({
  "duration": 2543518533,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#Joao"
    }
  ],
  "line": 13,
  "name": "Landing page\u0027s sub title and the contact list should contain 10 results",
  "description": "",
  "id": "access-to-the-contacts-orchestrator-solution\u0027s-(cos)-landing-page;landing-page\u0027s-sub-title-and-the-contact-list-should-contain-10-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I access the landing page of COS",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the sub title of the page should be \"CONTACTS LIST\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the contact list should show 10 results",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the number of results message should be \"Showing 1 to 10 of 200 entries\"",
  "keyword": "And "
});
formatter.match({
  "location": "US1StepsDef.iAccessTheLandingPageOfCOS()"
});
formatter.result({
  "duration": 1736021017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CONTACTS LIST",
      "offset": 37
    }
  ],
  "location": "US1StepsDef.theSubTitleOfThePageShouldBe(String)"
});
formatter.result({
  "duration": 15037992,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 29
    }
  ],
  "location": "US1StepsDef.theContactListShouldShowResults(int)"
});
formatter.result({
  "duration": 19259803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Showing 1 to 10 of 200 entries",
      "offset": 41
    }
  ],
  "location": "US2StepsDef.theNumberOfResultsMessageShouldBe(String)"
});
formatter.result({
  "duration": 23242754,
  "error_message": "java.lang.AssertionError: expected:\u003c[[PhantomJSDriver: phantomjs on XP (80dda5a0-4270-11e8-b465-e59469282002)] -\u003e xpath: //div[@id\u003d\u0027contacts_info\u0027]]\u003e but was:\u003cShowing 1 to 10 of 200 entries\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat US2StepsDef.theNumberOfResultsMessageShouldBe(US2StepsDef.java:52)\r\n\tat ✽.And the number of results message should be \"Showing 1 to 10 of 200 entries\"(US1.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 3615726,
  "status": "passed"
});
formatter.after({
  "duration": 13937410,
  "status": "passed"
});
formatter.after({
  "duration": 15158333,
  "status": "passed"
});
formatter.after({
  "duration": 3884125,
  "status": "passed"
});
formatter.after({
  "duration": 4067190,
  "status": "passed"
});
formatter.after({
  "duration": 3779464,
  "status": "passed"
});
formatter.before({
  "duration": 2271774947,
  "status": "passed"
});
formatter.before({
  "duration": 1601318363,
  "status": "passed"
});
