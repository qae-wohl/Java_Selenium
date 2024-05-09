@calculator
  Feature: Testing the calculator.net functionality
    Background:
    Given I go to calculator page

    @calculator1
    Scenario: Verify calculator results
      When I navigate to "Inflation Calculator" calculator
      And I clear all calculator fields
      And I calculate
      Then I verify "Please provide a positive starting amount" error


