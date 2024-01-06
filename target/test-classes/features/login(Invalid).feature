Feature: Swag Labs login with Invalid credentials

  Scenario: UnSuccessful login with Invalid credentials
    Given The User on the Swag Labs login page
    When User valid Invalid username and Ipassword
    And The User click the login button
    Then User logged in Unsuccessfull
