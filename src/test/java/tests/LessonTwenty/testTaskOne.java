package tests.LessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

// https://the-internet.herokuapp.com/challenging_dom - нужно кликнуть на каждую кнопку.
// после этого нужно выбрать все значения из 4й колонки и вывести на экран.
// Уточнение: число внизу, которое меняется по клику, отрисовывается динамически, его достать нельзя,
// потому не нужно проверять что оно изменилось после клика

public class testTaskOne {

    @Test
    private void tableLocatorTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        WebElement button = driver.findElement(By.cssSelector(".button[class='button']"));
        button.click();

        WebElement buttonAlert = driver.findElement(By.cssSelector(".button[class='button alert']"));
        buttonAlert.click();

        WebElement buttonSuccess = driver.findElement(By.cssSelector(".button[class='button success']"));
        buttonSuccess.click();

        WebElement tableColumnHeader = driver.findElement(By.cssSelector("table tr th:nth-child(4)"));
        System.out.printf("\n Column header: " + tableColumnHeader.getText());

        List<WebElement> tableColumnElements = driver.findElements(By.cssSelector("tr td:nth-child(4)"));
        int i = 0;
        for (WebElement element : tableColumnElements) {
            System.out.printf("\n Cell number:  " + i + " and cell value: " + element.getText());
            i++;
        }

        driver.quit();
    }
}
