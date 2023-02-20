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

    public WebElement getWelcome() {
        return welcome;
    }

    public WebElement getAbout() {
        return about;
    }
}
