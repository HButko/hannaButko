package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    protected Actions actions;
    protected JavascriptExecutor jsExecutor;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 10);
        this.actions = new Actions(webDriver);
        this.jsExecutor = (JavascriptExecutor) webDriver;
    }

//    protected void clickButton(WebElement button) {
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(button));
//    }

}
