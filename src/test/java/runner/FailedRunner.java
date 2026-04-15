package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failedExecution.txt",
        glue = {"stepdefinitions","hooks"},
        dryRun = false,
        plugin = { "pretty",
                "html:target/failed/html_report.html",
                "json:target/failed/json_report.json"

        }
)
public class FailedRunner extends AbstractTestNGCucumberTests {

}
