package org.actitime.pages;

import org.actitime.utils.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
   private   WebDriver driver;
    WaitUtil wait;
    //1.WebElements
    @FindBy(id = "logoutLink")
    private WebElement logoutLink;

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
}
