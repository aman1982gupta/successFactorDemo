package com.automatedtest.successfactors;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/successfactors/Position.feature",
        "src/test/resources/com/automatedtest/successfactors/AddEmployee.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/testReport.json",
        "html:target/testReport-html"},
        glue = {"com.automatedtest.successfactors.infrastructure.driver",
                "com.automatedtest.successfactors.functionalTests"})
public class FunctionalTestRunner {
}


