@usps
  Feature: Zip code lookup

    @usps1
    Scenario: Portnov Computer School ZIP code validation
      Given I go to "usps" page
#      When I use Lookup ZIP by address
      When I go to Lookup ZIP page by address
      And I fill out "4970 El Camino Real" street, "Los Altos" city, "CA" state
      And I wait for 1 sec
      Then I validate "94022" zip code exists in the result

    @usps2
    Scenario: USPS calculate
      Given I go to "usps" page
      When I go to Calculate Price Page
