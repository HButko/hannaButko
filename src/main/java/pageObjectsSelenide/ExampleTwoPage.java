package pageObjectsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ExampleTwoPage {
    private final SelenideElement startButton = $("#start > button");
    private final SelenideElement loader = $("#loading");
    private final SelenideElement result = $("#finish > h4");

    @Step("Press start button")
    public void pressStartButton(){
        startButton.should(Condition.visible).should(Condition.enabled).click();
    }

    @Step("Verify loader")
    public void verifyLoader(){
        loader.should(Condition.visible).should(Condition.disappear, Duration.ofSeconds(30));
    }

    @Step("Verify result")
    public ExampleTwoPage verifyResult(){
        result.should(Condition.visible).shouldHave(Condition.text("Hello World!"));
        return new ExampleTwoPage();
    }
}
