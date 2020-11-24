package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue= {"Stepdefinations"},
		tags= {"@home"},
		dryRun=false,
		format={"pretty", "html:Reports" , "json:Reports\\jsonreport.json"},
		monochrome=true
		
		) 
public class TestRunner {

}
