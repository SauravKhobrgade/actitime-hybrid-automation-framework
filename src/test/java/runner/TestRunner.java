package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "D:\\ActiTime_Automation_Cucumber_Framework\\src\\test\\resources\\features",
        glue = {"stepdefinitions","hooks"},
        dryRun = false,
        plugin ={"pretty",
                "html:target/html_report.html",
                "json:target/json_report.json",
                "rerun:target/failedExecution.txt"

         }
        )
public class TestRunner  extends AbstractTestNGCucumberTests {
   /* @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }*/
}
