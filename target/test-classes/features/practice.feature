@form
    Feature: Form submission

@form1
Scenario: Test form is not submitted
  Given I open url "https://skryabin.com/market/quote.html"
  And I click on element with xpath "//button[@id='formSubmit']"
  Then element with xpath "//label[@id='name-error']" should have text as "This field is required."

@form2
Scenario: Test USPS webpage
  Given I open url "https://www.usps.com/"
  When I wait for 3 sec
  Then I click on element with xpath "//*[@class='nav-first-element menuitem active']"
  And I click on element with xpath "//img[contains(@alt,'Zip')]/.."
  