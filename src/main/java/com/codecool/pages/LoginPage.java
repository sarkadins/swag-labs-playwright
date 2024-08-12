package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {

    private final Locator usernameLocator;
    private final Locator passwordLocator;
    private final Locator loginBtnLocator;

    public LoginPage(Page page) {
        super(page);
        this.usernameLocator = page.locator("#user-name");
        this.passwordLocator = page.locator("#password");
        this.loginBtnLocator = page.locator("#login-button");
    }
    public void login(String username, String password){
        usernameLocator.fill(username);
        passwordLocator.fill(password);
        loginBtnLocator.click();
    }
}
