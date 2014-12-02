package cucumber;

import cucumber.api.CucumberOptions;


@CucumberOptions(
		features = "src/cucumber", 
		glue = {"cucumber.features.step_definitions.PageHeadingsStepDefinitions"},
		plugin = {
		"pretty", "html:target/cucumber-report/runapiat",
		"json:target/cucumber-report/cucumber.json" }
	)
public class CucumberRunner {
	
	
}
