package tests.LessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

        WebElement inputName = driver.findElement(By.cssSelector("[name='username']"));
        inputName.clear();
        inputName.sendKeys("tomsmith");

        WebElement inputPass = driver.findElement(By.cssSelector("[name='password']"));
        inputPass.clear();
        inputPass.sendKeys("SuperSecretPassword!");

        WebElement buttonLogin = driver.findElement(By.xpath("//button"));
        buttonLogin.click();

        WebElement result = driver.findElement(By.cssSelector("html body div div h4"));

        Assert.assertTrue(result.getText().contains("Welcome to the Secure Area."), "Invalid page");

        driver.quit();
    }

    @Test
    private void loginIncorrectLocatorTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement inputName = driver.findElement(By.cssSelector("[name='username']"));
        inputName.clear();
        inputName.sendKeys("test");

        WebElement inputPass = driver.findElement(By.cssSelector("[name='password']"));
        inputPass.clear();
        inputPass.sendKeys("test");

        WebElement buttonLogin = driver.findElement(By.xpath("//button"));
        buttonLogin.click();

        WebElement result = driver.findElement(By.cssSelector("div#flash.flash.error"));

        Assert.assertTrue(result.getText().contains("Your username is invalid!"), "Invalid page");

        driver.quit();
    }
}
