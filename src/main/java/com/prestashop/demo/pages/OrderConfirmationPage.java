package com.prestashop.demo.pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Component
public class OrderConfirmationPage extends AbstractPage{

    private final By title = By.xpath("//h3[@class='h1 card-title']");
    private final By product = By.xpath("//div[@class='order-line row']//div[contains(@class, 'details')]/span");

    public List<String> getProductNames(){
        return $$(product).texts();
    }

    public String getTitle(){
        return $(title)
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .getText()
                .trim();
    }


}
