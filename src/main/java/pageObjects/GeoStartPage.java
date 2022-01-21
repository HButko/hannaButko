package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeoStartPage extends BasePage {

    @FindBy(xpath = "//button")
    private WebElement clickButton;

    public GeoStartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public GeoResultPage geoButton() {
        clickButton.click();
        return new GeoResultPage(webDriver);
    }
}
