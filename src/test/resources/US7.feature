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

  Scenario Outline: filtering
    Given I access the landing page of COS - US7
    And Facebook and Linkedin switches are enabled
    When I turn "<filter>" switch off
    Then The contacts list should not display results with the "<filter>" source
    Examples:
      | filter |
      |  LinkedIn   |
      |  Facebook   |