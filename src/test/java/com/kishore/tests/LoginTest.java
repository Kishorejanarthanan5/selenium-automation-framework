package com.kishore.tests;

import com.kishore.base.BaseTest;
import com.kishore.pages.LoginPage;
import com.kishore.utils.ConfigReader;
import org.testng.Assert;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.get("validUser"), ConfigReader.get("validPassword"));
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.get("invalidUser"), ConfigReader.get("invalidPassword"));
        Assert.assertTrue(loginPage.isLoginFailed());
    }

    @Test
    public void invalidUsernameTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.get("invalidUser"), ConfigReader.get("validPassword"));
        Assert.assertTrue(loginPage.isLoginFailed());
    }

    @Test
    public void invalidPasswordTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.get("validUser"), ConfigReader.get("invalidPassword"));
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

