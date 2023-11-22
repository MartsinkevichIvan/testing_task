package com.prestashop.demo.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class ProductPage extends AbstractPage {

    private final By btnAddToCart = By.cssSelector(".btn.btn-primary.add-to-cart");

    public void clickAddToCart(){
        $(btnAddToCart).click();
        modalContent.clickContinueShopping();
        modalContent.waitUntilBtnContinueDisappear();
    }

}
