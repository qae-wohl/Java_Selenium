package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

import static support.DriverFactory.getDriver;

public class uspsStepDefs {
    @When("I go to Lookup ZIP page by address")
    public void iGoToLookupZIPPageByAddress() {
        getDriver().findElement(By.xpath("//a[text()='Quick Tools']")).click();
        getDriver().findElement(By.xpath("//img[contains(@alt,'Zip')]/..")).click();
        getDriver().findElement(By.xpath("//a[text()='Find by Address']")).click();
    }

    @And("I fill out {string} street, {string} city, {string} state")
    public void iFillOutStreetCityState(String addrStreet, String addrCity, String addrState) {
        getDriver().findElement(By.xpath("//input[@id='tAddress']")).sendKeys(addrStreet);
        getDriver().findElement(By.xpath("//input[@id='tCity']")).sendKeys(addrCity);
        getDriver().findElement(By.xpath("//select[@id='tState']")).click();
        getDriver().findElement(By.xpath("//select[@id='tState']//option[@value='" + addrState + "']")).click(); //or $s
        getDriver().findElement(By.xpath("//a[@id='zip-by-address']")).click();
    }

    @Then("I validate {string} zip code exists in the result")
    public void iValidateZipCodeExistsInTheResult(String zipCode) {
        String zipResults = getDriver().findElement(By.xpath("//div[@id='zipByAddressDiv']")).getText();
        assertThat(zipResults).contains(zipCode);
    }

    @When("I use Lookup ZIP by address")
    public void iUseLookupZIPByAddress() {
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        getDriver().findElement(By.xpath("//h2//*[text()='Look Up a ZIP Code']")).click();

    }

}
