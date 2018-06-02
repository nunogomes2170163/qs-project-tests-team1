Feature: Access to the Contacts Orchestrator Solution's (COS) Landing Page
  As a user
  I want to access to the URL address provided for the landing page
  So that I can see the list of the contacts available


  Scenario: Landing page's title and text contains "Contacts Orchestrator Solution"
    Given I access the landing page of COS
    Then the title of the page should be "Contacts Orchestrator Solution"
    And I can see the text "Contacts Orchestrator Solution"


  Scenario: Landing page's sub title and the contact list should contain 10 results
    Given I access the landing page of COS
    Then the sub title of the page should be "CONTACTS LIST"
    And the contact list should show 10 results
    And the number of results message should be "Showing 1 to 10 of 217 entries" - US1

    #
  Scenario: Landing page's sub tittle and contact list contains both source of contacts
    Given I access the landing page of COS
    When Facebook and Linkedin switches are enabled
    Then the contact list must display contacts from both sources

    #
  Scenario: Landing page's sub tittle and contact list should not contain from Skype and Twitter sources
    Given I access the landing page of COS
    When Facebook and Linkedin switches are not enabled
    Then the contact list should not contain contacts from Skype and Twitter sources

    #
  Scenario Outline: filtering
    Given I access the landing page of COS
    When I turn <filter> switch off
    Then The contacts list should not display results with the <filter> source
    Examples:
      | filter |
      |  LinkedIn   |
      |  Facebook   |