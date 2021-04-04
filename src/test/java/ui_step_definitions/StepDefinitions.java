package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.Belly;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void iHaveCukesInMyBelly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void iWaitHour(int arg0) {
        
    }

    @Then("my belly should growl")
    public void myBellyShouldGrowl() {
    }

    @Given("User logs into HQR where role = HQRUserGA, mfa = google auth")
    public void userLogsIntoHQRWhereRoleHQRUserGAMfaGoogleAuth() {
        
    }

    @And("User Logs out of HQR application")
    public void userLogsOutOfHQRApplication() {

    }
}
