package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.MainPage;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeClass
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public void afterTest() {
        webDriver.quit();
    }

    public MainPage openApp() {
        webDriver.get("https://the-internet.herokuapp.com/");

        return new MainPage(webDriver);
    }
}
