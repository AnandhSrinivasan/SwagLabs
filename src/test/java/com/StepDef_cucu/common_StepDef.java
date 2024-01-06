package com.StepDef_cucu;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.Utils_cucu.UtilsCommon;
import com.webdriverManager_cucu.DriverManager;

import io.cucumber.java.Before;

public class common_StepDef {

	private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(common_StepDef.class);

	@Before
	public void beforeScenario() {

		LOGGER.info("Execution is Started");
		try {
			LOGGER.info("Instantiation the UtilsCommon");
			UtilsCommon utilsCommon = new UtilsCommon();
			LOGGER.info("Loading the property file");
			utilsCommon .loadProperties();
			LOGGER.info("Checking Driver is OKAY or NOT?");
			if (DriverManager.getDriver()==null) {
				LOGGER.info("Driver is OKAY and Instantiating it!");
				DriverManager.launchBrowser();
				DriverManager.getDriver().manage().window().maximize();
				DriverManager.getDriver().manage().deleteAllCookies();
				DriverManager.getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
				utilsCommon.initWebElements();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
