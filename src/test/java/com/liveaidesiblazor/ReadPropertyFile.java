package com.liveaidesiblazor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    public static Properties prop;

    static {
        try {
            prop = new Properties();
            //FileInputStream propfile = new FileInputStream(System.getProperty("user.dir")+"\\"+"resources"+propfilepath);
            FileInputStream propfile = new FileInputStream("src/test/resources/conf.properties");
            prop.load(propfile);
        } catch (IOException e) {
            System.err.println("Error: Properties file is absent!");
        }

    }
    public static String getProperty(String key){
        return prop.getProperty(key);
    }
}
