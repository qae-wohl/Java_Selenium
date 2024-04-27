@quote
  Feature: Quote project test suite

    @quote1
    Scenario: Quote and to end test
      Given  I go to "quote" page
      When I fill out required fields
      And I mouse over Additional info box
      And I selet my country " " from the Country drop down
#      And I verify full name
#      And I submit the page
#      Then I verify that required fields values submitted corrected