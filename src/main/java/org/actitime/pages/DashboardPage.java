package org.actitime.pages;

import org.actitime.utils.WaitUtil;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
   private   WebDriver driver;
    WaitUtil wait;
    //1.WebElements
    @FindBy(css="#logoutLink")
    private WebElement logoutLink;

    @FindBy(css = "#topnav .label")
    private List<WebElement> tabListCount;

    //2.Constructor
   public DashboardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WaitUtil(driver);
    }
    //Page Action methods
     public boolean isDashboardPageIsDisplay(){
         return wait.isElementPresent(logoutLink);
   }
    public  String getDashboardURL(){
        return driver.getCurrentUrl();
    }
    public String getDashboardTitle(){
       return driver.getTitle();
    }
    public int getTabCount(){
       return tabListCount.size();
    }
}
