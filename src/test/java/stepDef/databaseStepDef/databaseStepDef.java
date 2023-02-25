package stepDef.databaseStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class databaseStepDef {

    @Given("user is able to connect to database")
    public void user_is_able_to_connect_to_database() {

    }
    @When("user send {string} to database")
    public void user_send_to_database(String query) {

    }
    @Then("Validate the {int}")
    public void validate_the(Integer expectedSalary) {

    }
}
