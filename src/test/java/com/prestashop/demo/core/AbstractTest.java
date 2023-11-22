package com.prestashop.demo.core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.prestashop.demo.steps","com.prestashop.demo.core","com.prestashop.demo.hooks"},
        plugin = {"pretty","json:target/report.json"})
public class AbstractTest extends AbstractTestNGCucumberTests {

}
