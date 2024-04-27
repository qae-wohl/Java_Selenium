package definitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class QuoteStepDefs {
    @And("I fill out required fields")
    public void iFillOutRequiredFields() {
        getDriver().findElement(By.xpath("//input[@id='name']")).click();
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys("Joe");
        getDriver().findElement(By.xpath("//input[@id='lastName']")). sendKeys("Doe");
        getDriver().findElement(By.xpath("(//div[@class='ui-dialog-buttonset']/button)[1]")).click();
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("jdoe");
        getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("jdoe@example.com");
        getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys("Qwerty");
        getDriver().findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Qwerty");
        getDriver().findElement(By.xpath("//input[@name='agreedToPrivacyPolicy']")).click();
    }

    @And("I verify full name")
    public void iVerifyFullName() {
        String value = getDriver().
                findElement(By.xpath("//input[@name='name']")).getAttribute("value");
        System.out.println("name = " + value);
    }

    @And("I submit the page")
    public void iSubmitThePage() {
        getDriver().findElement(By.xpath("//button[@id='formSubmit']")).click();
    }


    @Then("I verify that required fields values submitted corrected")
    public void iVerifyThatRequiredFieldsValuesSubmittedCorrected() {
       String usernameTextValue = getDriver().findElement(By.xpath("//div[@id='quotePageResult']//section")).getText();
       String agreedText = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertThat(usernameTextValue).contains("jdoe");
        assertThat(usernameTextValue).contains("Joe Doe");
        assertThat(usernameTextValue).doesNotContain("oe oe");
        assertThat(agreedText).isEqualTo("true");






//       Boolean validate = usernameTextValue.equals("jdoe");
//        System.out.println(validate);
//        System.out.println("Checking values: " + usernameTextValue.equals("joe"));
//        assertTrue("username doesn't match", usernameTextValue.equals("jdoe"));
//        assertEquals("jdoe", usernameTextValue);
//        if (!usernameTextValue.equals("jdoe")) {
//          throw new Error("username value doesn't match: " + usernameTextValue + " Expected: jdoe");
//        }
    }

    @And("I mouse over Additional info box")
    public void iMouseOverAdditionalInfoBox() {
        Actions action = new Actions((getDriver()));
        action.moveToElement(getDriver().findElement(By.name("additionalInfo"))).perform();
        //OR
        //action.moveByOffset(366, 78).perform(); - positioning by the exact pixel location
        String iframeHoverMessage = getDriver().findElement(By.id("iframeHoverMessage")).getText();
        assertThat(iframeHoverMessage).isEqualTo("mouse detected over iframe");
        getDriver().findElement(By.id("iframeHoverMessage")).getText();
    }

    @And("I selet my country {string} from the Country drop down")
    public void iSeletMyCountryFromTheCountryDropDown(String country) {
        Select select = new Select(getDriver().findElement(By.name("countryOfOrigin")));
        select.selectByValue("USA");
        // OR
//        select.selectByVisibleText("United States of America");
//        select.selectByIndex(1);
    }

//    @And("I mouse over Additional info box")
//    public void iMouseOverAdditionalInfoBox() {
//        Action action = new Actions(getDriver());
//    }
}
