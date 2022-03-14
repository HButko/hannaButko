package tests;

import com.codeborne.selenide.commands.TakeScreenshot;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pageObjects.MainPage;
import utils.DriverSingleton;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = DriverSingleton.getDriver();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @AfterClass
    public void reset() {
        webDriver.manage().deleteAllCookies();
    }

    @AfterMethod
    public void makeScreenshot(ITestResult result) throws IOException {
        if(!result.isSuccess()) {
            File screenshot = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            saveScreenshot(Files.readAllBytes(screenshot.toPath()));
        }
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

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
