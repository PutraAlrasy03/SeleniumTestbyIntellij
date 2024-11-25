package Part2.com.saucedemo.test.login;

import Part2.com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("abc123");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
