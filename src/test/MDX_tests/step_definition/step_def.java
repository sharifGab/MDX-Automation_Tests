package step_definition;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_def extends BaseUtil {
    private final BaseUtil baseUtil;

    public step_def(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("test to do a web lunch")
    public void test_to_do_a_web_lunch() {
        // Write code here that turns the phrase above into concrete actions
        baseUtil.print("Given");
    }

    @When("entering user name and password")
    public void entering_user_name_and_password() {
        // Write code here that turns the phrase above into concrete actions
        baseUtil.print("When" + baseUtil.StepInfo);
    }

    @Then("I log into the destination page")
    public void i_log_into_the_destination_page() {
        // Write code here that turns the phrase above into concrete actions
        baseUtil.print("Then");
    }

    @And("start step_def")
    public void start_step_def() {
        // Write code here that turns the phrase above into concrete actions
        baseUtil.print("And");
    }

}
