package org.actitime.utils;

import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.databind.annotation.JsonAppend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    Properties prop;
    public  Properties getPropObj() {
        try{
            FileInputStream fis=new FileInputStream("D:\\CST_85_Cucumber\\src\\test\\resources\\org.configurations\\Config.Properties");

            prop=new Properties();
            prop.load(fis);
            return prop;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
