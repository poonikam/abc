package com.mbr.qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.junit.Test;
//import org.apache.log4j.BasicConfigurator;

public class MyStepdefs {
  //  private static final Logger log = LogManager.getRootLogger();

    @Given("I launch the Calender")
    public void iLaunchTheCalender() {
        //BasicConfigurator.configure();
        System.out.println("step 1");
  //      log.info("This is Logger test step 1" );
        Assert.assertEquals(1,1);

    }

    @When("I perform GET call with given endpoint")

    public void iPerformGETCallWithGivenEndpoint() {
        System.out.println("step 2");
        Allure.step("func1:" + "user login with name kuldeep and pwd is asasd" );
        Allure.step("func1:" + "user login with name kuldeep and pwd is asasd" );
        Allure.step("func1:" + "user login with name kuldeep and pwd is asasd" );

        Allure.description("This is my desc");

    //    log.info("This is Logger test step 2" );
        Assert.assertEquals(1,1);
    }

    @Then("I get responce")
    public void iGetResponce() {
        System.out.println("step 3");
      //  log.info("This is Logger test step 3" );
        //log.warn("Warning Message");
        System.out.println("Debugging Message111");
        //log.debug("Debugging Message");
        Assert.assertEquals(1,0);
    }
}
