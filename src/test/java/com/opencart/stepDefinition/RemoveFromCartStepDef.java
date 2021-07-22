package com.opencart.stepDefinition;

import com.opencart.pages.RemoverFromCart;

import cucumber.api.java.en.Then;

public class RemoveFromCartStepDef {
	
	RemoverFromCart  remove;
	
	@Then("^user going to click on shopping cart and remove the item and click on continue$")
	public void user_going_to_click_on_shopping_cart() throws Throwable {
		remove.removeCart();
	}

//	@Then("^user should able to remove the item and click on continue$")
//	public void user_should_able_to_remove_the_item_and_click_on_continue() throws Throwable {
//	   
//	}

}
