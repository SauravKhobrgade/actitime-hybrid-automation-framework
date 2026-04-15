Feature:Login page features

  Scenario: verify login page url
    Given user is on login page
    Then login page url is displayed as "http://localhost:93/login.do"

  Scenario: verify login page title
    Given user is on login page
    Then  login page title is displayed as "actiTIME - Login"

  Scenario:  verify login  fields
    Given user is on login page
    Then  username field is displayed
    And   password field is displayed
    And  keepMeLoginCheckBox is displayed
    And  login button is dipalyed
    And login page logo are displayed

    Scenario:  verify login functionality
      Given  user is on login page
      When User enter  username
      And User enter  password
      And  User click on login button
      Then Dashboard page is displayed

    Scenario Outline: verify invalid login functionality
      Given user is on login page
      When User enter "<USERNAME>" as username
      And  User enter "<PASSWORD>" as password
      And User click on login button
      Then Dashboard page is displayed
      Examples:
        |USERNAME      | PASSWORD     |
        |admin123      | manager      |
        |admin         | manager123   |
        |admin345      | manager8897  |

