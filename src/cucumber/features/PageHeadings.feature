Feature: Test Page Headings

  Scenario Outline: Test Contact Page Headings
    Given I am on the test site2
    When I click on <Link>
    Then I check I am on <Title>
    And I close the browser

    Examples: 
      | Link          | Title    |
      | adoption_link | Adoption |
      | about_link    | About    |
      | contact_link  | Contact  |
      | home_link     | Home     |
