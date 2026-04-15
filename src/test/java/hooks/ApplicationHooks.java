package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.actitime.factory.DriverFactory;
import org.actitime.utils.ConfigReader;
import org.actitime.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


public class ApplicationHooks {
    WebDriver driver;
    ConfigReader cr;
    DriverFactory driverFactory;
    Properties prop;
  public static  Scenario scn;
    @Before
    public void setUp(){
        cr = new ConfigReader();
        driverFactory= new DriverFactory();
         prop=cr.getPropObj();
       String bName= prop.getProperty("browserName");
        driver=driverFactory.initDriver(bName);

    }
    @After(order = 2)
    public void getScreenshot(Scenario scn){
        ApplicationHooks.scn=scn;
        if (scn.isFailed()){
             byte[] screenShot=ScreenshotUtil.captureScreenShot(driver);
             scn.attach(screenShot,"image/png","Failure Screenshot");
        }
    }
    @After(order = 1)
    public void tearDown(){
        driver.quit();
    }

}

