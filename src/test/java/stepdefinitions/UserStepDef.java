package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.actitime.factory.DriverFactory;
import org.actitime.pages.UserPage;
import org.actitime.utils.ConfigReader;

import java.util.Properties;

public class UserStepDef {
    ConfigReader cr;
    Properties prop;
    public UserStepDef(){
         cr=new ConfigReader();
        prop =cr.getPropObj();
    }
    @Given("User click on User Tab button")
    public void user_click_on_user_tab_button() {
        UserPage userPage=new UserPage(DriverFactory.getDriver());
        userPage.clickOnUserTab();
    }
    @Then("User page is displayed")
    public void user_page_is_displayed() {

    }
}
