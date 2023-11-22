package com.prestashop.demo.fragments;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

@Component
public class HeaderContent {

    private final By cartIcon = By.id("_desktop_cart");
    private final By signInIcon = By.xpath("//div[@class='user-info']/a");
    private final By logo = By.xpath("//img[@class='logo img-fluid']");

    public void openCart() {
        $(cartIcon).should(be(visible)).should(be(enabled)).click();
    }

    public SelenideElement getSignInIcon() {
        return $(signInIcon).shouldBe(visible, Duration.ofSeconds(30)).shouldBe(enabled, Duration.ofSeconds(30));
    }

    public void openHomePageByClickingLogo() {
        $(logo).shouldBe(visible).shouldBe(interactable).click();
    }
}
