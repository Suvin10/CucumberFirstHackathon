package com.opencart.stepDefinition;

import com.opencart.pages.ProductReturn;
import com.opencart.util.BaseClass;
import cucumber.api.java.en.Then;

public class ProductReturnStepDef extends BaseClass{
	ProductReturn returnproduct;

	@Then("^click order history and click view$")
	public void click_order_history_and_click_view() throws Throwable {
		returnproduct=new ProductReturn();
		returnproduct.selectOrderhistory();
	}

	@Then("^click retun and enter mandatory fields and submit$")
	public void click_retun_and_enter_mandatory_fields_and_submit() throws Throwable {
		returnproduct=new ProductReturn();
		returnproduct.returnProducts();
	}
}
