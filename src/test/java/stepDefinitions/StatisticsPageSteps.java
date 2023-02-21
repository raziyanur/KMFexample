package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.BaseFunctions;
import pages.TopNav;
import utilities.BaseDriver;


public class StatisticsPageSteps extends BaseFunctions {

    TopNav tn=new TopNav();
    @Then("click on Statistics and navigate to Statistics page")
    public void clickOnStatisticsAndNavigateToStatisticsPage() {
        clickFunction(tn.getStatistics());

    }

    @And("Statistics page should be visible")
    public void StatisticsPageShouldBeVisible() {
        verifyContainsText(tn.getStatisticsControl(), "statistics");


    }

    @And("Scroll the page to control september")
    public void scrollThePageToControlSeptember() {
        JavascriptExecutor js= (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript( "window.scrollBy(0,700)");
        BaseDriver.Bekle(3);

        clickFunction(tn.getSeptember2022());
        BaseDriver.Bekle(3);

        clickFunction(tn.getSeptember2022());
        BaseDriver.Bekle(1);
        js.executeScript( "window.scrollBy(0,-700)");


    }
}
