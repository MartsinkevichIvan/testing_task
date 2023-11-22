package com.prestashop.demo.steps;

import com.prestashop.demo.pages.checkout.AddressesPage;
import com.prestashop.demo.pages.checkout.PaymentPage;
import com.prestashop.demo.pages.checkout.PersonalInformationPage;
import com.prestashop.demo.pages.checkout.ShippingMethodPage;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckoutStepDefs {

    @Autowired
    PersonalInformationPage personalInformation;
    @Autowired
    AddressesPage addressesPage;
    @Autowired
    ShippingMethodPage shippingMethodPage;
    @Autowired
    PaymentPage paymentPage;


    @Then("I have successfully entered their personal information")
    public void enter_personal_information() {
        personalInformation.fillFieldWithValidData();
    }

    @Then("I have successfully entered their address information")
    public void enter_address_information() {
        addressesPage.fillFieldWithValidData();
    }

    @Then("I select default shipping method")
    public void select_shipping_method() {
        shippingMethodPage.clickContinue();
    }

    @Then("I select payment with bank wire")
    public void select_payment_method_bank_wire() {
        paymentPage.selectPaymentMethod();
    }

}
