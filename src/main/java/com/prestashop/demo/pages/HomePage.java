package com.prestashop.demo.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
public class HomePage extends AbstractPage {

    private final String pathToProductIcon = "//div[@class='products row']//a[text()='%s']";

    public void selectProduct(String productName){
        $(By.xpath(String.format(pathToProductIcon, productName))).shouldBe(visible, Duration.ofMillis(20000)).click();
    }
}
