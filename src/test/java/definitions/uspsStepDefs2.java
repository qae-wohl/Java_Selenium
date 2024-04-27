package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.Set;

import static support.DriverFactory.getDriver;



public class uspsStepDefs2 {
    @When("I go to Calculate Price Page & click Send then Calculate a price for it")
    public void iGoToCalculatePricePageClickSendThenCalculateAPriceForIt() {
      getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
      getDriver().findElement(By.xpath("//h2//*[text()='Calculate a Price']")).click();
    }


    @And("I select a destination {string} with {string} shape")
    public void iSelectADestinationWithShape(String country, String shape) {
        getDriver().findElement(By.xpath("//select[@id='CountryID']//option[text()='" + country + "']")).click();
        getDriver().findElement(By.xpath("//input[@value='" + shape + "']")).click();
    }

    @Then("I verify for quantity of {string} total cost is {string}")
    public void iVerifyForQuantityOfTotalCostIs(String quantity, String cost) {
        getDriver().findElement(By.xpath("//input[@id='quantity-0']")).sendKeys(quantity);
        getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();
        String totalCost = getDriver().findElement(By.xpath("//div[@id='total']")).getText();
        Assertions.assertThat(totalCost).isEqualTo(cost);
    }

     @When("I click {string} under Jobs with USPS")
    public void iClickUnderJobsWithUSPS(String link) {
        getDriver().findElement(By.xpath("//a[contains(text(),'" + link + "')]")).click();
    }

    @Then("I verify {string} message on the page")
    public void iVerifyMessageOnThePage(String header) {
        Set<String> windows = getDriver().getWindowHandles();
        String[] handlesList = windows.toArray(new String[]{});
        getDriver().switchTo().window(handlesList[handlesList.length-1]);
        String pageContent = getDriver().findElement(By.xpath("//html")).getText();
        Assertions.assertThat(pageContent).contains(header);
    }

    @And("I set implicit wait to {string}")
    public void iSetImplicitWaitTo(String time) {
        getDriver().manage().timeouts().implicitlyWait(Duration.parse(time));
    }
}
