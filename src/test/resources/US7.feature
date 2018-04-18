Feature: Return to the Contacts Orchestrator Solution's (COS) Landing Page after checking a details page
  As a user
  I want to return to the landing page after checking a details page
  So that I go back to the page where the list of the contacts available are presented

    #Joao
  Scenario: Return to COS landing page from a details page
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb" - US7
    When the user clicks on the "Back" button
    Then the "CONTACTS LIST" screen should be displayed