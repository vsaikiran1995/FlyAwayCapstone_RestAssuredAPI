package stepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features="src/test/java/features",
		plugin ={"pretty","html:target/html-cucumber","json:target/cucumber/report.json"},
		glue="stepDef",
		tags= {"@sanity"}
		
		
		)
public class TestRunner {

}
