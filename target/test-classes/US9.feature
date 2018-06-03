Feature: Resolve a detected conflict and merge the selected information in one contact or dismiss conflicts if not related
  As a user
  I want to be able to merge information on the conflicts detected or to be able to dismiss a conflict because it is not related with the conflict
  So that I can export the information later in the csv file



  Scenario: Removing one contact from single conflict page
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d47f5d81-5376-4b2d-a3a3-7ec92qw246f8|d47f5d81-5376-4b2d-a3a3-7ec92qw246qw|0e7b141f-11f8-4dcb-b78d-d7aa71160fa3" US91
    When the user clicks on the remove button
    Then there should be presented only two columns
    And the remove button on each one of the columns should not be displayed

  Scenario: Resolve a contact conflict with two contacts
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49%7Cd4f8d88d-afe1-4c63-821a-278883d6bb49" US9
    When the user clicks on the save button
    Then the "CONTACT CONFLICTS" page should be displayed
    And all the conflicts related to the previous contacts should not appear on any of the columns
