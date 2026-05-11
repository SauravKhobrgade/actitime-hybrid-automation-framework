Feature: Dashboard page features

  Background:
    Given user is on login page
    When User enter  username
    And User enter  password
    And  User click on login button
    Then Dashboard page is displayed

    Scenario:Verify dashboard page URL
      Then  Dashboard page URL is as "http://localhost:93/user/submit_tt.do"

    Scenario:Verify dashboard page Title
      Then  Dashboard page title is as "actiTIME - Enter Time-Track"

    Scenario: Verify dashboard TabNames
     Then Dashboard display 4 tabs

