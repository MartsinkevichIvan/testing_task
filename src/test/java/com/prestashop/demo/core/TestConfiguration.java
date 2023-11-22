package com.prestashop.demo.core;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.test.context.ContextConfiguration;


@CucumberContextConfiguration
@ComponentScan(basePackages = {"com.prestashop.demo"})
@ContextConfiguration(classes = {com.prestashop.demo.core.TestConfiguration.class})
@PropertySources(@PropertySource("common.properties"))
public class TestConfiguration {

}
