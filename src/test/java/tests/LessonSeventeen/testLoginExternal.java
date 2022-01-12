package tests.LessonSeventeen;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testLoginExternal {
    @Test(groups = {"Login2"})
    @Parameters({"login", "pass", "role"})
    public void externalDataLoginTest(String login, String pass, String role) {
        System.out.printf("User login: %s - User password: %s - User role: %s%n", login, pass, role);

        Assert.assertEquals(login, "userlogin", "User login is incorrect");
        Assert.assertEquals(pass, "password", "User password is incorrect");
        Assert.assertEquals(role, "userrole", "User role is incorrect");
    }
}
