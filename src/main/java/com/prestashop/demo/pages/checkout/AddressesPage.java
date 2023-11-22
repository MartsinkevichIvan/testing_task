package com.prestashop.demo.pages.checkout;

import com.prestashop.demo.pages.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class AddressesPage extends AbstractPage {

    @Value(("${address}"))
    protected String address;
    @Value(("${city}"))
    protected String city;
    @Value(("${zipcode}"))
    protected String zipcode;

    private final By addressBy = By.xpath("//input[@id='field-address1']");
    private final By zipCodeBy = By.xpath("//input[@id='field-postcode']");
    private final By cityBy = By.id("field-city");
    private final By continueCTA = By.xpath("//div[@id='delivery-address']//button[@class='continue btn btn-primary float-xs-right']");

    public void fillFieldWithValidData() {
        $(addressBy).sendKeys(address);
        $(zipCodeBy).sendKeys(zipcode);
        $(cityBy).sendKeys(city);
        $(continueCTA).click();
    }

}
