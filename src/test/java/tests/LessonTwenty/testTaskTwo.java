package tests.LessonTwenty;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SecurePage;
import tests.BaseTest;

// https://the-internet.herokuapp.com/login - написать 2 теста, на корректный и некорректный логин.
// В первом случае - проверить, что отображается сообщение "You logged into a secure area!",
// во втором сообщение об ошибке логина/пароля

public class testTaskTwo extends BaseTest {

    @Test
    public void loginCorrectLocatorTest() {
        SecurePage securePage = openApp().goToLoginPage()
                .setUserName("tomsmith")
                .setPass("SuperSecretPassword!")
                .loginButton();

        String alertText = securePage.getAlertText();
        Assert.assertTrue(alertText.contains("Welcome to the Secure Area."), "Invalid page");

        securePage.logout();
    }

    @Test
    public void loginIncorrectLocatorTest() {
        LoginPage loginPage = openApp().goToLoginPage()
                .invalidCredLogin("test", "test")
                .loginButtonClick();

        String getError = loginPage.getErrorText();

        Assert.assertTrue(getError.contains("Your username is invalid!"), "Invalid page");
    }
}
