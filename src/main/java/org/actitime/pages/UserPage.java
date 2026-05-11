package org.actitime.pages;

import org.actitime.utils.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
    private  WebDriver driver;
    WaitUtil wait;
    //1.WebElement
    @FindBy(xpath = "//div[text()='USERS']")
    private WebElement userTab;

    // 2. Constructor
    public UserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WaitUtil(driver);

    }
    //3.Page Action methods
    public void clickOnUserTab(){
        userTab.click();
    }

}
