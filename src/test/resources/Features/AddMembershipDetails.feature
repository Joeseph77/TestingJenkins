Feature: Employee adding his/her membership details

  @membership
  Scenario: Employee membership details adding
    When user enters a valid email "Jason" and password "Hum@nhrm123":
    And clicks on Login Button
    And clicks on My info
    And clicks on Memberships
    And clicks on Add
    Then user selects MembershipType
    Then user selects Subscription Paid By
    Then user enters Subscription Amount
    Then user selects Currency
    And user selects Subscription Commence Date
    And user selects Subscription Renewal Date
    Then user clicks on membership save button

@editing
Scenario: Employee membership details deleting and editig
  When user enters a valid email "Jason" and password "Hum@nhrm123":
  And clicks on Login Button
  And clicks on My info
  And clicks on Memberships
  And selects to delete a certain Memberships

