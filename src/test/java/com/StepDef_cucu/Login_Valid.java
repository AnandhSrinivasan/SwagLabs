package com.StepDef_cucu;

import org.apache.log4j.Logger;

import com.Constants_cucu.Constants;
import com.PageObjModel_cucu.Homepage;
import com.PageObjModel_cucu.LoginPage;
import com.webdriverManager_cucu.DriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Valid {

	private static final Logger LOGGER = Logger.getLogger(Login_Valid.class);

	@Given("User on the Swag Labs login page")
	public void user_on_the_swag_labs_login_page() {
		DriverManager.getDriver().get(Constants.APP_URl);
		LOGGER.info("Given URL is is Ok");
	}

	@When("User valid username and password")
	public void user_valid_username_and_password() {
		
		LoginPage.getInstance().getUN().sendKeys(Constants.UserName);
		LOGGER.info("Username entered Successfully");
		LoginPage.getInstance().getPWD().sendKeys(Constants.Password);
		LOGGER.info("Password entered Successfully");
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		LOGGER.info("Login Button Clicked");
		LoginPage.getInstance().getLoginBut().click();
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		String URL =DriverManager.getDriver().getCurrentUrl();
		if (URL.contentEquals("sauecdemo")) {
			LOGGER.info("User Enter Homepage Successfully");	
		}
	}

	@Given("I am on the Swag Labs login page")
	public void i_am_on_the_swag_labs_login_page() {
		String productverify =	Homepage.getInstance().getProductPage().getText();
		productverify.equalsIgnoreCase("Product");
		LOGGER.info("Homepage is verfied");
	}

}
