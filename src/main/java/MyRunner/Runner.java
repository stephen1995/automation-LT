package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\features",
					glue = "stepDefinitions",
					monochrome = true,
					dryRun = false,
					plugin = {"pretty","html:target/POC"},
					tags = "@pruebaDeJesus"
					//strict = true					
					)

public class Runner {

}
