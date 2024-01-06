package com.PageObjModel_cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath = "(//input[@id='user-name'])[1]")
	public static WebElement UN;
	
	@FindBy(xpath = "(//input[@id='password'])[1]")
	public static WebElement PWD;
	
	@FindBy(xpath = "(//input[@id='login-button'])[1]")
	public static WebElement LoginBut;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	public static WebElement errorLogin;
	////*[text()='Epic sadface: Username and password do not match any user in this service']
}
