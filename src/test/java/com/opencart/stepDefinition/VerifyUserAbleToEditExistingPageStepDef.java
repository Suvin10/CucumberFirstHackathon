package com.opencart.stepDefinition;

import com.opencart.pages.VerifyUserAbleToEditExistingPage;
import com.opencart.util.BaseClass;
import cucumber.api.java.en.Then;

public class VerifyUserAbleToEditExistingPageStepDef extends BaseClass {
	
	VerifyUserAbleToEditExistingPage edit;
	
	@Then("^click edit account and update lastname and capture success message$")
	public void click_edit_account_and_update_lastname_and_capture_success_message() throws Throwable {
		edit =new VerifyUserAbleToEditExistingPage();
		edit.edit();
	   
	}

	@Then("^click logout and return to home page$")
	public void click_logout_and_return_to_home_page() throws Throwable {
		edit =new VerifyUserAbleToEditExistingPage();
		edit.logout();
		edit.verifyAlertMessage();
	}

  }



