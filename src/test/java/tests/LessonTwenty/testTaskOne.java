package tests.LessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
    }
}
