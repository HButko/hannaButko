package tests.LessonTwentyOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//https://crossbrowsertesting.github.io/hover-menu.html - написать тест, который раскрывает dropdown-меню,
// кликает на пункт Secondary Action и проверяет, что текст "Secondary Page" отобразился на странице

public class testHoverMenu {
    private WebDriver driver;

    @BeforeTest
    private void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void hoverMenuTest() throws InterruptedException {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        WebElement dropdownMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Dropdown')]"));
        WebElement secondaryMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu')]"));
        WebElement secondaryAction = driver.findElement(By.xpath("//a[contains (text(), 'Secondary Action')]"));
        WebElement secondaryPage = driver.findElement(By.cssSelector("div.jumbotron.secondary-clicked"));

        Actions actions = new Actions(driver);

        actions.click(dropdownMenu).perform();
        Thread.sleep(1000);

        actions.click(secondaryMenu).perform();
        Thread.sleep(1000);

        actions.click(secondaryAction).perform();

        Assert.assertEquals(secondaryPage.getText().contains("Secondary Page"), secondaryPage.getText().contains("Secondary Page"),
                "Wrong page");
    }

    @AfterTest(alwaysRun = true)
    private void afterTest() {
        driver.quit();
    }
}
