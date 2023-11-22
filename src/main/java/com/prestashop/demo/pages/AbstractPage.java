package com.prestashop.demo.pages;

import com.prestashop.demo.fragments.HeaderContent;
import com.prestashop.demo.fragments.ModalContent;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public abstract class AbstractPage {

    @Autowired
    ModalContent modalContent;

    @Autowired
    HeaderContent headerContent;

    @Value(("${firstname}"))
    protected String firstname;

    @Value(("${lastname}"))
    protected String lastname;

    @Value(("${email}"))
    protected String email;

    @Value(("${password}"))
    protected String password;

}
