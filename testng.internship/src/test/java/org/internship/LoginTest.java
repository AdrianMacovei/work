package org.internship;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    Login login;

    @DataProvider(name = "test_username")
    public Object[][] createDataUserName() {
        return new String[][]{
                {"adrian_macovei", "The username was set correctly."},
                {"adrianm", "The username need to have 8 or more characters."},

        };
    }

    @DataProvider(name = "test_password")
    public Object[][] createDataPassword() {
        return new String[][]{
                {"012345678912", "The password was set correctly."},
                {"something12", "The password need to have 12 or more characters."},

        };
    }


    @BeforeMethod(alwaysRun = false)
    public void setUp() {
        login = new Login();
    }

    @Test(dataProvider = "test_username", priority = 1)
    public void testLoginUsername(String username, String message) {
        System.out.println("This is first executed");
        Assert.assertEquals(login.setUsername(username), message, "The test failed!");
    }

    @Test(dataProvider = "test_password", priority = 2)
    public void testLoginPassword(String password, String message) {
        System.out.println("This is second executed");
        Assert.assertEquals(login.setPassword(password), message, "The test failed!");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test 2");
    }
}
