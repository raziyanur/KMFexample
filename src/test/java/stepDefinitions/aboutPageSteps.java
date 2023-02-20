package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BaseFunctions;
import pages.TopNav;
import utilities.BaseDriver;

public class aboutPageSteps extends BaseFunctions {
    TopNav tn=new TopNav();
    @Given("Navigate to KMF english page")
    public void navigateToKMFEnglishPage() {
        BaseDriver.getDriver().get("https://kmf.kz/en/");
        BaseDriver.getDriver().manage().window().maximize();

    }

    @Then("click on About and navigate to About page")
    public void clickOnAboutAndNavigateToAboutPage() {
        clickFunction(tn.getAbout());
    }

    @And("User About page should be visible")
    public void userAboutPageShouldBeVisible() {
        verifyContainsText(tn.getWelcome(), "welcome");
    }
}
