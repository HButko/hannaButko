package pageObjectsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {
    private final SelenideElement textFile = $("#content > div > a:nth-child(40)");

    @Step("Download file")
    public void downloadFile() {
        textFile.should(Condition.visible).should(Condition.enabled).click();
    }
}
