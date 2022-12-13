package com.stepdefenition;

import java.io.IOException;

import com.base.Baseclass;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef extends Baseclass {
	
	LoginPage login=new LoginPage();
	HomePage home=new HomePage();
	
	@When("user is on home page")
	public void user_is_on_home_page() {
	    
		login.enter_creds();
		login.login_click();
	}

	@Then("click on New work order")
	public void click_on_new_work_order() {
	   
		home.newworkorderclick();
	}

	@Then("Read the data like {string} and {int} and {int} from excel and fill it")
	public void read_the_data_like_and_and_from_excel(String str6, Integer int1, Integer int2) throws IOException {

		home.filldata(str6, int1, int2);
	}

	@Then("click on save")
	public void click_on_save() {
	    
		
	}

}
