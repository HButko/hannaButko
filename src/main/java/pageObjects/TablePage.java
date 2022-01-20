package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage extends BasePage {

    @FindBy(css = ".button[class='button']")
    private WebElement buttonOne;

    @FindBy(css = ".button[class='button alert']")
    private WebElement buttonTwo;

    @FindBy(css = ".button[class='button success']")
    private WebElement buttonThree;

    @FindBy(css = "table tr th:nth-child(4)")
    private WebElement tableHeader;

    public TablePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void blueButton() {
        buttonOne.click();
    }

    public void redButton() {
        buttonTwo.click();
    }

    public void greenButton() {
        buttonThree.click();
    }

    public String tableTitle() {
        return tableHeader.getText();
    }
}
