package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class TopNav extends BaseFunctions{
    public TopNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[contains(text(),'About')])[1]")
    private WebElement about;

    @FindBy(xpath = "//div[contains(text(),'Welcome speech')]")
    private WebElement welcome;

    @FindBy(xpath = "(//a[contains(text(),'Statistics')])[1]")
    private WebElement statistics;

    @FindBy(xpath = "//h1[contains(text(),'Statistics')]")
    private WebElement statisticsControl;

    public WebElement getStatisticsControl() {
        return statisticsControl;
    }

    @FindBy(id = "ac-1")
    private WebElement september2022;


    public WebElement getSeptember2022() {
        return september2022;
    }

    public WebElement getStatistics() {
        return statistics;
    }

    public WebElement getWelcome() {
        return welcome;
    }

    public WebElement getAbout() {
        return about;
    }
}
