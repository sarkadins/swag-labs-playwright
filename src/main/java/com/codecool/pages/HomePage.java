package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage {

    private final Locator productsTextLocator;
    private final Locator menuBtnLocator;
    private final Locator logoutBtnLocator;
    private final Locator dropdownLocator;
    private final Locator backpackLocator;
    private final Locator bikeLightLocator;
    private final Locator boltTShirtLocator;
    private final Locator fleeceJacketLocator;
    private final Locator onesieLocator;
    private final Locator tShirtRedLocator;
    private final Locator backpackAddToCartLocator;
    private final Locator bikeLightAddToCartLocator;
    private final Locator boltTShirtAddToCartLocator;
    private final Locator fleeceJacketAddToCartLocator;
    private final Locator onesieAddToCartLocator;
    private final Locator tShirtRedAddToCartLocator;
    private final Locator cartBtnLocator;


    public HomePage(Page page) {
        super(page);
        this.productsTextLocator = page.locator(".title");
        this.menuBtnLocator = page.locator("#react-burger-menu-btn");
        this.logoutBtnLocator = page.locator("#logout_sidebar_link");
        this.dropdownLocator = page.locator(".product_sort_container");
        this.backpackLocator = page.locator("[data-test='item-4-title-link'] [data-test]");
        this.bikeLightLocator = page.locator("[data-test='item-0-title-link'] [data-test]");
        this.boltTShirtLocator = page.locator("[data-test='item-1-title-link'] [data-test]");
        this.fleeceJacketLocator = page.locator("[data-test='item-5-title-link'] [data-test]");
        this.onesieLocator = page.locator("[data-test='item-2-title-link'] [data-test]");
        this.tShirtRedLocator = page.locator("[data-test='item-3-title-link'] [data-test]");
        this.backpackAddToCartLocator = page.locator("#add-to-cart-sauce-labs-backpack");
        this.bikeLightAddToCartLocator = page.locator("#add-to-cart-sauce-labs-bike-light");
        this.boltTShirtAddToCartLocator = page.locator("#add-to-cart-sauce-labs-bolt-t-shirt");
        this.fleeceJacketAddToCartLocator = page.locator("#add-to-cart-sauce-labs-fleece-jacket");
        this.onesieAddToCartLocator = page.locator("#add-to-cart-sauce-labs-onesie");
        this.tShirtRedAddToCartLocator = page.locator("button#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
        this.cartBtnLocator = page.locator("div#shopping_cart_container > .shopping_cart_link");
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

    public void clickOnItem(String item) {
        switch (item) {
            case "backpack":
                backpackLocator.click();
                break;
            case "bike light":
                bikeLightLocator.click();
                break;
            case "bolt t-shirt":
                boltTShirtLocator.click();
                break;
            case "fleece jacket":
                fleeceJacketLocator.click();
                break;
            case "onesie":
                onesieLocator.click();
                break;
            case "t-shirt red":
                tShirtRedLocator.click();
                break;
        }
    }
    public void addBackpackToCart(){
        backpackAddToCartLocator.click();
    }
    public void addBikeLightToCart(){
        bikeLightAddToCartLocator.click();
    }
    public void addBoltTShirtToCart(){
        boltTShirtAddToCartLocator.click();
    }
    public void addFleeceJacketToCart(){
        fleeceJacketAddToCartLocator.click();
    }
    public void addOnesieToCart(){
        onesieAddToCartLocator.click();
    }
    public void addTShirtRedToCart(){
        tShirtRedAddToCartLocator.click();
    }
    public void clickOnCartButton(){
        cartBtnLocator.click();
    }
}
