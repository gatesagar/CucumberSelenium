package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Login.feature",
		glue = {"stepDefinitions","hooks"},
		dryRun=false,
		plugin = {"pretty"}
		
		)

public class TestRunner {

}
