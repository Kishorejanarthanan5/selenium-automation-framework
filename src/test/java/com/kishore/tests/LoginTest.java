package com.kishore.tests;

import com.kishore.base.BaseTest;
import com.kishore.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("cxh04@tempumail.cc", "ILoveDrive#08");
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrong@test.com", "wrongpass");
        Assert.assertTrue(loginPage.isLoginFailed());
    }


//    @Test(dataProvider = "loginData")
//    public void testLogin(String username, String password, boolean isValid) {
//
//        LoginPage loginPage = new LoginPage(driver);
//
//        loginPage.login(username, password);
//
//        if (isValid) {
//            Assert.assertTrue(loginPage.isLoginSuccessful());
//        } else {
//            Assert.assertTrue(loginPage.isLoginFailed());
//        }
//    }
//
//    @DataProvider(name = "loginData")
//    public Object[][] getLoginData() {
//        return new Object[][]{
//                {"cxh04@tempumail.cc", "ILoveDrive#08", true},   // valid
//                {"wrong@test.com", "wrong", false}               // invalid
//        };
//    }
}

