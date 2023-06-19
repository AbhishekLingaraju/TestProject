package StepDefinitions.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
   		(
		features = "src/test/resources/FeatureFile",
		glue= {"StepDefinitions"},
		monochrome = true,
		plugin={"pretty","html:target/HtmlReport/report.html"},
		dryRun = false,
		tags="@mail1"
		)
public class Runner  
    {	
	
	}
