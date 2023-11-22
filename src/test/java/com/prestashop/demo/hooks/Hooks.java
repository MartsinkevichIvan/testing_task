package com.prestashop.demo.hooks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.prestashop.demo.core.Browser;
import com.prestashop.demo.pages.CreateAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


public class Hooks {

    @Autowired
    CreateAccountPage createAccountPage;

    @Value(("${base.url}"))
    private String baseUrl;


    @Before(order = 1)
    public void openHomePage() {
        Selenide.open(baseUrl);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Browser.waitUntilPageIsReady();
        WebDriverRunner.getWebDriver().switchTo().frame($(By.id("framelive")).shouldBe(Condition.visible, Duration.ofSeconds(30)));
    }


    @Before(value = "@CreateAccount", order = 8)
    public void createAccount(){
        createAccountPage.openCreateAccountPage();
        createAccountPage.setFieldWithValidData();
    }

    @After(order = 1)
    public void closeDriver()
    {
        WebDriverRunner.closeWebDriver();
    }
}
