package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadResultPage extends BasePage {

    @FindBy(css = "#uploaded-files")
    private WebElement fileUploaded;

    public UploadResultPage() {
        PageFactory.initElements(webDriver, this);
    }

    @Step("Upload file")
    public UploadPage fileUploaded() {
       this.fileUploaded.getText();
       return new UploadPage();
    }
}
