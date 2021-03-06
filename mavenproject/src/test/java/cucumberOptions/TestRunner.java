package cucumberOptions;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/java/features",glue="stepDefinition",
//tags="@Test",
monochrome = true,
strict=true,
format = {"pretty", "html:target/cucumber-htmlreport"})
public class TestRunner {

}
