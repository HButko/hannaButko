package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage extends BasePage {

    @FindBy(css = "div.figure")
    private WebElement userImage;

    @FindBy(css = "div.figure h5")
    private WebElement userName;

    public HoversPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void userAvatar() {
        userImage.isEnabled();
    }

    public void userData() {
        webDriver.findElements(By.cssSelector("div.figure h5"));
    }
}
