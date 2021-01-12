package com.liveaidesiblazor;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OpenLoginPage extends BrowserFunctions{
    //public WebDriver driver;
    //public String baseURL = "https://winnode-uksouth-01.liveai.dev.connectedstore.dynamics.com:3463/";
    //String driverpath = "D:\\chromedriver.exe";

    @BeforeTest
    public void launchDesi() {
        System.out.println("Start Chrome browser");

        // Load properties file
       // String propfilepath = "conf.properties";
        //ReadPropertyFile.readProperties(propfilepath);

        System.setProperty("webdriver.crome.driver", ReadPropertyFile.getProperty("driverpath"));
        driver.get(ReadPropertyFile.prop.getProperty("baseURL"));


    }

    @Test(priority = 1)
    public void verifyTitle() {
        System.out.println("Verify Title");
        System.out.println("waiting...");
        WaitFluent.waitFluentPresenceClassName(ReadPropertyFile.prop.getProperty("MainPageClass"));

        System.out.println("Checking...");
        assertEquals(driver.getTitle(), "DESI - Login page");

    }

    @Test (priority = 2)
    public void verifyForm(){
        System.out.println("Verify elements");
        driver.findElement(By.cssSelector(ReadPropertyFile.prop.getProperty("HyperNodeCss"))).isDisplayed();
        driver.findElement(By.cssSelector(ReadPropertyFile.prop.getProperty("DomainCss"))).isDisplayed();
        driver.findElement(By.cssSelector(ReadPropertyFile.prop.getProperty("IoTHubCss"))).isDisplayed();
        System.out.println("Connections type is displayed");

        driver.findElement(By.xpath(ReadPropertyFile.prop.getProperty("ConnectionStringFieldXpath"))).isDisplayed();
        driver.findElement(By.id(ReadPropertyFile.prop.getProperty("UserNameFieldId"))).isDisplayed();
        driver.findElement(By.id(ReadPropertyFile.prop.getProperty("DesiAlwaysCheckboxId"))).isDisplayed();

        System.out.println("All fields displayed");

        driver.findElement(By.cssSelector(ReadPropertyFile.prop.getProperty("ContinueButtonCss"))).isDisplayed();

        System.out.println("All is displayed");
    }
}
