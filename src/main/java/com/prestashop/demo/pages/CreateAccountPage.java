package com.prestashop.demo.pages;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class CreateAccountPage extends AbstractPage{

    @Autowired
    HomePage homePage;

    private final By socialTitleMrBy = By.xpath("//input[@name='id_gender' and @value='1']");
    private final By firstNameBy = By.id("field-firstname");
    private final By lastNameBy = By.id("field-lastname");
    private final By emailBy = By.id("field-email");
    private final By passwordBy = By.id("field-password");
    private final By privacyPolicyAgreement = By.xpath("//input[@name='psgdpr']");
    private final By customerPolicyAgreement = By.xpath("//input[@name='customer_privacy']");
    private final By continueCTA = By.xpath("//button[@type='submit']");
    private final By noAccount = By.xpath("//div[@class='no-account']");


    public void setFieldWithValidData(){
        $(socialTitleMrBy).click();
        $(firstNameBy).sendKeys(firstname);
        $(lastNameBy).sendKeys(lastname);
        $(emailBy).sendKeys(email);
        $(passwordBy).sendKeys(password);
        $(privacyPolicyAgreement).click();
        $(customerPolicyAgreement).click();
        $(continueCTA).click();
    }

    public void openCreateAccountPage(){
        getHeaderContent().getSignInIcon().click();
        $(noAccount).click();
    }
}
