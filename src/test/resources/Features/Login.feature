Feature: Login Functionality

  Scenario: Valid Admin Login

    Given user open the browser and launch the HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is logged in successfully
    And close the browser