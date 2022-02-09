package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/E2ETest.feature"},
        glue = "StepDefinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true,
        format = {"html:format"})

public class Runner {
}