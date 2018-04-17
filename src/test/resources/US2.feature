Feature: Search on the contact list available on the COS Landing Page
  As a user
  I want to search on the contact list available on the landing page
  So that I can filter the list of the contacts available

    #Nuno
  Scenario: Search List With Existing User Name
    Given the search field is filled out with "Joao"
    Then the list should display 3 contacts

    #Joao
  Scenario: Search List With Non Existing User Name
    Given the search field is filled out with "Augusto"
    Then the list should display the "No matching records found" message