Feature: SubmitContact

  Scenario: My First SubmitContact
    Given I am on the test site
    When I navigate to Contact Us
    And I submit the form with valid data
      | Fields   | Value         |
      | Name     | mike          |
      | Address  | addr1         |
      | Postcode | pcode1        |
      | Email    | email1@gg.com |
    Then I check the form has been submitted
