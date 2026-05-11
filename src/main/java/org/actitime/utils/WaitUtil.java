package org.actitime.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtil {

     WebDriverWait wait;
     WebDriver driver;
     public WaitUtil(WebDriver driver){
        this.driver=driver;
          wait=new WebDriverWait(driver, Duration.ofSeconds(10));
     }

   public void  waitForVisibilityOfElement(WebElement element,int time,WebDriver driver){
       wait.until(ExpectedConditions.visibilityOf(element));
   }

   public void waitForUrl(String url){
         wait.until(ExpectedConditions.urlContains(url));
   }
   public boolean isElementPresent(WebElement element){
         return element.isDisplayed();
   }

}
