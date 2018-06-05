Feature: Access to Contact Orchestrator Solution's (COS) Resolve Conflicts Page
  As a user
  I want to access to a list of contact conflicts on a resolve conflicts page
  So that I can see the contact conflicts by name, email and phone number

  Scenario: Click on resolve conflicts
    Given the user is on the COS landing page US8
    When the user clicks on the "Resolve conflicts" button located bottom of the page title
    Then the page sub title should be "CONTACT CONFLICTS" - US8


  Scenario: Return to COS landing page from the resolve conflicts page
    Given the user is on the COS - resolve conflicts page
    When the user clicks on the "Back" button US8
    Then the "CONTACTS LIST" screen should be displayed - US8


  Scenario Outline: Resolve conflicts page - initial state
    Given the user is on the COS - resolve conflicts page
    Then it should appear a column with the title "<columnTitle>"
    And there should be a button to resolve conflict and a button to keep all contacts on each entry of the column "<columnTitle>"
    Examples:
      | columnTitle |
      | Conflicts By Name |
      | Conflicts By Email |
      | Conflicts By Phone |

  Scenario Outline: Resolve conflicts page - number of conflicts
    Given the user is on the COS - resolve conflicts page
    Then it should appear a column with the title "<columnTitle>"
    And the column "<columnTitle>" should have "<number>" conflicts to resolve
    Examples:
      | columnTitle | number |
      | Conflicts By Name        | 22     |
      | Conflicts By Email       | 15     |
      | Conflicts By Phone       | 14     |

  Scenario: Click on keep all of a contact conflict on the resolve conflicts page
    Given the user is on the COS - resolve conflicts page
    When the user clicks on the "keep all" button of the first entry on the "Conflicts By Name"
    Then the conflicts with those contacts should disappear from all columns

  Scenario: Can not export contacts list to CSV file
    Given the user is on the COS - resolve conflicts page
    When there are contact conflicts to resolve
    Then the button "Export contacts" should not be visible

    
  Scenario Outline: Check if contacts conflicts are detected correctly
    Given the user is on the COS - resolve conflicts page
    When there are contact conflicts to resolve
    Then all the contact conflicts on the column with the title "<columnTitle>" should be detected by "<field>"
    Examples:
      | columnTitle | field |
      | Conflicts By Name |name|
      | Conflicts By Email | email |
      | Conflicts By Phone | phone |