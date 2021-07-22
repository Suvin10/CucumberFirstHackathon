package com.opencart.stepDefinition;

import java.util.ArrayList;

import com.opencart.excelData.ReadExcelFile;
import com.opencart.pages.PlaceOrderWithRegisterAccPage;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.When;

public class PlaceOrderWithRegisterAcc_StepDef extends BaseClass{
	
	PlaceOrderWithRegisterAccPage page;
	ReadExcelFile excelFile;
	
	@When("^select the hp laptop and click add to cart$")
	public void select_the_hp_laptop_and_click_add_to_cart() throws Throwable {
		
		page=new PlaceOrderWithRegisterAccPage();
		page.selectHpLaptop();
		page.checkOutlaptop();
	
	}
	
	@When("^Select option and enter all the mandatory feilds$")
	public void select_option_and_enter_all_the_mandatory_feilds() throws Throwable {
		
		page =new PlaceOrderWithRegisterAccPage();
		excelFile=new ReadExcelFile();
		ArrayList<String> testdata=excelFile.getData("user1");
		page.selectOptions(testdata.get(1), testdata.get(2), testdata.get(3), testdata.get(4),
				testdata.get(7), testdata.get(8), testdata.get(9), testdata.get(10));
	   
	}

	@When("^click terms and condition to place the order$")
	public void click_terms_and_condition_and_place_the_order() throws Throwable {
		page =new PlaceOrderWithRegisterAccPage();
		page.orderPlaced();
	   
	}


}
