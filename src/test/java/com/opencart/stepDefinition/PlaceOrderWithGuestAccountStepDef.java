package com.opencart.stepDefinition;

import java.util.ArrayList;

import com.opencart.excelData.ReadExcelFile;
import com.opencart.pages.PlaceOrderWithGuestAccountPage;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.When;

public class PlaceOrderWithGuestAccountStepDef extends BaseClass {
	
	PlaceOrderWithGuestAccountPage page;
	ReadExcelFile excelFile;
	
	@When("^mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks$")
	public void mouseover_on_Laptops_and_Notebooks_and_click_on_Show_all_laptops_and_Notebooks() throws Throwable {
		page =new PlaceOrderWithGuestAccountPage();
		page.selectLaptops();
	   
	}

	@When("^select hp laptop and click add to cart$")
	public void select_hp_laptop_and_click_add_to_cart() throws Throwable {
		page =new PlaceOrderWithGuestAccountPage();
		page.selectHpLaptop();
	   
	}

	@When("^click Item basket button and click checkout button$")
	public void click_Item_basket_button_and_click_checkout_button() throws Throwable {
		page =new PlaceOrderWithGuestAccountPage();
		page.checkOutlaptop();
	    
	}

	@When("^Select GuestCheck out option and enter all the mandatory feilds$")
	public void select_GuestCheck_out_option_and_enter_all_the_mandatory_feilds() throws Throwable {
		
		page =new PlaceOrderWithGuestAccountPage();
		excelFile=new ReadExcelFile();
		ArrayList<String> testdata=excelFile.getData("user2");
		page.selectGuestOptions(testdata.get(1), testdata.get(2), testdata.get(3), testdata.get(4),
				testdata.get(7), testdata.get(8), testdata.get(9), testdata.get(10));
	   
	}

	@When("^click terms and condition and place the order$")
	public void click_terms_and_condition_and_place_the_order() throws Throwable {
		page =new PlaceOrderWithGuestAccountPage();
		page.orderPlaced();
	   
	}


}
