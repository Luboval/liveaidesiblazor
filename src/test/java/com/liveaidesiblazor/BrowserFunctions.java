package com.liveaidesiblazor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.util.Properties;

public class BrowserFunctions {public static Properties desiprop;
    public static WebDriver driver;
    StringBuilder sb = new StringBuilder();

    //

    @BeforeSuite
    public void initialiseBrowser() {
        driver = new ChromeDriver();

    }

   /* @AfterSuite
    public void closeBrowser(){
        driver.quit();
         }
    */
}
