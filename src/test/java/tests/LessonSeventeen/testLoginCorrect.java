package tests.LessonSeventeen;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testLoginCorrect {

    @DataProvider(name = "logins")
    public Object[][] createLogins() {
        String[][] users = {
                {"login1", "password1", "admin"},
                {"login2", "password2", "customer"},
                {"login3", "password3", "guest"}
        };

        return users;
    }

    @Test(groups = {"Login1"}, dataProvider = "logins")
    public void correctDataLoginTest(String login, String pass, String role) {
        if (role.equals("guest")) {
            throw new RuntimeException("Guest is not a user");
        }
        System.out.printf("User login: %s - User password: %s - User role: %s%n", login, pass, role);
    }

    @Test(dependsOnMethods = {"correctDataLoginTest"})
    private void dependantTest() {
        System.out.println("Dependant test");
    }
}
