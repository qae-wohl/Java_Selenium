package definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
}
