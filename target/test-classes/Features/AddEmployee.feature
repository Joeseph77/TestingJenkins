Feature: Adding a new Employee

  @Addemp1
  Scenario: Adding a new Employee without Id, generated automatically
    When user enters a valid email and password
    And clicks on Login Button
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters firstname and middlename and lastname
    And user clicks on save button
    Then  new employee data is added

  @Addemp2
    Scenario: Adding a new Employee with ID from config file
      When user enters a valid email and password
      And clicks on Login Button
      When user clicks on PIM option
      And user clicks on add employee option
      And user enters firstname and middlename and lastname
      And user enters an employee id
      And user clicks on save button
    Then  new employee data is added

  @Addemp3
  Scenario: Adding a new Employee with a duplicate ID
    When user enters a valid email and password
    And clicks on Login Button
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters firstname and middlename and lastname
    And user enters an employee id "51892A"
    And user clicks on save button
    Then  new employee data is added