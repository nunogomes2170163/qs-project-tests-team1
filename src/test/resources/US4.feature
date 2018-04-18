Feature: Sort the contact list available on the COS Landing Page by User Name
  As a user
  I want to sort the contact list available on the landing page by User Name
  So that I sort the list of the contacts available by User Name

    #Nuno
  Scenario: Sort list by name ascending order
    Given the user is on the COS landing page - US4
    When the user clicks twice on the name sort parameter
    Then the contacts list should be sorted by name in ascending order
    And the first result on the list should be "Alex Azevedo"

    #Joao
  Scenario: Sort list by name descending order
    Given the user is on the COS landing page - US4
    When the user clicks on the name sort parameter
    Then the contacts list should be sorted by name in descending order
    And the first result on the list should be "Yasmin Barbosa"