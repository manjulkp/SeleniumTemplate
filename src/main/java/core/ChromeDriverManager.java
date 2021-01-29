package core;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager{

	@Override
	protected void createDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
		
		webDriver = new ChromeDriver(options);
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		webDriver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	}
}
