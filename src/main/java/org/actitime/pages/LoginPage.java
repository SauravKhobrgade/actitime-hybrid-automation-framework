package org.actitime.pages;

import org.actitime.utils.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
   private   WebDriver driver;
   WaitUtil wait;
    //1.WebElement
    @FindBy(id = "username")
    private WebElement userNameField;
    @FindBy(css = ".textField.pwdfield")
    private WebElement passwordField;
    @FindBy(id="keepLoggedInCheckBox")
    private WebElement keepMeloginCheckBoc;
    @FindBy(xpath = "//div[text()='Login ']")
    private WebElement loginButton;
    @FindBy(css = "#logoContainer img")
    private List<WebElement> loginLogos;

    //2.Constructor
    public  LoginPage(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
      wait =new WaitUtil(driver);

    }
    //3.PageAction Methods
     public String getUrl(){wait.waitForUrl("http://localhost:93/login.do");
       return driver.getCurrentUrl();
     }
     public String getTitle(){
       return  driver.getTitle();
     }
     public boolean isUserNameFieldIsDisplayed(){
        wait.waitForVisibilityOfElement(userNameField,10,driver);
        return userNameField.isDisplayed();
    }
    public boolean isPasswordFieldIsDisplayed(){
        wait.waitForVisibilityOfElement(passwordField,10,driver);
        return passwordField.isDisplayed();
    }
    public boolean isKeepMeLoginTextIsDisplayed(){
        return keepMeloginCheckBoc.isDisplayed();
    }
    public boolean isLoginButtonIsDisplay(){
        return loginButton.isDisplayed();
    }
    public boolean isLoginLogosDisplay(){
        for(int i=0;i<2;i++){
            WebElement element=loginLogos.get(i);
            if (!wait.isElementPresent(element)){
                return false;}
        }
        return true;
    }
    public void enterUserName(String uName){
        userNameField.sendKeys(uName);
    }
    public void enterPassword(String pwd){
        passwordField.sendKeys(pwd);
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }

}
