@predefined
Feature: Smoke steps

  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    Then I should see page title as "Google"
    And element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    And I click on element with xpath "(//input[@name='btnK'])[1]"
    And I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"

  @predefined2
  Scenario: Predefined steps for Bing
    Given I open url "https://www.bing.com"
    Then I should see page title contains "Bing"
    And element with xpath "//*[@id='sb_form_q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@id='sb_form_q']"
    And I click on element with xpath "//label[@id='search_icon']"
    Then I wait for element with xpath "//ol[@id='b_results']" to be present
    And element with xpath "//ol[@id='b_results']" should contain text "Cucumber"

  @predefined3
  Scenario: Predefined steps for Yahoo
    Given I open url "http://www.yahoo.com/"
    Then I should see page title as "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos"
    And element with xpath "//input[@id='ybar-sbq']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='ybar-sbq']"
    Then I click on element with xpath "//button[@id='ybar-search']"
    And I wait for 2 sec
    Then I switch to new window
    And I wait for element with xpath "//*[@id='results']" to be present
    Then element with xpath "//*[@id='results']" should contain text "Cucumber"

  @predefined4
  Scenario: Predefined steps for Gibiru
    Given I open url "https://gibiru.com/"
    Then I should see page title as "Gibiru – Protecting your privacy since 2009"
    And element with xpath "//input[@id='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='q']"
    Then I click on element with xpath "//*[@id='button-addon2']"
    And I wait for element with xpath "//*[@id='web-results']" to be present
    Then element with xpath "//*[@id='web-results']" should contain text "Cucumber"

  @predefined5
  Scenario: Predefined steps for Duckduckgo
    Given I open url "https://duckduckgo.com/"
    Then I should see page title as "DuckDuckGo — Privacy, simplified."
    And element with xpath "//input[@id='searchbox_input']" should be present
    Then I type "Behavior Driven Development" into element with xpath "//input[@id='searchbox_input']"
    And I click on element with xpath "//button[@aria-label='Search']"
    Then I wait for element with xpath "//*[@class='react-results--main']" to be present
    And element with xpath "//*[@class='react-results--main']" should contain text "Cucumber"

  @predefined6
  Scenario: Predefined steps for Swisscows
    Given I open url "https://swisscows.com/en"
    Then I should see page title as "Your private and anonymous search engine Swisscows"
    And element with xpath "//input[@class='input-search']" should be present
    Then I type "Behavior Driven Development" into element with xpath "//input[@class='input-search']"
    And I click on element with xpath "//button[@class='search-submit']"
    Then I wait for element with xpath "//div[@class='web-results']" to be present
    And element with xpath "//div[@class='web-results']" should contain text "Cucumber"

  @predefined7
  Scenario: Predefined steps for Searchencrypt
    Given I open url "https://www.searchencrypt.com/"
    Then I should see page title as "Search Encrypt | Home"
    And element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    Then I click on element with xpath "//button[@class='search-bar__submit']"
    And I wait for element with xpath "//section[contains(@class,'serp__results')]" to be present
    Then element with xpath "//section[contains(@class,'serp__results')]" should contain text "Cucumber"

  @Predefined8
  Scenario: Predefined steps for Startpage
    Given I open url "https://www.startpage.com/"
    Then I should see page title as "Startpage - Private Search Engine. No Tracking. No Search History."
    And element with xpath "//input[@id='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='q']"
    Then I click on element with xpath "//button[@class='search-btn'][1]"
    And I wait for element with xpath "//div[@id='main']" to be present
    Then element with xpath "//div[@id='main']" should contain text "Cucumber"

  @Predefined9
  Scenario: Predefined steps for Boardreader
    Given I open url "https://boardreader.com"
    Then  I should see page title as "Boardreader - Forum Search Engine"
    And element with xpath "//input[@id='title-query']" should be present
    When I type "BDD" into element with xpath "//input[@id='title-query']"
    Then I click on element with xpath "//button[@id='title-submit']"
    And I wait for element with xpath "//div[contains(@class,'searchResultsBlock')]" to be present
    Then element with xpath "//div[contains(@class,'searchResultsBlock')]" should contain text "Cucumber"

  @Predefined10
  Scenario: Predefined steps for Ecosia
    Given I open url "https://www.ecosia.org/"
    Then I should see page title as "Ecosia - the search engine that plants trees"
    And element with xpath "//input[@aria-label='Search the web']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@aria-label='Search the web']"
    Then I click on element with xpath "//button[@aria-label='Search']"
    And I wait for element with xpath "//*[@data-test-id='mainline']" to be present
    Then element with xpath "//*[@data-test-id='mainline']" should contain text "Cucumber"


