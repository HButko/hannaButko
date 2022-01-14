package tests.LessonTwentyOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

//https://the-internet.herokuapp.com/hovers - написать тест,
// который выводит юзернейм каждого пользователя (для этого нужно навести мышку на аватар)

public class testHovers {
    private WebDriver driver;

    @BeforeTest
    private void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void hoversTest() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> userAvatar = driver.findElements(By.cssSelector("div.figure"));

        for (int i = 0; i < userAvatar.size(); i++) {
            actions.moveToElement(userAvatar.get(i)).perform();
            System.out.print(driver.findElements(By.cssSelector("div.figure h5")).get(i).getText());
        }
    }

    @AfterTest(alwaysRun = true)
    private void afterTest() {
        driver.quit();
    }
}

