$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contacts_list.feature");
formatter.feature({
  "line": 1,
  "name": "Contacts List",
  "description": "",
  "id": "contacts-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1387882495,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Listing Contacts",
  "description": "",
  "id": "contacts-list;listing-contacts",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Contacts List page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the page title should start with \"Contacts Orchestrator Solution\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsContactsList.iAmOnTheContactsListPage()"
});
formatter.result({
  "duration": 1611340199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Contacts Orchestrator Solution",
      "offset": 34
    }
  ],
  "location": "StepDefsContactsList.thePageSubTitleShouldStartWith(String)"
});
formatter.result({
  "duration": 30764555,
  "status": "passed"
});
formatter.after({
  "duration": 2206151,
  "status": "passed"
});
});