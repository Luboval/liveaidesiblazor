package com.liveaidesiblazor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WaitFluent extends BrowserFunctions {
    public static void waitFluentPresenceClassName(String someclass) {
        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait1.until(ExpectedConditions.presenceOfElementLocated(By.className(someclass)));

    }

    public static void waitFluentPresenceXpath(String somexpath) {
        Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath(somexpath)));

    }

    public static void waitFluentPresenceCss(String somecss) {
        Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(somecss)));

    }

    public static void waitFluentClicableClassName(String someclass) {
        Wait<WebDriver> wait4 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        wait4.until(ExpectedConditions.elementToBeClickable(By.className(someclass)));

    }
    public static void waitFluentClicableXpath(String someclass) {
        Wait<WebDriver> wait5 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath(someclass)));

    }
    public static void waitFluentClicableCss(String someclass) {
        Wait<WebDriver> wait6 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait6.until(ExpectedConditions.elementToBeClickable(By.cssSelector(someclass)));

    }
}
