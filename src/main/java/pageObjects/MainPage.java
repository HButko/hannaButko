package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage goToLoginPage() {
        webDriver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(webDriver);
    }

    public GeoStartPage goToGeoPage() {
        webDriver.findElement(By.linkText("Geolocation")).click();
        return new GeoStartPage(webDriver);
    }

    public TablePage goToTablePage() {
        webDriver.findElement(By.linkText("Challenging DOM")).click();
        return new TablePage(webDriver);
    }

    public HoversPage goToHoversPage() {
        webDriver.findElement(By.linkText("Hovers")).click();
        return new HoversPage(webDriver);
    }
}
