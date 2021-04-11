package step_definition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/MDX_tests/features/gherkin.feature"},
        glue = {"step_definition"},
        tags = "@sgab-allah",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/Reports", "junit:target/cucumber.xml", "rerun:target/rerun.txt", "pretty:target/cucumber-pretty.xml", "usage:target/cucumber-usage.json"}
)

public class RunCucumberTest {
    public RunCucumberTest() {

    }
}
