package com.guvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class CartPage {
    private WebDriver driver;
    private JavascriptExecutor js;
    
    private By addToCartButton = By.xpath("//button[text()='Add to Cart']");
    private By cartButton = By.xpath("//span[text()='Cart']");
    private By checkoutButton = By.xpath("//button[text()='Checkout']");
    private By continueAsGuestButton = By.xpath("//button[text()='Continue as Guest']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void addToCart() throws InterruptedException {
        js.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(3000);
        driver.findElement(addToCartButton).click();
    }

    public void proceedToCheckout() throws InterruptedException {
        driver.findElement(cartButton).click();
        Thread.sleep(3000);
        driver.findElement(checkoutButton).click();
        Thread.sleep(3000);
        driver.findElement(continueAsGuestButton).click();
    }
}
