Feature: verify the adactin hotel page

  Scenario: verify the adactin loginpage with invalid credential
    Given user should be in loginpage
    When user should enter the username and password
    And user should click the login button
    Then user should verify the error message
