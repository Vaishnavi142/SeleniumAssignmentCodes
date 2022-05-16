package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/test/java/Feature",
	glue= {"StepDefinition"},	
	dryRun=false, 
	monochrome=true, 	
	plugin= { "pretty" ,"html:target/cucumberassign-pretty","junit:target/report.xml","json:target/report.json"}
)
public class testrun {	

}
