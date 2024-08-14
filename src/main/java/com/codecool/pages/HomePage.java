package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    private final Locator productsTextLocator;
    private final Locator menuBtnLocator;
    private final Locator logoutBtnLocator;
    private final Locator dropdownLocator;
    private final Locator backPackLocator;
    private final Locator bikeLightLocator;
    private final Locator boltTShirtLocator;
    private final Locator fleeceJacketLocator;
    private final Locator onesieLocator;
    private final Locator tShirtRedLocator;

    public HomePage(Page page) {
        super(page);
        this.productsTextLocator = page.locator(".title");
        this.menuBtnLocator = page.locator("#react-burger-menu-btn");
        this.logoutBtnLocator = page.locator("#logout_sidebar_link");
        this.dropdownLocator = page.locator(".product_sort_container");
        this.backPackLocator = page.locator("[data-test='item-4-title-link'] [data-test]");
        this.bikeLightLocator = page.locator("[data-test='item-0-title-link'] [data-test]");
        this.boltTShirtLocator = page.locator("[data-test='item-1-title-link'] [data-test]");
        this.fleeceJacketLocator = page.locator("[data-test='item-5-title-link'] [data-test]");
        this.onesieLocator = page.locator("[data-test='item-2-title-link'] [data-test]");
        this.tShirtRedLocator = page.locator("[data-test='item-3-title-link'] [data-test]");
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

    public void listProductsByPriceLowToHigh() {
        dropdownLocator.click();
        dropdownLocator.selectOption("lohi");
    }

    public void listProductsByPriceHighToLow() {
        dropdownLocator.click();
        dropdownLocator.selectOption("hilo");
    }
    public void clickOnItem(String item){
        switch (item){
            case "backpack": backPackLocator.click(); break;
            case "bike light": bikeLightLocator.click(); break;
            case "bolt t-shirt": boltTShirtLocator.click(); break;
            case "fleece jacket": fleeceJacketLocator.click(); break;
            case "onesie": onesieLocator.click(); break;
            case "t-shirt red": tShirtRedLocator.click(); break;
        }
    }
}
