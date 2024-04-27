package definitions;

import io.cucumber.java.en.Given;
import static support.DriverFactory.getDriver;

public class CommonStepDefs {
    @Given("I go to {string} page")
    public void iGoToPage(String page) {
        if (page.equals("quote")) {
            getDriver().get("https://skryabin.com/market/quote.html");
        } else if (page.equals("google")) {
            getDriver().get("https://google.com");
        } else if (page.equals("usps")) {
            getDriver().get("https://www.usps.com/");
        } else if (page.equals("amazon")) {
            getDriver().get("https://www.amazon.com/");
        } else {
            throw new Error("Unnknown page: " + page);
        }
        System.out.println("Title: " + getDriver().getTitle());

    }
}
