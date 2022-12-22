package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/Features", glue={"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "junit:target/junitReport/report.xml",
            "json:target/jsonreport/report.json",
            "html:target/htmlreport/report.html"}
//tags = "@checkout"
)
public class TestRunner{

}