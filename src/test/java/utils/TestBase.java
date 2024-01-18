package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.PageObjectManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\Resource\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties=prop.getProperty("browser");
		String maven_browser=System.getProperty("browser");
		String browser=maven_browser!=null ? maven_browser : browser_properties;

		if (driver == null) {
			if (browser.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();

			}
			if (browser.equalsIgnoreCase("firfox")) {
				//WebDriverManager.firefoxdriver().setup();
				WebDriverManager.edgedriver().setup();
				//driver=new FirefoxDriver();
				driver= new EdgeDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		return driver;
	}

}
