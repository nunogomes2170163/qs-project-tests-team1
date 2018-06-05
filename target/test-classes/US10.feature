Feature: Export list of contacts to a csv file
  As a user
  I want to be able to export my contacts list free of duplicates to a csv file
  So that I can check my contacts list free of duplicates in a csv file

  Scenario: Check if export button exists after all conflicts are resolved
    Given the user is on the resolve conflicts page of the COS website
    When the user resolves all conflicts
    Then all the 3 columns should have the text "(0 conflicts)" on the title
    And the "Export contacts" button should be displayed

  # This test is commented because we can't be sure if the browser downloaded the pretended file containing the list of
  # contacts free of duplicates. Therefore, this test will be performed on the job "Perform manual testing" of the testing
  # pipeline defined on the jenkins server.
  #Scenario: Export contacts list free of duplicates
  #  Given the user is on the resolve conflicts page of the COS website
  #  And all conflicts are resolved
  #  And the "Export contacts" button is displayed
  #  When the user clicks on the Export contacts button
  #  Then the browser should download a csv file with the contacts list free of duplicates containing "contacts" on the filename