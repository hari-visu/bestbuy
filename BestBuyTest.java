package com.guvi.tests;

import com.guvi.base.BaseTest;
import com.guvi.pages.*;

public class BestBuyTest extends BaseTest {
    public static void main(String[] args) {
        setUp();

        try {
            HomePage home = new HomePage(driver);
            home.openBestBuy();
            home.selectCountry();
            home.openAccountMenu();

            SignupPage signup = new SignupPage(driver);
            signup.createAccount("Siva", "Kumar", "123testing@mailinator2.com", "sivakumar123", "9489756132");

            SearchPage search = new SearchPage(driver);
            search.searchProduct("laptop");

            CartPage cart = new CartPage(driver);
            cart.addToCart();
            cart.proceedToCheckout();

            PaymentPage payment = new PaymentPage(driver);
            payment.enterPaymentDetails("123testing@mailinator2.com", "9489756132", "4012888888881881", "1225", "456", "Siva", "Kumar", "123 Street", "NY", 3, "45689", "passwordis1234567");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tearDown();
        }
    }
}
