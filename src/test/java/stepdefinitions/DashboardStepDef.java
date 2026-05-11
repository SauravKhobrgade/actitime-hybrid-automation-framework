package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.tlh.DaHghubejlu;
import org.actitime.pages.DashboardPage;
import org.actitime.utils.ConfigReader;
import org.testng.Assert;

import java.util.Properties;
import static org.actitime.factory.DriverFactory.getDriver;

public class DashboardStepDef {
    ConfigReader cr;
    Properties prop;
   public  DashboardStepDef(){
         cr=new ConfigReader();
         prop =cr.getPropObj();
    }
    @Then("Dashboard page is displayed")
    public void dashboard_page_is_displayed() {
       DashboardPage dashboardPage=new DashboardPage(getDriver());
        Assert.assertTrue(dashboardPage.isDashboardPageIsDisplay());
    }
    @Then("Dashboard page URL is as {string}")
    public void dashboard_page_url_is_as(String expURL) {
       DashboardPage dashboardPage=new DashboardPage(getDriver());
       Assert.assertEquals(dashboardPage.getDashboardURL(),expURL,"Dashboard URl is not displayed is expected");

    }
    @Then("Dashboard page title is as {string}")
    public void dashboard_page_title_is_as(String expTitle) {
       DashboardPage dashboardPage=new DashboardPage(getDriver());
       Assert.assertEquals(dashboardPage.getDashboardTitle(),expTitle,"Dashboard Title is not displayed as expected");
    }
    @Then("Dashboard display {int} tabs")
    public void dashboard_display_tabs(Integer expTabCount) {
       DashboardPage dashboardPage=new DashboardPage(getDriver());
       Assert.assertEquals(dashboardPage.getTabCount(),expTabCount,"Tab lIst count is not 4");

    }

}
