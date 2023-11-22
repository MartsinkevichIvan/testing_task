package com.prestashop.demo.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Component
public class CartPage extends AbstractPage{

    private final String URL = "https://swank-guide.demo.prestashop.com/en/cart?action=show";

    public CartPage() {
    }

    private final By btnProceedToCheckout = By.xpath("//div[@class='text-sm-center']");
    private final By productNames = By.xpath("//div[@class='product-line-info']");
    private final By products = By.xpath("//li[@class='cart-item']");

    public void clickProceedToCheckout(){
        $(btnProceedToCheckout).click();
    }

    public List<String> getProductNames(){
        return $$(productNames).texts();
    }


    public List<SelenideElement> getProducts(){
        return $$(products);
    }

}
