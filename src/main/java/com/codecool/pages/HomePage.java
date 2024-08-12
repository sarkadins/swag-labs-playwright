package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    private final Locator productsTextLocator;

    public HomePage(Page page) {
        super(page);
        this.productsTextLocator = page.locator(".title");
    }
    public String getProductsText(){
        return productsTextLocator.textContent();
    }
}
