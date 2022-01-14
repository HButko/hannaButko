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


//https://crossbrowsertesting.github.io/drag-and-drop.html - написать тест, который будет перетаскивать
// элементы и проверять результат (Dropped!)

public class testDrugAndDrop {
    private WebDriver driver;

    @BeforeTest
    private void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void drugAndDropTest() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement item = driver.findElement(By.id("draggable"));
        WebElement place = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(item, place).perform();

        Assert.assertEquals(place.getText().contains("Dropped!"), place.getText().contains("Dropped!"), "Wrong message");
    }

    @AfterTest(alwaysRun = true)
    private void afterTest() {
        driver.quit();
    }
}
