package com.prestashop.demo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class Browser {

    private static final Integer READY_TIMEOUT_IN_MILLIS=30000;
    private static final Wait<WebDriver> wait = Wait()
            .withTimeout(Duration.ofMillis(READY_TIMEOUT_IN_MILLIS))
            .pollingEvery(Duration.ofMillis(200));

    public static void waitUntilPageIsReady(){
        wait.until(webDriver -> "complete".equals(executeJavaScript("return document.readyState")));
    }
}
