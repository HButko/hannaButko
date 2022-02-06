package pageObjects;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

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

    public DownloadPage goToDownloadPage() {
        webDriver.findElement(By.linkText("File Download")).click();
        return new DownloadPage();
    }

    public UploadPage goToUploadPage() {
        webDriver.findElement(By.linkText("File Upload")).click();
        return new UploadPage();
    }
}
