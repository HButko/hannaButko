package tests.LessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// https://the-internet.herokuapp.com/login - написать 2 теста, на корректный и некорректный логин.
// В первом случае - проверить, что отображается сообщение "You logged into a secure area!",
// во втором сообщение об ошибке логина/пароля

public class testTaskTwo {

    @Test
    private void loginCorrectLocatorTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    private void loginIncorrectLocatorTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }
}
