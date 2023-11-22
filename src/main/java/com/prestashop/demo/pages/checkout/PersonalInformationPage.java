package com.prestashop.demo.pages.checkout;

import com.prestashop.demo.pages.AbstractPage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class PersonalInformationPage extends AbstractPage {

    private final By socialTitleMr = By.xpath("//input[@name='id_gender' and @value='1']");
    private final By firstNameBy = By.xpath("//section[@id='checkout-personal-information-step']//input[@id='field-firstname']");
    private final By lastNameBy = By.xpath("//section[@id='checkout-personal-information-step']//input[@id='field-lastname']");
    private final By emailBy = By.xpath("//section[@id='checkout-personal-information-step']//input[@id='field-email']");
    private final By privacyPolicyAgreement = By.xpath("//input[@name='psgdpr']");
    private final By customerPolicyAgreement = By.xpath("//input[@name='customer_privacy']");
    private final By continueCTA = By.xpath("//button[@class='continue btn btn-primary float-xs-right']");

    public void fillFieldWithValidData(){
        $(socialTitleMr).click();
        $(firstNameBy).sendKeys(firstname);
        $(lastNameBy).sendKeys(lastname);
        $(emailBy).sendKeys(email);
        $(privacyPolicyAgreement).click();
        $(customerPolicyAgreement).click();
        $(continueCTA).click();
    }

}
