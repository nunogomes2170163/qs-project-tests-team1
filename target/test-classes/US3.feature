Feature: Change the number of results per page presented on the contact list available on the COS Landing Page
  As a user
  I want to change the number of results per page presented on the contact list available on the landing page
  So that I can see more or less contacts on each page of the contact list available

   #David
  Scenario: Change the number of results per page presented on the contact list available
    Given I access the landing page of COS
    When the user changes the number of results to 25
    Then the contact list should show 25 results in the current page
    And "Showing 1 to 25 of 200 entries" should be the message of results