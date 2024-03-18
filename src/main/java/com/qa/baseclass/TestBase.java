package com.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.qa.utilty.WebDriverEvent;
import com.qa.waits.Waits;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();

			// FileInputStream ff = new FileInputStream
			// ("/Users/carnowdevelopment/eclipse-workspace/Trainings/src/main/java/Practise/Config.properties");
			FileInputStream ip = new FileInputStream(
					"/Users/carnowdevelopment/eclipse-workspace/QASmoke/src/main/java/com/qa/configreader/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialize1() {
		String browser = prop.getProperty("browser");
		if (browser.equals(browser)) {
			driver = new ChromeDriver();
			// driver.get(URL);
			// driver.manage().window().maximize();

		}
		WebDriverEvent listener = new WebDriverEvent();

		WebDriver driver1 = new EventFiringDecorator<WebDriver>(listener).decorate(driver);
		driver = driver1;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));

		driver.get(prop.getProperty("URL"));

	}
}
