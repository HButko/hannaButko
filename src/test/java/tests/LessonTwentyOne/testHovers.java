package tests.LessonTwentyOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.List;

//https://the-internet.herokuapp.com/hovers - написать тест,
// который выводит юзернейм каждого пользователя (для этого нужно навести мышку на аватар)

public class testHovers extends BaseTest {

    @Test
    public void hoversTest() {
        openApp().goToHoversPage();
        Actions actions = new Actions(webDriver);
        List<WebElement> userAvatar = webDriver.findElements(By.cssSelector("div.figure"));

        for (int i = 0; i < userAvatar.size(); i++) {
            actions.moveToElement(userAvatar.get(i)).perform();
            System.out.print(webDriver.findElements(By.cssSelector("div.figure h5")).get(i).getText());
        }
    }
}

