package com.prestashop.demo.fragments;

import com.codeborne.selenide.Condition;
import com.prestashop.demo.pages.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

@Component
public class ModalContent extends AbstractPage {

    private final By btnContinueShopping = By.xpath("//button[@class='btn btn-secondary']");

    public void clickContinueShopping() {
        $(btnContinueShopping).shouldBe(Condition.interactable, Duration.ofSeconds(30)).click();
    }

    public void waitUntilBtnContinueDisappear() {
        $(btnContinueShopping).shouldNotBe(Condition.visible);
    }

}
