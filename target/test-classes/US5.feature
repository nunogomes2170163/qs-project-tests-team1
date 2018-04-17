Feature: Change between pages on the contact list available on the COS Landing Page
  As a user
  I want to change between pages on the contact list available on the landing page
  So that I can see results on different pages of the contact list available

    #David
  Scenario: Change contact list page
    Given the user is on the first page of the contact list
    And the first result is "Alex Azevedo"
    And the page 1 button is active
    When the user clicks on page number 2
    Then the first result should be different than "Joao Santos"
    And the page 2 button should be active

    #Nuno
  Scenario: Change contact list page to middle
    Given the user is on page 5 of the contact list available
    Then the "previous page" button should be enabled
    And the "next page" button should be enabled

    #Joao
  Scenario: First page of contact list previous button lock
    Given the user is on the first page of the contact list available
    Then the "previous page" button should be disabled

    #David
  Scenario: Last page of contact list next button lock
    Given the user is on the last page of the contact list available
    Then the "next page" button should be disabled
