package com.prestashop.demo.steps;

import com.prestashop.demo.pages.OrderConfirmationPage;
import com.prestashop.demo.util.StringConstant;
import com.prestashop.demo.util.TestContext;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.util.List;

public class OrderConfirmationPageStepDefs {

    @Autowired
    OrderConfirmationPage orderConfirmationPage;


    @And("Products displayed on order confirmation page")
    public void products_displayed_on_order_confirmation_page() {

        List<String> actualProducts = orderConfirmationPage.getProductNames();
        List<String> expectedProducts = TestContext.stringList;

        Assert.assertEquals(actualProducts.size(), 2, "Count of products is not as expected!!!");

        boolean allContainSubstring = expectedProducts.stream().allMatch(expectedProductName ->
                actualProducts.stream().anyMatch(actualProductName -> actualProductName.contains(expectedProductName)));

        Assert.assertTrue(allContainSubstring, "Not all products displayed on order confirmation page!!!");
    }

    @And("Order confirmation page is opened")
    public void order_confirmation_page_is_opened() {
        Assert.assertTrue(orderConfirmationPage.getTitle().contains(StringConstant.ORDER_CONFIRMATION_TITLE),
                "Order is not confirmed!!!");
    }
}
