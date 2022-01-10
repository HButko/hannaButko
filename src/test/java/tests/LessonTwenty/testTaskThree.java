package tests.LessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// https://the-internet.herokuapp.com/geolocation - кликнуть на кнопку, и после клика - достать значения координат,
// которые будут выводиться на экран. После клика нужно вставить задержку, иначе код может падать.
// Проще всего сделать через Thread.sleep(1000) (также нужно обработать исключение)

public class testTaskThree {

    @Test
    private void locationLocatorTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/geolocation");

        WebElement searchButton = driver.findElement(By.xpath("//button"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement resultLatValue = driver.findElement(By.xpath("//div[@id='lat-value']"));
        WebElement resultLongValue = driver.findElement(By.xpath("//div[@id='long-value']"));

//        System.out.printf("\n Latitude: " + resultLatValue.getText() + "\n Longitude: " + resultLongValue.getText());

        Assert.assertTrue(resultLatValue.getText().contains("50.4758272"), "Invalid latitude");
        Assert.assertTrue(resultLongValue.getText().contains("30.4381952"), "Invalid longitude");

        driver.quit();
    }
}
