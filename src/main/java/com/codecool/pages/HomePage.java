package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    private final Locator productsTextLocator;
    private final Locator menuBtnLocator;
    private final Locator logoutBtnLocator;

    public HomePage(Page page) {
        super(page);
        this.productsTextLocator = page.locator(".title");
        this.menuBtnLocator = page.locator("#react-burger-menu-btn");
        this.logoutBtnLocator = page.locator("#logout_sidebar_link");
    }
    public String getProductsText(){
        return productsTextLocator.textContent();
    }
    public void logout(){
        menuBtnLocator.click();
        logoutBtnLocator.click();
    }
}
