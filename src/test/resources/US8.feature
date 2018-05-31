Feature: Resolve a detected conflict and merge the selected information in one contact or dismiss conflicts if not related
  As a user
  I want to be able to merge information on the conflicts detected or to be able to dismiss a conflict because it is not related with the conflict
  So that I can export the information later in the csv file

  Scenario: Go to resolve single conflict when clicking the resolve option on the resolve conflicts page
    Given the user is on the resolve conflicts page
    When the user clicks on the resolve button of "Estevan Rodrigues"
    Then the "RESOLVE SINGLE CONFLICT" screen should be displayed of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49" and "d4f8d88d-afe1-4c63-821a-278883d6bb49"
    And it should be presented two columns with the corresponding contact information of the conflict
    And should not be presented the remove button on each one of the columns

  Scenario: Return to COS conflicts page from a single conflict page
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49" and "d4f8d88d-afe1-4c63-821a-278883d6bb49"
    When the user clicks on the "Back" button
    Then the "CONTACTS CONFLICTS" screen should be displayed

  Scenario: Check if only one radio button is enabled at the Name, Birthday and Photo column
    Given the user is on the single conflict page of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49" and "d4f8d88d-afe1-4c63-821a-278883d6bb49"
    Then  should be presented two columns with the corresponding contact information of the conflict
    And the last column should have the <fieldType> checked
    Examples:
    | fieldType |
    | name |
    | birthday |
    | photo |


  Scenario: If there are three or more columns should appear the remove button on each one
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d47f5d81-5376-4b2d-a3a3-7ec92qw246f8", "d47f5d81-5376-4b2d-a3a3-7ec92qw246qw" and "0e7b141f-11f8-4dcb-b78d-d7aa71160fa3"
    Then should be presented three columns with the corresponding contact information of the conflict
    And should be presented the remove button on each one of the columns

  Scenario: Removing one contact from single conflict page
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d47f5d81-5376-4b2d-a3a3-7ec92qw246f8", "d47f5d81-5376-4b2d-a3a3-7ec92qw246qw" and "0e7b141f-11f8-4dcb-b78d-d7aa71160fa3"
    When the user click on the remove button
    Then should be presented two columns with the corresponding contact information of the conflict
    And should not be presented the remove button on each one of the columns

  Scenario: Resolve a contact conflict with two contacts
    Given the user is on the single conflict page of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49" and "d4f8d88d-afe1-4c63-821a-278883d6bb49"
    When the user clicks on the save button
    Then the "CONTACT CONFLICTS" page should be displayed
    And all the conflicts related to the previous contacts should not appear on any of the columns
