Feature: Resolve a detected conflict and merge the selected information in one contact or dismiss conflicts if not related
  As a user
  I want to be able to merge information on the conflicts detected or to be able to dismiss a conflict because it is not related with the conflict
  So that I can export the information later in the csv file

  Scenario Outline: Go to resolve single conflict when clicking the resolve option on the resolve conflicts page
    Given the user is on the resolve conflicts page
    When the user clicks on the resolve button of "Estevan Rodrigues" with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49|d4f8d88d-afe1-4c63-821a-278883d6bb49"
    Then the "RESOLVE SINGLE CONFLICT" screen should be displayed of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49" and "d4f8d88d-afe1-4c63-821a-278883d6bb49"
    And there should be two columns with the corresponding contact information of the conflict: <fieldNumber> - "<firstColumn>" and "<secondColumn>"
    And the remove button on each one of the columns should not be displayed
    Examples:
      | fieldNumber | firstColumn                      | secondColumn                     |
      | 1           | Estevan Rodrigues                | Estevan Rodrigues                |
      | 2           | 1/10/1953                        | Not Defined                      |
      | 4           | EstevanRibeiroRodrigues@cuvox.de | EstevanRibeiroRodrigues@cuvox.de |
      | 5           | 232582789                        | 232582789                        |
      | 6           | Not Defined                      | Avenida 25 Abril 74              |
      | 7           | Home appliance repairer          | Not Defined                      |
      | 8           | Maxaprofit                       | Not Defined                      |
      | 9           | Viseu                            | Viseu                            |
      | 10          | LinkedIn                         | Facebook                         |

  Scenario: Return to COS conflicts page from a single conflict page
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49%7Cd4f8d88d-afe1-4c63-821a-278883d6bb49" US9
    When the user clicks on the Back button
    Then the "CONTACT CONFLICTS" screen should be displayed - US9

  Scenario Outline: Check if only one radio button is enabled at the Name, Birthday and Photo column
    Given the user is on the single conflict page of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49|d4f8d88d-afe1-4c63-821a-278883d6bb49" US9
    Then the last column should have the "<fieldType>" checked with number "<fieldNumber>"
    Examples:
      | fieldType | fieldNumber |
      | name      | 1           |
      | birthday  | 2           |
      | photo     | 3           |

  Scenario: If there are three or more columns should appear the remove button on each one
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d47f5d81-5376-4b2d-a3a3-7ec92qw246f8|d47f5d81-5376-4b2d-a3a3-7ec92qw246qw|0e7b141f-11f8-4dcb-b78d-d7aa71160fa3" US91
    Then there should be presented three columns
    And the remove button should be displayed on each one of the columns

  # This test is commented because when we click to remove one of the columns, the PhantomJS web driver still detects 3 columns.
  # But, using Chrome web driver the test pass. Since on the jenkins server the tests must be run on a headless web driver, this
  # test will be performed on the job "Perform manual testing" of the testing pipeline defined on the jenkins server.
  Scenario: Removing one contact from single conflict page
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d47f5d81-5376-4b2d-a3a3-7ec92qw246f8|d47f5d81-5376-4b2d-a3a3-7ec92qw246qw|0e7b141f-11f8-4dcb-b78d-d7aa71160fa3" US91
    When the user clicks on the remove button
    Then there should be presented only two columns
    And the remove button on each one of the columns should not be displayed

  # This test is commented because when we click on the save button the PhantomJs web driver does not detect that the page changed
  # and, consequently the conflicts are not resolved. After a deep analysis, using Chrome web driver, we detected that when the
  # driver goes to the conflict page, the information of each contact are not displayed for unknown reason.
  # Therefore, this test will be performed on the job "Perform manual testing" of the testing pipeline defined on the jenkins server.
  Scenario: Resolve a contact conflict with two contacts
    Given the user is on the "RESOLVE SINGLE CONFLICT" of the users with GUIDs "d4f8d88d-afe1-4c63-821a-27as83d6bb49%7Cd4f8d88d-afe1-4c63-821a-278883d6bb49" US9
    When the user clicks on the save button
    Then the "CONTACT CONFLICTS" screen should be displayed - US9
    And all the conflicts related to the previous contacts should not appear on any of the columns
