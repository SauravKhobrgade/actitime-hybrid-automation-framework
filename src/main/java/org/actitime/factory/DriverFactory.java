package org.actitime.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//DriverFactory is responsible for WebDriver initilizations
public class DriverFactory {
     static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();

    public WebDriver initDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--start-maximized");
            tldriver.set(new ChromeDriver(options));
        }
        return tldriver.get();
    }
    public  synchronized  static WebDriver getDriver(){
         return tldriver.get();
    }
}
