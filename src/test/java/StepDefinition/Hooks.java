package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup TestContextSetup;

	public Hooks(TestContextSetup TestContextSetup) {
		this.TestContextSetup = TestContextSetup;

	}

	@After
	public void AfterScenario() throws IOException {
		TestContextSetup.TestBase.WebDriverManager().quit();

	}

	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException {
		WebDriver driver = TestContextSetup.TestBase.WebDriverManager();
		if (scenario.isFailed()) {
			File SourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(SourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
		System.out.println("i am checking  step");

	}

}
