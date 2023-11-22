package com.prestashop.demo.pages.checkout;

import com.codeborne.selenide.Condition;
import com.prestashop.demo.pages.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

@Component
public class PaymentPage extends AbstractPage {

    private final By creditCard = By.xpath("//*[@id='payment-option-1-container']//input");
    private final By agreement = By.xpath("//label[@class='js-terms']/..");
    private final By placeOrder = By.xpath("//div[@class='ps-shown-by-js']/button");


    public void selectPaymentMethod(){
        $(creditCard).click();
        $(agreement).click();
        $(placeOrder).shouldNotBe(Condition.disabled, Duration.ofSeconds(5)).click();
    }
}
