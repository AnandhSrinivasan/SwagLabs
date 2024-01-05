package com.StepDef_cucu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {


	@Given("User on the Swag Labs login page")
	public void user_on_the_swag_labs_login_page() {
		System.out.println("Hello 1");
		
	}

	@When("User valid username and password")
	public void user_valid_username_and_password() {
		System.out.println("Hello 2");
		
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		System.out.println("Hello 3");
		
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("Hello 4");
		
	}

	@Given("I am on the Swag Labs login page")
	public void i_am_on_the_swag_labs_login_page() {
		System.out.println("Hello 5");
		
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		System.out.println("Hello 6");
		
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		System.out.println("Hello 7");
		
	}

	@Then("I should see an error message")
	public void i_should_see_an_error_message() {
		System.out.println("Hello 8");
		
	}

}
