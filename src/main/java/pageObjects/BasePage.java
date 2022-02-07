package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverSingleton;


public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    protected Actions actions;
    protected JavascriptExecutor jsExecutor;

    public BasePage() {
        this.webDriver = DriverSingleton.getDriver();
        this.webDriverWait = new WebDriverWait(webDriver, 10);
        this.actions = new Actions(webDriver);
        this.jsExecutor = (JavascriptExecutor) webDriver;
    }
}
