package com.liveaidesiblazor;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


import static org.testng.Assert.assertEquals;

public class OpenLoginPage extends BrowserFunctions {
   // 1 public WebDriver driver;
   // public String baseURL = "https://winnode-uksouth-01.liveai.dev.connectedstore.dynamics.com:3463/";
   // public String driverpath = "D:\\chromedriver.exe";

    @BeforeTest
    public void launchDesi(){
        System.out.println("Start Chrome browser");

        // Load properties file
       // String propfilepath = "conf.properties";
        //ReadPropertyFile.readProperties(propfilepath);

        //System.setProperty("webdriver.chrome.driver", driverpath);
       // 1 System.setProperty("webdriver.chrome.driver", driverpath);
       driver.get(ReadPropertyFile.getProperty("baseURL"));
       // 1 driver = new ChromeDriver();
       // 1 driver.get(baseURL);
       // public static LoginPage loginPage;

    }

    @Test(priority = 1)
    public void verifyTitle() {
        System.out.println("Verify Title");
        System.out.println("waiting...");
        WaitFluent.waitFluentPresenceClassName(ReadPropertyFile.getProperty("MainPageClass"));

        System.out.println("Checking...");
        assertEquals(driver.getTitle(), "DESI - Login page");

    }

    @Test (priority = 2)
    public void verifyForm(){
        System.out.println("Verify connections");
        driver.findElement(By.cssSelector(ReadPropertyFile.getProperty("HyperNodeCss"))).isDisplayed();
        driver.findElement(By.cssSelector(ReadPropertyFile.getProperty("DomainCss"))).isDisplayed();
        driver.findElement(By.cssSelector(ReadPropertyFile.getProperty("IoTHubCss"))).isDisplayed();
        System.out.println("Connections type is displayed");
        loginPage.hyperNodeConnection.isDisplayed();
        System.out.println("hyperNodeConnection is displayed");
        driver.findElement(By.xpath(ReadPropertyFile.getProperty("ConnectionStringFieldXpath"))).isDisplayed();
        driver.findElement(By.id(ReadPropertyFile.getProperty("UserNameFieldId"))).isDisplayed();
        driver.findElement(By.id(ReadPropertyFile.getProperty("DesiAlwaysCheckboxId"))).isDisplayed();

        System.out.println("All fields are displayed");

        driver.findElement(By.cssSelector(ReadPropertyFile.getProperty("ContinueButtonCss"))).isDisplayed();

        System.out.println("All is displayed");
    }
}
