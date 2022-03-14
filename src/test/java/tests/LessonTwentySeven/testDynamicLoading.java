package tests.LessonTwentySeven;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsSelenide.DynamicLoadingPage;
import pageObjectsSelenide.ExampleOnePage;
import pageObjectsSelenide.ExampleTwoPage;

import static com.codeborne.selenide.Selenide.open;

//Написать PageObject и тест для https://the-internet.herokuapp.com/dynamic_loading
// (можно выбрать один из пунктов, или оба, по желанию).
// После клика на кнопку - дождаться появления текста на странице и его проверить в ассерте в тесте.
public class testDynamicLoading {

    @Test
    public void testDynamicLoadExampleOne() {
        String dynLoadPageLink = "https://the-internet.herokuapp.com/dynamic_loading";
        open(dynLoadPageLink);
        DynamicLoadingPage loadingPage = new DynamicLoadingPage();

        //Example 1
        loadingPage.openExampleOnePage();
        ExampleOnePage exampleOne = new ExampleOnePage();
        exampleOne.pressStartButton();
        exampleOne.verifyLoader();

        String results = String.valueOf(exampleOne.verifyResult());
        Assert.assertFalse(results.contains("Hello World!"), "Test is failed");
    }

    @Test
    public void testDynamicLoadExampleTwo() {
        String dynLoadPageLink = "https://the-internet.herokuapp.com/dynamic_loading";
        open(dynLoadPageLink);
        DynamicLoadingPage loadingPage = new DynamicLoadingPage();

        //Example 2
        loadingPage.openExampleTwoPage();
        ExampleTwoPage exampleTwo = new ExampleTwoPage();
        exampleTwo.pressStartButton();
        exampleTwo.verifyLoader();

        String results = String.valueOf(exampleTwo.verifyResult());
        Assert.assertTrue(results.contains("Hello World!"), "Test is failed");
    }
}
