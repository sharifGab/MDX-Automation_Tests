package step_definition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/gherkin.feature"},
        glue = {"step_definition.step_def.java"},
        //tags = "@sgab-allah",
        plugin = {"pretty","html:target/cucumber1", "json:target/cucumber/cucumber.json"} // "summary",
        //monochrome= false,
        //dryRun= false
)

public class RunCucumberTest {

}
