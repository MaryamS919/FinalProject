package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"stepdef"},
		tags = {"@project"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/finalreports/example.html"},
		monochrome = true
		
		
		
		
		
		
		
		)
public class Finalrunner {

}
