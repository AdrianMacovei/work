package org.internship;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    Login login;

    @DataProvider(name = "test_username")
    public Object[][] createDataUserName() {
        return new String[][]{
                {"adrian_m", "The username was set correctly."},
                {"adrian_mc", "The username was set correctly."},
                {"adrianm", "The username need to have 8 or more characters."},

        };
    }

    @DataProvider(name = "test_password")
    public Object[][] createDataPassword() {
        return new String[][]{
                {"Something1!", "Password is valid and was set to your account."},
                {"somepas", "New password need to have at least 8 characters"},
                {"password12!", "New password need to have at least one uppercase letter"},
                {"Password12", "New password need to contain a special character"},
                {"Password!@", "New password need to have at least one numerical character"},
                {"A" + Login.getUsername() + "!1", "New password need to not contain username"}
        };
    }

    @BeforeMethod
    public void setUp() {
        login = new Login();
        System.out.println("Make setUp for LoginTest methods");
    }

    @Test(dataProvider = "test_username", priority = 1, groups = {"test_username"},
            description = "This method will test Login Username")
    public void testLoginUsername(String username, String message) {
        System.out.println("First execute testLoginUsername");
        Assert.assertEquals(login.setUsername(username), message, "The test failed!");
    }

    @Test(dataProvider = "test_password", priority = 2, groups = {"test_password"},
            description = "This method will test Login Password")
    public void testLoginPassword(String password, String message) {
        System.out.println("Second execute testLoginPassword");
        Assert.assertEquals(login.setPassword(password), message, "The test failed!");
    }

    @AfterMethod (description = "Tear Down for all LoginTest methods")
    public void tearDown() {
        System.out.println("Now we make tear down for methods testLoginUsername and testLoginPassword");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Now we run tests from the LoginTest class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Now we finish tests from the LoginTest class");
    }

}
