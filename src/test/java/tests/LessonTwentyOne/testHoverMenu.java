package tests.LessonTwentyOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
    public void hoverMenuTest() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        WebDriverWait driverWait = new WebDriverWait(driver, 5);

        WebElement dropdownMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Dropdown')]"));
        WebElement secondaryMenu = driver.findElement(By.xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu')]"));
        WebElement secondaryAction = driver.findElement(By.xpath("//a[contains (text(), 'Secondary Action')]"));
        WebElement secondaryPage = driver.findElement(By.cssSelector("div.jumbotron.secondary-clicked"));

        Actions actions = new Actions(driver);

        actions.click(dropdownMenu).perform();
        driverWait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("//a[@class='dropdown-toggle' and contains(text(), 'Secondary Menu')]")));

        actions.click(secondaryMenu).perform();
        driverWait.until(ExpectedConditions.elementToBeClickable(By
                .xpath("//a[contains (text(), 'Secondary Action')]")));

        actions.click(secondaryAction).perform();

        Assert.assertEquals(secondaryPage.getText().contains("Secondary Page"), secondaryPage.getText().contains("Secondary Page"),
                "Wrong page");
    }

    @AfterTest(alwaysRun = true)
    private void afterTest() {
        driver.quit();
    }
}
