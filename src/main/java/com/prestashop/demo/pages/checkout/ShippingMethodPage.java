package com.prestashop.demo.pages.checkout;

import com.prestashop.demo.pages.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class ShippingMethodPage extends AbstractPage {

    private final By continueCTA = By.xpath("//section[@id='checkout-delivery-step']//button[@class='continue btn btn-primary float-xs-right']");

    public void clickContinue(){
        $(continueCTA).click();
    }
}
