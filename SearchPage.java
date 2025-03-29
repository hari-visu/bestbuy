package com.guvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;
    private By searchBox = By.id("gh-search-input");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        WebElement searchElement = driver.findElement(searchBox);
        searchElement.sendKeys(productName);
        searchElement.sendKeys(Keys.RETURN);
    }
}
