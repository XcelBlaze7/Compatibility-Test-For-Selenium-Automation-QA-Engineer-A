package com.JabaTalks.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.JabaTalks.Config.PropertiesFile;

public class Useable_Classes {

	static Logger log = LogManager.getLogger(Useable_Classes.class.getName());
	static WebDriver driver;
	public static String browser;
	public static String chromeDriverLocation;
	public static String firefoxDriverLocation;
	public static String InternetExplorerDriverLocation;
	public static String EdgeDriverLocation;
	public static String url;

	// Browser Selection from Prop.Properties File
	// Invoking the selected browser
	public static void getDriver() throws Exception {
		PropertiesFile.readPropertiesFile();
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
			driver = new ChromeDriver();
			log.info("Chrome Driver Invoked");
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxDriverLocation);
			driver = new FirefoxDriver();
			log.info("Firefox Driver Invoked");
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", EdgeDriverLocation);
			driver = new EdgeDriver();
			log.info("Edge Driver Invoked");
		} else {
			System.out.println("!!!!!!!!!!!!!!!!!!Browser Not Supported!!!!!!!!!!!!!!!!!!");
			log.fatal("Incorrect Option selected....None of the Drivers are Invoked");
		}
		log.debug("Maximizing Window");
		driver.manage().window().maximize();
		log.info("Window Maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("Browser Invoked Successfully");
	}

	// Getting URL info from Prop.Properties File
	// Hitting the URL
	public static WebDriver homepage() {
		PropertiesFile.readPropertiesFile();

		log.debug("Hitting URL");
		driver.get(url);
		log.info("URL Opened");
		log.info("Homepage Opened Successfully");
		return driver;
	}
	
	// Close Browser Function
	public static void closeBrowser() {
		log.debug("Close Browser");
		driver.quit();
		log.info("Browser Closed Successfully");
		log.info("**************************************************************************");
	}

	// WebDriver Object, Return Function
	public static WebDriver drv() {
		return driver;
	}
}
