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
  Scenario: Adding a new Employee, only firstName without lastname
    When user enters a valid email and password
    And clicks on Login Button
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters firstname "Mr_Joe"
   And user clicks on save button
    Then  Error message will appear required field

  @Addemp3
    Scenario: Adding a new Employee with a new ID from config file
      When user enters a valid email and password
      And clicks on Login Button
      When user clicks on PIM option
      And user clicks on add employee option
      And user enters firstname and middlename and lastname
      And user enters an employee id
      And user clicks on save button
    Then  new employee data is added

  @Addemp4
  Scenario: Adding a new Employee with a duplicate ID
    When user enters a valid email and password
    And clicks on Login Button
    When user clicks on PIM option
    And user clicks on add employee option
    And user enters firstname and middlename and lastname
    And user enters an employee id "51892A"
    And user clicks on save button
    Then  new employee data is not added