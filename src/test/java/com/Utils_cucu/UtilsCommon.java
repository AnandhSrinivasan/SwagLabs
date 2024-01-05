package com.Utils_cucu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import com.Constants_cucu.Constants;

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
		Constants.ChromeDriver_Location = prop.getProperty("ChromeDriver_Location");
	}
}
