package tests.LessonTwenty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testBinWebDriver {

    @Test
    private void webDriverTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/bin/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.quit();
    }
}
