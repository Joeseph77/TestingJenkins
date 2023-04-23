Feature: Login Functionality
  @datatable
  Scenario: Valid Admin Login
    #Given the user navigates to the url
    When user enters a valid email and password
    And clicks on Login Button
    Then the user is logged in
