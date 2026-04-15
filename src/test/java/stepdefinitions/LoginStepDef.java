package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.actitime.pages.LoginPage;
import org.actitime.utils.ConfigReader;
import org.testng.Assert;

import java.util.Comparator;
import java.util.Properties;

import static org.actitime.factory.DriverFactory.getDriver;

public class LoginStepDef  {
    Properties prop;
    ConfigReader cr;

    public LoginStepDef() {
        cr = new ConfigReader();
        prop = cr.getPropObj();
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        getDriver().get(prop.getProperty("url"));
    }
    @Then("login page url is displayed as {string}")
    public void login_page_url_is_displayed_as(String expURL) {
        LoginPage loginPage=new LoginPage(getDriver());
        String actURL=loginPage.getUrl();
        Assert.assertEquals(actURL,expURL);
    }
    @Then("login page title is displayed as {string}")
    public void login_page_title_is_displayed_as(String expTitle) {
      LoginPage loginPage=new LoginPage(getDriver());
      String actTitle=loginPage.getTitle();
      Assert.assertEquals(actTitle,expTitle);
    }
    @Then("username field is displayed")
    public void username_field_is_displayed() {
        LoginPage loginPage=new LoginPage(getDriver());
       Assert.assertTrue( loginPage.isUserNameFieldIsDisplayed());

    }
    @Then("password field is displayed")
    public void password_field_is_displayed() {
        LoginPage loginPage=new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isPasswordFieldIsDisplayed());

    }
    @Then("keepMeLoginCheckBox is displayed")
    public void keep_me_login_check_box_is_displayed() {
     LoginPage loginPage=new LoginPage(getDriver());
     Assert.assertTrue(loginPage.isKeepMeLoginTextIsDisplayed());
    }
    @Then("login button is dipalyed")
    public void login_button_is_dipalyed() {
     LoginPage loginPage=new LoginPage(getDriver());
     Assert.assertTrue(loginPage.isLoginButtonIsDisplay());
    }
    @Then("login page logo are displayed")
    public void login_page_logo_are_displayed() {
      LoginPage loginPage=new LoginPage(getDriver());
      Assert.assertTrue(loginPage.isLoginLogosDisplay());
    }
    @When("User enter  username")
    public void user_enter_username() {
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterUserName(prop.getProperty("userName"));
    }
    @When("User enter  password")
    public void user_enter_password() {
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterPassword(prop.getProperty("password"));
    }
    @When("User click on login button")
    public void user_click_on_login_button() {
     LoginPage loginPage=new LoginPage(getDriver());
     loginPage.clickOnLoginButton();
    }
    @When("User enter {string} as username")
    public void user_enter_as_username(String userName) {
        LoginPage loginPage=new LoginPage(getDriver());
        loginPage.enterUserName(userName);
    }
    @When("User enter {string} as password")
    public void user_enter_as_password(String passWord) {
      LoginPage loginPage= new LoginPage(getDriver());
      loginPage.enterPassword(passWord);
    }


}

