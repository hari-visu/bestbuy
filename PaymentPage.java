package com.guvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {
    private WebDriver driver;
    private JavascriptExecutor js;
    
    private By emailField = By.name("emailAddress");
    private By phoneField = By.name("phone");
    private By continuePaymentButton = By.xpath("//span[text()='Continue to Payment Information']");
    
    private By cardNumberField = By.xpath("//input[@id='cc-number']");
    private By expirationDateField = By.name("expirationDate");
    private By cvvField = By.name("cvv");

    private By firstNameField = By.xpath("//input[@id='first-name']");
    private By lastNameField = By.id("last-name");
    private By addressField = By.id("address-input");
    private By cityField = By.id("city");
    private By stateDropdown = By.id("state");
    private By postalCodeField = By.id("postalCode");

    private By createPasswordField = By.xpath("//input[@id='create-account-password-form-show-password']");
    private By createAccountButton = By.xpath("//span[text()='Create Account']");
    private By placeOrderButton = By.xpath("//span[text()='Place Your Order']");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void enterPaymentDetails(String email, String phone, String cardNumber, String expDate, String cvv, String firstName, String lastName, String address, String city, int stateIndex, String postalCode, String password) throws InterruptedException {
        js.executeScript("window.scrollBy(0, 800)");
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(continuePaymentButton).click();
        
        Thread.sleep(7000);
        driver.findElement(cardNumberField).sendKeys(cardNumber);
        driver.findElement(expirationDateField).sendKeys(expDate);
        driver.findElement(cvvField).sendKeys(cvv);
        
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 300)");
        
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(cityField).sendKeys(city);
        
        Select select = new Select(driver.findElement(stateDropdown));
        select.selectByIndex(stateIndex);
        
        driver.findElement(postalCodeField).sendKeys(postalCode);
        
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 500)");
        driver.findElement(createPasswordField).sendKeys(password);
        driver.findElement(createAccountButton).click();
        Thread.sleep(5000);
        driver.findElement(placeOrderButton).click();

        System.out.println("Clicked on 'Place Your Order' button.");
    }
}
