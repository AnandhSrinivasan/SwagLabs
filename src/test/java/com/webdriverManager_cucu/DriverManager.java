package com.webdriverManager_cucu;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.Constants_cucu.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	private static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void launchBrowser() {
		try {
			switch (Constants.BROWSER) {
			case "Chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching" + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			case "FireFox":
				WebDriverManager.firefoxdriver().setup();
				LOGGER.info("Launching" + Constants.BROWSER);
				driver = new FirefoxDriver();
				break;	
			case "appleSafari":
				WebDriverManager.safaridriver().setup();
				LOGGER.info("Launching" + Constants.BROWSER);
				driver = new SafariDriver();
				break;	

			default:
				WebDriverManager.chromedriver().setup();
				LOGGER.info("Launching" + Constants.BROWSER);
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
