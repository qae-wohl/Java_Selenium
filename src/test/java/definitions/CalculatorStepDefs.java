package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class CalculatorStepDefs {
    @Given("I go to calculator page")
    public void iGoToCalculatorPage() {
        getDriver().get("https://www.calculator.net/");
    }

    @When("I navigate to {string} calculator")
    public void iNavigateToCalculator(String text) {
        WebElement element = getDriver().findElement(By.linkText(text));
        clickJS(element);
//        clickJS(getDriver().findElement(By.linkText(text)));
    }

    public void clickJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    @And("I clear all calculator fields")
    public void iClearAllCalculatorFields() {
        getDriver().findElement(By.id("cstartingamount1")).clear();
//        Select select = new Select(getDriver().findElement(By.name("cstate")));
//                select.selectByVisibleText("-- Select --");
    }

    @And("I calculate")
    public void iCalculate() {
        getDriver().findElement(By.xpath("//input[@onclick='clearForm(document.calform);']")).click();

    }

    @Then("I verify {string} error")
    public void iVerifyError(String text) {
        assertThat(getDriver().findElement(By.xpath("//font[text()='Please provide a positive starting amount.']")).getText()).contains(text);
    }
}
