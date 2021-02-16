package com.liveaidesiblazor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.Properties;

public class BrowserFunctions {

    public static WebDriver driver;
    public static LoginPage loginPage;

    StringBuilder sb = new StringBuilder();


    //public String driverpath = "D:\\chromedriver.exe";
    //

    @BeforeSuite
    public void initialiseBrowser() {
        System.setProperty("webdriver.chrome.driver", ReadPropertyFile.getProperty("driverpath"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);


    }

   /* @AfterSuite
    public void closeBrowser(){
        driver.quit();
         }
    */
}
