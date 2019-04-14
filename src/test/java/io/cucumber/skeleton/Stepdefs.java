package io.cucumber.skeleton;

import cucumber.api.java.en.*;

public class Stepdefs {

    private Belly belly = new Belly();

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void iWaitHour(int waitHours) {
        belly.waitHours(waitHours);
    }

    @Then("my belly should growl")
    public void myBellyShouldGrowl() {
        assert belly.bellyGrowls();
    }


    @Then("my belly should not growl")
    public void myBellyShouldNotGrowl() {
        assert !belly.bellyGrowls();
    }
}
