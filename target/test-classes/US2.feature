Feature: Search on the contact list available on the COS Landing Page
  As a user
  I want to search on the contact list available on the landing page
  So that I can filter the list of the contacts available

  Scenario: Search List With Existing User Name
    Given the user is on the COS landing page - US2
    When the search field is filled out with "Joao"
    Then the list should display 4 contacts
    And the column Name of the results must contain "Joao"
    And the number of results message should be "Showing 1 to 4 of 4 entries (filtered from 217 total entries)" - US2


  Scenario: Search List With Non Existing User Name
    Given the user is on the COS landing page - US2
    When the search field is filled out with "Augusto"
    Then the list should display the "No matching records found" message
    And the number of results message should be "Showing 0 to 0 of 0 entries (filtered from 217 total entries)" - US2
