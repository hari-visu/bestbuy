package com.guvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    
    private By countrySelection = By.xpath("//img[@alt='United States']");
    private By accountMenu = By.id("account-menu-account-button");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBestBuy() {
        driver.get("https://www.bestbuy.com/");
    }

    public void selectCountry() {
        driver.findElement(countrySelection).click();
    }

    public void openAccountMenu() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(accountMenu).click();
    }
}
