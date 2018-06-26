package pune.amnor.in.idemia.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = {"pune.amnora.in.idemia.Gmail.StepDefinition"},
		plugin = {"html:target/cucumber-html-report","json:target/cucumber-json-report.json"}
		
			)






public class TestRunner {

}
