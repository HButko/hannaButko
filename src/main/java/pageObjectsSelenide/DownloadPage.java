package pageObjectsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {
    private final SelenideElement textFile = $("#content > div > a:nth-child(40)");

    public void downloadFile() {
        textFile.should(Condition.visible).should(Condition.enabled).click();
    }
}
