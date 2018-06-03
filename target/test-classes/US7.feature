Feature: Filtering the source of contacts
  As a user
  I want to be able to filter the contacts list by source
  So that i can see contacts from a source at a time

  Scenario: Landing page's sub tittle and contact list contains both source of contacts
    Given I access the landing page of COS - US7
    When Facebook and Linkedin switches are enabled
    Then the contact list must display contacts from both sources

  Scenario: Landing page's sub tittle and contact list should not contain from Skype and Twitter sources
    Given I access the landing page of COS - US7
    When Facebook and Linkedin switches are not enabled
    Then the "No matching records found" message should be displayed

  Scenario Outline: Filtering source of contacts by Facebook and LinkedIn
    Given I access the landing page of COS - US7
    And Facebook and Linkedin switches are enabled
    When I turn "<filter>" switch off
    Then The contacts list should not display results with the "<filter>" source
    Examples:
      | filter |
      |  LinkedIn   |
      |  Facebook   |

  # This test is commented because it appears that when the web driver changes pages the values stored on session are not maintained,
  # which makes it impossible to run this test automatically. Therefore, this scenario will tested manually.
  #Scenario Outline: Keep Facebook or LinkedIn filtering options on session
  #  Given I access the landing page of COS - US7
  #  And Facebook and Linkedin switches are enabled
  #  When I turn "<filter>" switch off
  #  And Go to resolve conflicts page
  #  And Return to landing page
  #  Then The "<filter>" switch must still be off
  #  And The contacts list should not display results with the "<filter>" source
  #  Examples:
  #    | filter |
  #    |  LinkedIn   |
  #    |  Facebook   |

  # This test is commented because it appears that when the web driver changes pages the values stored on session are not maintained,
  # which makes it impossible to run this test automatically. Therefore, this scenario will tested manually.
  #Scenario: Keep both Facebook and LinkedIn filtering options on session at the same time
  #  Given I access the landing page of COS - US7
  #  And Facebook and Linkedin switches are enabled
  #  When I turn both Facebook and LinkedIn switches off
  #  And Go to resolve conflicts page
  #  And Return to landing page
  #  Then Both Facebook and LinkedIn switches must still be off
  #  And the "No matching records found" message should be displayed