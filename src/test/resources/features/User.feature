Feature:  User page feature

  Background:
    Given user is on login page
    When User enter  username
    And User enter  password
    And  User click on login button
    Then Dashboard page is displayed

    Scenario: Verify navigation to User  Tab
      Given User click on User Tab button
      Then User page is displayed