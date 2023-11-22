package com.prestashop.demo.pages.checkout;

import com.prestashop.demo.pages.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class AddressesPage extends AbstractPage {

    private final By address = By.xpath("//input[@id='field-address1']");
    private final By zipCode = By.xpath("//input[@id='field-postcode']");
    private final By city = By.id("field-city");
    private final By continueCTA = By.xpath("//div[@id='delivery-address']//button[@class='continue btn btn-primary float-xs-right']");

    public void fillFieldWithValidData(){
        $(address).sendKeys("41 Rue du Sergent Bobillot");
        $(zipCode).sendKeys("93100");
        $(city).sendKeys("Paris");
        $(continueCTA).click();
    }

}
