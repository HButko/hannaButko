package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeoResultPage extends BasePage {

    private final By mapBy = By.cssSelector("div#map-link");

    @FindBy(xpath = "//div[@id='lat-value']")
    private WebElement findLat;

    @FindBy(xpath = "//div[@id='long-value']")
    private WebElement findLong;

    public GeoResultPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public GeoResultPage mapLocate() {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(mapBy));
        return this.mapLocate();
    }

    public String geoLocationLat() {
        return findLat.getText();
    }

    public String geoLocationLong() {
        return findLong.getText();
    }
}
