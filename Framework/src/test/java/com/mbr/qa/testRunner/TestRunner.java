package com.mbr.qa.testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/resources/features"),
            glue = {"com.mbr.qa.steps"},tags = "@Smoke",
           // plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/cucumber.json"},
        monochrome = true)

public class TestRunner {
}
