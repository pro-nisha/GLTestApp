package com.automation.steps;


import cucumber.api.java8.En;
import framework.driverfactory.DriverFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


public class TestSteps implements En {

    private static Logger log = Logger.getLogger(TestSteps.class);

    @Autowired
    DriverFactory driverFactory;

    public TestSteps() {

        Given("A candidate access ISEB pre-tests website", () -> {
            // Write code here that turns the phrase above into concrete actions
            driverFactory.getDriver().navigate().to("https://testwise.testingforschools.com/tests/player-demo-iseb");
        });

        When("candidate clicks on english test link", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        Then("candidate should navigate to next Page to start test page", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        Then("candidate clicks on Start test button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        Then("user should navigate to Twins page and clicks on Next button", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });

        Then("candidate should navigate to next page to select twins correct answer", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        });



    }
}
