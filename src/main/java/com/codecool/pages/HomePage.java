package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    private final Locator productsTextLocator;
    private final Locator menuBtnLocator;
    private final Locator logoutBtnLocator;
    private final Locator dropdownLocator;

    public HomePage(Page page) {
        super(page);
        this.productsTextLocator = page.locator(".title");
        this.menuBtnLocator = page.locator("#react-burger-menu-btn");
        this.logoutBtnLocator = page.locator("#logout_sidebar_link");
        this.dropdownLocator = page.locator(".product_sort_container");

    }

    public String getProductsText() {
        return productsTextLocator.textContent();
    }

    public void logout() {
        menuBtnLocator.click();
        logoutBtnLocator.click();
    }

    public void listProductsByNameAToZ() {
        dropdownLocator.click();
        dropdownLocator.selectOption("az");
    }

    public void listProductsByNameZToA() {
        dropdownLocator.click();
        dropdownLocator.selectOption("za");
    }
    public void listProductsByPriceLowToHigh(){
        dropdownLocator.click();
        dropdownLocator.selectOption("lohi");
    }
    public void listProductsByPriceHighToLow(){
        dropdownLocator.click();
        dropdownLocator.selectOption("hilo");
    }

}
