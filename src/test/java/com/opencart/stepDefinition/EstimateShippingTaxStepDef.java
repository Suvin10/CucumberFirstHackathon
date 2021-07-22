package com.opencart.stepDefinition;

import com.opencart.pages.EstimateShippingTax;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.When;

public class EstimateShippingTaxStepDef extends BaseClass {
	EstimateShippingTax estimatetax;
	
	@When("^click the Item basket button and apply estimate shipping$")
	public void click_the_Item_basket_button_and_apply_estimate_shipping() throws Throwable {
		estimatetax=new EstimateShippingTax();
		estimatetax.estimateTax();
		estimatetax.placeorder();
	}
}
