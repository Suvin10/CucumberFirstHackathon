package com.opencart.stepDefinition;

import com.opencart.pages.VerifyUploadFile;
import com.opencart.util.BaseClass;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyUploadFileStepDef extends BaseClass {
	
	VerifyUploadFile file;
	
	@When("^Mouseover on Components click monitors and select apple cinema (\\d+)$")
	public void mouseover_on_Components_click_monitors_and_select_apple_cinema(int arg1) throws Throwable {
		
		file=new VerifyUploadFile();
		file.selectApple();	    
	}

	@Then("^able to enter all the required fields and upload file\\.$")
	public void able_to_enter_all_the_required_fields_and_upload_file() throws Throwable {
		file=new VerifyUploadFile();
		file.enterInputFeild();
	}

	@Then("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		file=new VerifyUploadFile();
		file.addToCart();
	}

	}


