package com.opencart.stepDefinition;

import org.junit.Assert;

import com.opencart.pages.AddToCartMacPage;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.Then;

public class AddToCartMacLaptopStepDef extends BaseClass {
	
	AddToCartMacPage addCart;
	
	@Then("^click the desktop and select Mac$")
	public void click_the_desktop_and_select_Mac() throws Throwable {
		
		addCart=new AddToCartMacPage();
		addCart.selectMacLaptop();
	   
	}

	@Then("^click add button of Mac laptop$")
	public void click_add_button_of_Mac_laptop() throws Throwable {
		addCart=new AddToCartMacPage();
		addCart.addToCart();
	    
	}

	@Then("^Verify mac laptop is succesfully added to the cart$")
	public void verify_mac_laptop_is_succesfully_added_to_the_cart() throws Throwable {
		addCart=new AddToCartMacPage();
		
		addCart.verifyAlertMessage();
	   
	}


}
