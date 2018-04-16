Feature: Contacts List

  Scenario: Website Running
    Given the user is on localhost:8080
    Then the page title should start with "Contacts Orchestrator Solution"

  Scenario: List Filled
    Given the contacts list screen is displayed
    Then the "CONTACTS LIST" sub title should be displayed
    And the list results should be equal to 10

  Scenario: List Empty
    Given the web service returns an empty array
    Then the "No contacts" message should be displayed

  Scenario: Search List With Existing User
    Given the search field is filled out with "Joao"
    Then the list should display 3 contacts

  Scenario: Search List With Non Existing User
    Given the search field is filled out with "Augusto"
    Then the list should display the "No matching records found" message

  Scenario: Change results per page
    Given the user is on the Contacts List
    When the user changes the number of results to 25
    Then the contacts list should display 25 results in the current page
    And the number of results message should contain "Showing 1 to 25"

  Scenario: Sort list by name ascending order
    Given the user is on the Contacts List
    When the user clicks on the name sort parameter
    Then the contacts list should be sorted by name in ascending order
    And the first result on the list should be "Alex Azevedo"

  Scenario: Sort list by name descending order
    Given the user is on the Contacts List
    When the user clicks twice on the name sort parameter
    Then the contacts list should be sorted by name in descending order
    And the first result on the list should be "Yasmin Barbosa"

  Scenario: Change list page
    Given the user is on the first page
    And the first result is "Joao Santos"
    And the page 1 button is active
    When the user clicks on page number 2
    Then the first result should be different than "Joao Santos"
    And the page 2 button should be active

  Scenario: Change list page to middle
    Given the user is on page 5
    Then the "previous page" button should be enabled
    And the "next page" button should be enabled

  Scenario: First page previous button lock
    Given the user is on the first page
    Then the "previous page" button should be disabled

  Scenario: Last page next button lock
    Given the user is on the last page
    Then the "next page" button should be disabled

  Scenario: Click on contact details
    Given the user is on contacts list
    When the user clicks on the "Open" option of the first result
    Then the first result contact details page should be displayed
    And the GUID and Name fields should match the first list result on the contacts list screen
