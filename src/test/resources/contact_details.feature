Feature: Contact Details

  Scenario: Contact details screen valid GUID
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb"
    Then the page sub title should be "CONTACT INFORMATION"

  Scenario: Contact details screen invalid GUID
    Given the user is on the contact details page of the user with GUID "000-invalid-000"
    Then the page should present a "Connection Failure" message

  Scenario: Contact details info
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb"
    Then the "name" field should be filled with "Joao"
    And the "surname" field should be filled with "Santos"
    And the "occupation" field should be filled with "School social worker"
    And the "street address" field should be filled with "R Afonso Albuquerque 27"
    And the "birthday" field should be filled with "3/31/1986"
    And the "city" field should be filled with "Fonte Cova"
    And the "company" field should be filled with "W. Bell and Co."
    And the "email" field should be filled with "JoaoRibeiroSantos@teleworm.us"
    And the "phone" field should be filled with "244534398"
    And the "photourl" field should be filled with "https://randomuser.me/api/portraits/men/19.jpg"

  Scenario: Contact details screen back option
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb"
    When the user clicks on the "Back" button
    Then the "Contacts List" screen should be displayed

  Scenario: Contact details screen image url
    Given the user is on the contact details page of the user with GUID "021a1dc3-5b75-4868-bb03-333170ce9acb"
    When the user clicks on the image url
    Then a new page with only an img tag must be displayed