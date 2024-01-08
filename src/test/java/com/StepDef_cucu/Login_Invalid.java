package com.StepDef_cucu;

import org.apache.log4j.Logger;

import com.Constants_cucu.Constants;
import com.PageObjModel_cucu.LoginPage;
import com.webdriverManager_cucu.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Invalid {

	private static final Logger LOGGER = Logger.getLogger(Login_Invalid.class);

	@Given("The User on the Swag Labs login page")
	public void the_user_on_the_swag_labs_login_page() {
		DriverManager.getDriver().get(Constants.APP_URl);
		LOGGER.info("Given URL is is Ok");
	}

	@When("User valid Invalid username and Ipassword")
	public void user_valid_invalid_username_and_ipassword() {
		LoginPage.getInstance().enterUsernameUN(Constants.DummyUsername);
		LOGGER.info("Dummy Username entered Successfully");
		LoginPage.getInstance().enterPasswordPWD(Constants.DummyPassword);
		LOGGER.info("Dummy Password entered Successfully");
	}

	@When("The User click the login button")
	public void the_user_click_the_login_button() {
		LOGGER.info("Login Button Clicked");
		LoginPage.getInstance().clickLoginButton();
	}

	@Then("User logged in Unsuccessfull")
	public void user_logged_in_unsuccessfull() {
		LoginPage.getInstance().clickerrorMSG();
		LOGGER.info("User Enter Invalid Details, So Login UnSuccessfull");
	}
}
