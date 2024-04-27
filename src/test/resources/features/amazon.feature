@amazon
  Feature: Amazon page testing

    @amazon1
    Scenario: I test best sellers
      Given I go to "amazon" page
      When I open hamburger menu
      Then I select "Best Sellers" in the hamburger menu