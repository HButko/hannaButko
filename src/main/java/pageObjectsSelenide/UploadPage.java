package pageObjectsSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    private final SelenideElement fileInput = $("input[type='file']");
    private final SelenideElement submitButton = $("#file-submit");
    private final SelenideElement uploadVerification = $("#content > div > h3");

    @Step("Upload file")
    public void setFileInInput(File pathname) {
        fileInput.should(Condition.visible).should(Condition.enabled).sendKeys(pathname.getAbsolutePath());
    }

    @Step("Submit file upload")
    public void submitFileUpload() {
        submitButton.should(Condition.visible).should(Condition.enabled).click();
    }

    @Step("Verify file upload")
    public void uploadVerification() {
        uploadVerification.should(Condition.visible).shouldBe(Condition.appear);
    }
}
