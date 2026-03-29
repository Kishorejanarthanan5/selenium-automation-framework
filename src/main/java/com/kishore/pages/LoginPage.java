package com.kishore.pages;

import com.kishore.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By loginBtn = By.id("js-login-btn");

    public boolean isLoginFailed() {
        return isElementDisplayed(username);
    }

    private By dashboardHeader = By.cssSelector(".page-heading");
    public boolean isLoginSuccessful() {
        return isElementDisplayed(dashboardHeader);
    }

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
    }
}