package com.Utils_cucu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Constants_cucu.Constants;
import com.PageObjModel_cucu.Homepage;
import com.PageObjModel_cucu.LoginPage;
import com.webdriverManager_cucu.DriverManager;

public class UtilsCommon {

	public void loadProperties() {

		Properties prop = new Properties();
		try {
			prop.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constants.APP_URl = prop.getProperty("APP_URL");
		Constants.BROWSER = prop.getProperty("BROWSER");
		Constants.UserName = prop.getProperty("UserName");
		Constants.Password = prop.getProperty("Password");
		//Constants.ChromeDriver_Location = prop.getProperty("ChromeDriver_Location");
		Constants.DummyUsername = prop.getProperty("DummyUN");
		Constants.DummyPassword = prop.getProperty("DummyPwd");
	}

	public void initWebElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPage.class);
		PageFactory.initElements(DriverManager.getDriver(), Homepage.class);
	}		

}
