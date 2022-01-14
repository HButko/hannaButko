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

import java.util.Arrays;
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
//        WebElement userName = driver.findElement(By.cssSelector("div.figcaption"));

        userAvatar.forEach(webElement -> {
            actions.moveToElement(webElement).perform();
            System.out.print(driver.findElement(By.tagName("h5")).getText());
        });



//        List<String> names = Arrays.asList(userName.getText());



//        List<WebElement> title = userName.findElements(By.cssSelector("users"));
//        title.forEach(name -> {
//            System.out.println(name.findElement(By.tagName("h5")).getText());
//        });

//        int i = 0;
//        for (String element : names) {
//            System.out.printf("\n User number: " + i + " and User " + element);
//            i++;
//        }
    }

//    @Test
//    public void hoversTest() {
//        driver.get("https://the-internet.herokuapp.com/hovers");
//
//        WebElement userAvatar = driver.findElement(By.cssSelector("div.figure"));
//        WebElement userName = driver.findElement(By.cssSelector("div.figcaption"));
//
//        Actions actions = new Actions(driver);
//
//        List<String> names = Arrays.asList(userName.getText());
//
//        actions.moveToElement(userAvatar).perform();
//
////        List<WebElement> title = userName.findElements(By.cssSelector("users"));
////        title.forEach(name -> {
////            System.out.println(name.findElement(By.tagName("h5")).getText());
////        });
//
//        int i = 0;
//        for (String element : names) {
//            System.out.printf("\n User number: " + i + " and User " + element);
//            i++;
//        }
//    }

    @AfterTest(alwaysRun = true)
    private void afterTest() {
        driver.quit();
    }
}

