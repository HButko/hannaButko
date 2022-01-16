package tests.LessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// https://the-internet.herokuapp.com/geolocation - кликнуть на кнопку, и после клика - достать значения координат,
// которые будут выводиться на экран. После клика нужно вставить задержку, иначе код может падать.
// Проще всего сделать через Thread.sleep(1000) (также нужно обработать исключение)

public class testTaskThree {
    private WebDriver driver;

    @BeforeTest
    private void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void locationLocatorTest() {
        driver.get("https://the-internet.herokuapp.com/geolocation");
        WebDriverWait driverWait = new WebDriverWait(driver, 5);

        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();

//        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#map-link")));

        WebElement resultLatValue = driver.findElement(By.xpath("//div[@id='lat-value']"));
        WebElement resultLongValue = driver.findElement(By.xpath("//div[@id='long-value']"));

//        System.out.printf("\n Latitude: " + resultLatValue.getText() + "\n Longitude: " + resultLongValue.getText());

        Assert.assertTrue(resultLatValue.getText().contains("50.4758272"), "Invalid latitude");
        Assert.assertTrue(resultLongValue.getText().contains("30.4381952"), "Invalid longitude");
    }

    @AfterTest
    private void afterTest() {
        driver.quit();
    }

//    private ExpectedCondition<Boolean> driverWaiters(WebElement elemets) {
//        return new ExpectedCondition<Boolean>() {
//            @NullableDecl
//            @Override
//            public Boolean apply(@NullableDecl WebDriver webDriver) {
//                elemets.
//            }
//        }
//    }
}
