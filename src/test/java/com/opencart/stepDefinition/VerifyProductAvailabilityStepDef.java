package com.opencart.stepDefinition;

import com.opencart.util.BaseClass;
import cucumber.api.java.en.Then;
import com.opencart.pages.VerifyProductAvailability;

public class VerifyProductAvailabilityStepDef extends BaseClass {
	VerifyProductAvailability product;
	
	@Then("^Enter iphone in search option and click on search button$")
	public void enter_iphone_in_search_option_and_click_on_search_button() throws Throwable {
		product=new VerifyProductAvailability();
		product.searchprd();
	  
	}
	
	@Then("^click on iphone img and enter the quantity and click on add to cart$")
	public void click_on_iphone_img_and_enter_the_quantity_and_click_on_add_to_cart() throws Throwable {
		product=new VerifyProductAvailability();
		product.phone();
	}

	@Then("^click on checkout and verify the message$")
	public void click_on_checkout_and_verify_the_message() throws Throwable {
		product=new VerifyProductAvailability();
		product.check();
	   
	}
}
