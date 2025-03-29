package com.guvi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    private WebDriver driver;

    private By createAccountButton = By.xpath("//a[@data-testid='createAccountButton']");
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By emailField = By.id("email");
    private By passwordField = By.id("fld-p1");
    private By reenterPasswordField = By.id("reenterPassword");
    private By phoneField = By.id("phone");
    private By submitButton = By.xpath("//button[@type='submit']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void createAccount(String firstName, String lastName, String email, String password, String phone) throws InterruptedException {
        driver.findElement(createAccountButton).click();
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(reenterPasswordField).sendKeys(password);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(submitButton).click();
        Thread.sleep(2000);
    }
}
