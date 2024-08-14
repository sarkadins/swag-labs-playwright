package com.codecool.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CartPage extends BasePage {

    private final Locator checkoutLocator;
    private final Locator firstNameFieldLocator;
    private final Locator lastNameFieldLocator;
    private final Locator zipCodeLocator;
    private final Locator continueBtnLocator;
    private final Locator finishBtnLocator;
    private final Locator orderCompleteHeaderLocator;
    private final Locator bikeLightLocator;
    private final Locator backpackLocator;
    private final Locator onesieLocator;
    private final Locator boltTShirtLocator;
    private final Locator fleeceJacketLocator;
    private final Locator tShirtRedLocator;

    public CartPage(Page page) {
        super(page);
        this.checkoutLocator = page.locator("#checkout");
        this.firstNameFieldLocator = page.locator("#first-name");
        this.lastNameFieldLocator = page.locator("#last-name");
        this.zipCodeLocator = page.locator("#postal-code");
        this.continueBtnLocator = page.locator("#continue");
        this.finishBtnLocator = page.locator("#finish");
        this.orderCompleteHeaderLocator = page.locator(".complete-header");
        this.bikeLightLocator = page.locator("[data-test='item-0-title-link'] [data-test]");
        this.backpackLocator = page.locator("[data-test='item-4-title-link'] [data-test]");
        this.onesieLocator = page.locator("[data-test='item-2-title-link'] [data-test]");
        this.boltTShirtLocator = page.locator("[data-test='item-1-title-link'] [data-test]");
        this.fleeceJacketLocator = page.locator("[data-test='item-5-title-link'] [data-test]");
        this.tShirtRedLocator = page.locator("[data-test='item-3-title-link'] [data-test]");
    }
    private void clickCheckout() {
        checkoutLocator.click();
    }
    private void fillPostalInformation(){
        firstNameFieldLocator.fill("John");
        lastNameFieldLocator.fill("Doe");
        zipCodeLocator.fill("12345");
    }
    private void clickContinue() {
        continueBtnLocator.click();
    }
    private void clickFinish() {
        finishBtnLocator.click();
    }
    public String getOrderCompleteMessage(){
        return orderCompleteHeaderLocator.textContent();
    }
    public void handleOrder(){
        clickCheckout();
        fillPostalInformation();
        clickContinue();
        clickFinish();
    }
    public boolean hasBikeLightText(){
        return bikeLightLocator.textContent().contains("Bike Light");
    }
    public boolean hasBackpackText(){
        return backpackLocator.textContent().contains("Backpack");
    }
    public boolean hasOneSieText(){
        return onesieLocator.textContent().contains("Onesie");
    }
    public boolean hasBoltTShirtText(){
        return boltTShirtLocator.textContent().contains("Bolt T-Shirt");
    }
    public boolean hasFleeceJacketText(){
        return fleeceJacketLocator.textContent().contains("Fleece Jacket");
    }
    public boolean hasTShirtRedText(){
        return tShirtRedLocator.textContent().contains("T-Shirt (Red)");
    }
}
