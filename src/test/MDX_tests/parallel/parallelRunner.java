package parallel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:parallel"},
        glue = {"classpath:parallel"},
        tags = "@sgab-allah",
        plugin = {"pretty","html:target/cucumber", "summary", "json:target/cucumber/cucumber.json"},
        strict = true,
        monochrome= true,
        dryRun= false
)

public class parallelRunner {

    /* @AfterClass
    public static void generateReport(){
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");

        String jenkinsBasePath = "";
        String buildNumber = "1";
        String projectName = "MDX-Test_Automations";
        boolean skippedFails = true;
        boolean pendingFails = false;
        boolean undefinedFails = true;
        boolean missingFails = true;
        boolean runWithJenkins = false;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        // optionally only if you need
        configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails, missingFails);
        configuration.setParallelTesting(parallelTesting);
        configuration.setJenkinsBasePath(jenkinsBasePath);
        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }*/

}
