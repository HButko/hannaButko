package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pageObjects.MainPage;
import utils.DriverSingleton;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = DriverSingleton.getDriver();
    }

    @AfterClass
    public void reset() {
        webDriver.manage().deleteAllCookies();
    }

    @AfterTest
    public void tearDown() {
        if (this.webDriver != null) {
            this.webDriver.quit();
        }
    }

    public MainPage openApp() {
        webDriver.get("https://the-internet.herokuapp.com/");

        return new MainPage();
    }
}
