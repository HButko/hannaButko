package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage extends BasePage {

    @FindBy (linkText = "dummy.txt")
    private WebElement dummyTextFile;

    public DownloadPage() {
        PageFactory.initElements(webDriver, this);
    }

    @Step("Get file")
    public DownloadPage getFile() {
        dummyTextFile.click();
        return new DownloadPage();
    }
}
