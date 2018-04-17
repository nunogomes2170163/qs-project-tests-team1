Feature: Change the number of results per page presented on the contact list available on the COS Landing Page
  As a user
  I want to change the number of results per page presented on the contact list available on the landing page
  So that I can see more or less contacts on each page of the contact list available

   #David
  Scenario: Change the number of results per page presented on the contact list available
    #Given the user is on the Contacts List
    Given the user changes the number of results to 25
    Then the contacts list should display 25 results in the current page
    And the number of results message should contain "Showing 1 to 25"