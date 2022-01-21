package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecurePage extends BasePage {

    @FindBy(css = "html body div div h4")
    private WebElement alertMessage;

    @FindBy(css = ".button.secondary.radius")
    private WebElement logoutButton;

    public SecurePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public String getAlertText() {
        return alertMessage.getText();
    }

    public LoginPage logout() {
        this.logoutButton.click();
        return new LoginPage(webDriver);
    }
}
