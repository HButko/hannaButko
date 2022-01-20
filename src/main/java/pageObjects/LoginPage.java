package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css = "[name='username']")
    private WebElement userNameInput;

    @FindBy(css = "[name='password']")
    private WebElement passInput;

    @FindBy(xpath = "//button")
    private WebElement loginButton;

    @FindBy(css = "div#flash.flash.error")
    private WebElement errorMessage;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public LoginPage setUserName(String userName) {
        userNameInput.sendKeys(userName);
        return this;
    }

    public LoginPage setPass(String password) {
        passInput.sendKeys(password);
        return this;
    }

    public SecurePage loginButton() {
        loginButton.click();
        return new SecurePage(webDriver);
    }

    public LoginPage loginButtonClick() {
        loginButton.click();
        return new LoginPage(webDriver);
    }

    public SecurePage login(String userName, String password) {
        this.setUserName(userName);
        this.setPass(password);
        return this.loginButton();
    }

    public LoginPage invalidCredLogin(String userName, String password) {
        this.setUserName(userName);
        this.setPass(password);
        return this.loginButtonClick();
    }

    public String getErrorText() {
        return errorMessage.getText();
    }
}
