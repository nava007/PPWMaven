package com.stepdefenition;

import org.testng.Assert;


import com.base.Baseclass;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageStepDef extends Baseclass {
	
	LoginPage login=new LoginPage();
	@Given("user has to enter correct uname and pw")
	public void user_has_to_enter_correct_uname_and_pw() {
	    
		login.enter_creds();
	}

	@Then("click on login")
	public void click_on_login() throws InterruptedException {

		login.login_click();
	}

	@Then("verify user landed to home page")
	public void verify_user_landed_to_home_page() {

		String title=login.verify_homepage();
		Assert.assertEquals(title, "PPWTest");
	}

	@Given("user has to click on Term of service link")
	public void user_has_to_click_on_term_of_service_link() {
		login.Term_link_click();
		
	}

	@Then("verify user landed on Term of service page")
	public void verify_user_landed_on_term_of_service_page() {
		
		Assert.assertEquals(login.servicepage_title(), "Terms of Service");
	}

}
