package tests.LessonTwenty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.TablePage;
import tests.BaseTest;

import java.util.List;

// https://the-internet.herokuapp.com/challenging_dom - нужно кликнуть на каждую кнопку.
// после этого нужно выбрать все значения из 4й колонки и вывести на экран.
// Уточнение: число внизу, которое меняется по клику, отрисовывается динамически, его достать нельзя,
// потому не нужно проверять что оно изменилось после клика

public class testTaskOne extends BaseTest {

    @Test
    public void tableLocatorTest() {
        TablePage tablePage = openApp().goToTablePage();
        tablePage.blueButton();
        tablePage.redButton();
        tablePage.greenButton();

        System.out.printf("\n Column header: " + tablePage.tableTitle());

        List<WebElement> tableColumnElements = webDriver.findElements(By.cssSelector("tr td:nth-child(4)"));
        int i = 0;
        for (WebElement element : tableColumnElements) {
            System.out.printf("\n Cell number:  " + i + " and cell value: " + element.getText());
            i++;
        }
    }
}
