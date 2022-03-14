package pageObjectsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPage {
    private final SelenideElement exampleOne = $("#content > div > a:nth-child(5)");
    private final SelenideElement exampleTwo = $("#content > div > a:nth-child(8)");

    @Step("Open first loading page")
    public void openExampleOnePage(){
        exampleOne.should(Condition.visible).should(Condition.enabled).click();
    }

    @Step("Open second loading page")
    public void openExampleTwoPage(){
        exampleTwo.should(Condition.visible).should(Condition.enabled).click();
    }
}
