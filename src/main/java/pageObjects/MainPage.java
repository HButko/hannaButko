package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    @Step("Go to login page")
    public LoginPage goToLoginPage() {
        webDriver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage();
    }

    public GeoStartPage goToGeoPage() {
        webDriver.findElement(By.linkText("Geolocation")).click();
        return new GeoStartPage();
    }

    public TablePage goToTablePage() {
        webDriver.findElement(By.linkText("Challenging DOM")).click();
        return new TablePage();
    }

    public HoversPage goToHoversPage() {
        webDriver.findElement(By.linkText("Hovers")).click();
        return new HoversPage();
    }

    @Step("Go to Download page")
    public DownloadPage goToDownloadPage() {
        webDriver.findElement(By.linkText("File Download")).click();
        return new DownloadPage();
    }

    @Step("Go to Upload page")
    public UploadPage goToUploadPage() {
        webDriver.findElement(By.linkText("File Upload")).click();
        return new UploadPage();
    }
}
