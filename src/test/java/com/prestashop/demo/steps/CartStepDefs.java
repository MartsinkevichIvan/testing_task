package com.prestashop.demo.steps;

import com.prestashop.demo.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class CartStepDefs {

    @Autowired
    CartPage cartPage;

    @Given("Product {string} is added to the cart")
    public void product_is_added_to_the_cart(String productName) {
        cartPage.getHeaderContent().openCart();
        Assert.assertTrue(cartPage.getProductNames().contains(productName),
                String.format("Product '%s' has not been added to cart", productName));
    }

    @When("I navigate to cart page")
    public void navigate_to_cart_page() {
        cartPage.getHeaderContent().openCart();
    }

    @Given("I click proceed to checkout")
    public void click_proceed_to_checkout() {
        cartPage.clickProceedToCheckout();
    }

    @And("Cart contains two products")
    public void cartContainsTwoProducts() {
        Assert.assertEquals(cartPage.getProducts().size(), 2,
                "Count of products in the cart is not as expected!!!");
    }
}
