package com.prestashop.demo.steps;

import com.prestashop.demo.pages.HomePage;
import com.prestashop.demo.pages.ProductPage;
import com.prestashop.demo.util.TestContext;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePageStepDefs {

    @Autowired
    HomePage homePage;

    @Autowired
    ProductPage productPage;

    @Given("I add product {string} to the cart")
    public void add_product_to_the_cart(String productName) {
        TestContext.addToStringList(productName);
        homePage.getHeaderContent().openHomePageByClickingLogo();
        homePage.selectProduct(productName);
        productPage.clickAddToCart();
    }
}
