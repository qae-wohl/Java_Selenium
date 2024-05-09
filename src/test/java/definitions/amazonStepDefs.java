package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import static support.DriverFactory.getDriver;

public class amazonStepDefs {
    @When("I open hamburger menu")
    public void iOpenHamburgerMenu() {
        getDriver().findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
    }

    @Then("I select {string} in the hamburger menu")
    public void iSelectInTheHamburgerMenu(String menu) {
        getDriver().findElement(By.xpath("//div[@id='hmenu-content']//*[text()='" + menu + "']")).click();
    }

    @When("I search for {string}")
    public void iSearchFor(String searchText) {
        getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(searchText);
        getDriver().findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

    @Then("I verify it contains {string}")
    public void iVerifyItContains(String textToVerify) {
        String pageResults = getDriver().findElement(By.xpath("//div[contains(@class, 's-search-results')]")).getText();
        Assertions.assertThat(pageResults).containsIgnoringCase(textToVerify);
    }
}
