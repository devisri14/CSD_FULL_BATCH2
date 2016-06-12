package test.newrx;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/scenariooutline_regressiontesting.feature")
public class SeleniumTestRunner {

}
