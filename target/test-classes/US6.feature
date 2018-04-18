Feature: Access to a Contact Orchestrator Solution's (COS) Details Page
  As a user
  I want to access to the information of a contact presented on a details page
  So that I can see the details of the contact selected

    #Nuno
  Scenario: Click on contact details
    Given the user is on the COS landing page - US6
    When the user clicks on the "Open" option of the first result
    Then the GUID and Name fields should match the first list result on the contacts list screen

    #Joao
  Scenario: Contact details screen valid GUID
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb" - US6
    Then the page sub title should be "CONTACT INFORMATION"

    #David
  Scenario: Contact details screen invalid GUID
    Given the user is on the contact details page of the user with GUID "000-invalid-000" - US6
    Then the page should present a "Connection Failure" message

    #Nuno
  Scenario: Contact details info
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb" - US6
    Then the "givenName" field should be filled with "Joao"
    And the "surname" field should be filled with "Santos"
    And the "occupation" field should be filled with "School social worker"
    And the "address" field should be filled with "R Afonso Albuquerque 27"
    And the "birthday" field should be filled with "3/31/1986"
    And the "city" field should be filled with "Fonte Cova"
    And the "company" field should be filled with "W. Bell and Co."
    And the "email" field should be filled with "JoaoRibeiroSantos@teleworm.us"
    And the "phone" field should be filled with "244534398"
    And the a profile photo should be displayed
