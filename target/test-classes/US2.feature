Feature: Search on the contact list available on the COS Landing Page
  As a user
  I want to search on the contact list available on the landing page
  So that I can filter the list of the contacts available

    #Nuno
  Scenario: Search List With Existing User Name
    Given the user is on the COS landing page - US2
    When the search field is filled out with "Joao"
    Then the list should display 3 contacts
    And the column Name of the results must contain "Joao"
    And the number of results message should be "Showing 1 to 3 of 3 entries (filtered from 200 total entries)" - US2

    #Joao
  Scenario: Search List With Non Existing User Name
    Given the user is on the COS landing page - US2
    When the search field is filled out with "Augusto"
    Then the list should display the "No matching records found" message
    And the number of results message should be "Showing 0 to 0 of 0 entries (filtered from 200 total entries)" - US2
