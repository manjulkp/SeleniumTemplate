package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import utilities.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import core.DriverManager;
import core.DriverManagerFactory;
import core.DriverType;
import core.Url;
import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(strict = true, monochrome = true, features = "src/test/resources/featurefile", glue = "stepdefinitions", tags = {
		"@signin" }, plugin = { 
				"pretty", 
				"html:target/cucumber-reports",
				"json:target/cucumber-reports/cucumber.json" })

public class FeatureFileRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	public static WebDriver webDriver;
	private DriverManager driverManager;
	public static Map<String, String> testDataDetails;

	static {
		JsonParser j = new JsonParser();
		String s = null;
		try {
			s = JsonParser.readJson("userdata.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testDataDetails = j.publishAllXpathInResponse(s);
	}

	@BeforeSuite
	public WebDriver setup() {
		driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
		driverManager.goTo(Url.MONEY_GAMING.getUrl());
		webDriver = driverManager.getDriver();
		return webDriver;
	}

	public static WebDriver getDriver() {
		return webDriver;
	}

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}


	@AfterSuite
	public void tearDown() {
		webDriver.quit();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
	}

	@DataProvider
	public Object[][] scenarios() {
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterSuite
	public void generateReport() {
		File reportOutputDirectory = new File("target"); //
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add("target/cucumber-reports/cucumber.json");
		String projectName = "Automation";
		String buildNumber = "1.0";

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);

		configuration.setBuildNumber(buildNumber);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}

}