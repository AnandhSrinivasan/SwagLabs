Feature: Swag Labs Login

  Scenario: Successful login with valid credentials
    Given User on the Swag Labs login page
    When User valid username and password
    And User click the login button
    Then User logged in successfully
