Feature: Swag Labs Login

  Scenario: Successful login with valid credentials
    Given User on the Swag Labs login page
    When User valid username and password
    And User click the login button
    Then User logged in successfully

  Scenario: Failed login with invalid credentials
    Given I am on the Swag Labs login page
    When I enter invalid username and password
    And I click the login button
    Then I should see an error message
