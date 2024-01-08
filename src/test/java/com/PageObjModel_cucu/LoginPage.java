package com.PageObjModel_cucu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Constants_cucu.Constants;

public class LoginPage {

	private static LoginPage loginInstance;
	private LoginPage() {	
	}
	public static LoginPage getInstance() {
		if (loginInstance==null) {
			loginInstance = new LoginPage();
		}
		return loginInstance;
	}
	
	
	@FindBy(xpath = "(//input[@id='user-name'])[1]")
	private WebElement UN;
	
	@FindBy(xpath = "(//input[@id='password'])[1]")
	private WebElement PWD;
	
	@FindBy(xpath = "(//input[@id='login-button'])[1]")
	private WebElement LoginBut;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errorLogin;
	
	//By POM Framework 
	
	public void  enterUsernameUN(String userName) {
		UN.sendKeys(userName);
	}
	public void enterPasswordPWD(String passWord) {
		PWD.sendKeys(passWord);
	}
	public void clickLoginButton() {
		LoginBut.click();
	}
	public void clickerrorMSG() {
		errorLogin.click();
	}
	
// Using By Getter and Setter Method
//	public WebElement getUN() {
//		return UN;
//	}
//	public WebElement getPWD() {
//		return PWD;
//	}
//	public WebElement getLoginBut() {
//		return LoginBut;
//	}
//	public WebElement geterrorLogin() {
//		return errorLogin;
//	}
}
