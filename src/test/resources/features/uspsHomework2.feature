@uspsWindow
  Feature: WebDriver Window

    @uspsWindow1
    Scenario: Calculate postcard
      Given I go to "usps" page
      When I go to Calculate Price Page & click Send then Calculate a price for it
      And I wait for 1 sec
      And I select a destination "Canada" with "Postcard" shape
      Then I verify for quantity of "2" total cost is "$3.10"

    @uspsWindow2
    Scenario: Find jobs with USPS
      Given I go to "usps" page
      When I click "Find Out More" under Jobs with USPS
      And I wait for 2 sec
      Then I verify "Now hiring" message on the page
#      And I set implicit wait to "1"