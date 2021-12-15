package com.automation.steps;


import PageObjectModel.DriverInitializer;
import cucumber.api.java8.En;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class TestSteps extends DriverInitializer implements En {

    private static Logger log = Logger.getLogger(TestSteps.class);

    @Autowired
    DriverInitializer driverPageObj;

    String url="https://testwise.testingforschools.com/tests/player-demo-iseb";

    public TestSteps() {

        Given("A candidate access ISEB pre-tests website", () -> {
            // Write code here that turns the phrase above into concrete actions
            driverPageObj.getDriver().navigate().to(url);
        });

        When("candidate clicks on english test link", () -> {
            // Write code here that turns the phrase above into concrete actions
            driverPageObj.getDriver().findElement(By.linkText("English")).click();
        });

        Then("candidate should navigate to next Page to start test page", () -> {
            // Write code here that turns the phrase above into concrete actions
            driverPageObj.getDriver().findElement(By.className("Start test")).click();
        });

        Then("candidate clicks on Start test button", () -> {

            driverPageObj.getDriver().findElement(By.className("Start test")).click();
        });

        Then("user should navigate to Twins page and clicks on Next button", () -> {
            driverPageObj.getDriver().findElement(By.id("next-button")).click();

        });

        Then("candidate should navigate to next page to select twins correct answer", () -> {
            driverPageObj.getDriver().findElement(By.className("three quarters")).click();
        });

        Then("candidate selects \"(.*)\" of twins not identical and clicks on next button", (String string) -> {
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate selects \"(.*)\" answers and clicks on next button", (String string) -> {
            driverPageObj.getDriver().findElement(By.className("They are about triplets")).click();
        });

        Then("candidate should navigate to Instructions page for short messages or sentences", () -> {
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate clicks on Next button", () -> {
            driverPageObj.getDriver().findElement(By.className("him")).click();
        });

        Then("candidate selects \"(.*)\" and clicks on Next button", (String string) -> {
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate navigates to next question and selects \"(.*)\" answers and clicks on Next button", (String string) -> {
            driverPageObj.getDriver().findElement(By.className("are")).click();
            Thread.sleep(1000);
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate should navigate to Instructions page for spelling and punctuations questions", () -> {
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate selects \"(.*)\" answers and clicks on Next button", (String string) -> {
            driverPageObj.getDriver().findElement(By.className("climing mountains")).click();
            Thread.sleep(1000);
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });


        And("^candidate selects \"([^\"]*)\" option and clicks on Next button$", (String arg0) -> {
            driverPageObj.getDriver().findElement(By.className("chop the ingredients")).click();
            Thread.sleep(1000);
            driverPageObj.getDriver().findElement(By.id("next-button")).click();

        });

        And("^candidate selects \"([^\"]*)\" correct option and clicks on Next button$", (String arg0) -> {
            driverPageObj.getDriver().findElement(By.className("mum for permision")).click();
            Thread.sleep(1000);
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate should reach to End of Test Page", () -> {
            driverPageObj.getDriver().findElement(By.className("End test")).click();
        });

        Then("candidate clicks on End of Test button", () -> {
            driverPageObj.getDriver().findElement(By.id("next-button")).click();
        });

        Then("candidate should navigate to Familiarisation Test page", () -> {

            driverPageObj.getDriver().findElement(By.xpath("/html/body/app-root/app-test-selector/div/div[2]/div"));
        });



    }
}
