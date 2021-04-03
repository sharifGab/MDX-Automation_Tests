package step_definations;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/project"},
        //glue = {"step_definations"},
        tags = "@sgab-allah",
        //monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt",
                "pretty:target/cucumber-pretty.xml",
                "usage:target/cucumber-usage.json"
        })
public class RunCucumberTest{

}
