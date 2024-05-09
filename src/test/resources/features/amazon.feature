@amazon
  Feature: Amazon page testing

    @amazon1
    Scenario: I test best sellers
      Given I go to "amazon" page
      When I open hamburger menu
      Then I select "Best Sellers" in the hamburger menu

    @amazon2
    Scenario Outline: I'm validating the "programming" search with Amazon
      Given I go to "amazon" page
      When I search for <searchText>
      Then I verify it contains <textToVerify>
      Examples:
        | searchText             | textToVerify         |
        | "programming"          | "art"                |
        | "software development" | "clean architecture" |

