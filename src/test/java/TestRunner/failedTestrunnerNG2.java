package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_sceanrio.txt", glue = "StepDefinition", monochrome = true,
plugin = {"html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})

//tags="@tagname" or "tagname2"
//plugin={"html:path to store.html/json"}
 
public class failedTestrunnerNG2 extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios(); 
	}

}
