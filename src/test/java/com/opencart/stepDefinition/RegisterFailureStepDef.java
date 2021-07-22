package com.opencart.stepDefinition;

import java.util.ArrayList;

import com.opencart.excelData.ReadExcelFile;
import com.opencart.pages.RegisterPage;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterFailureStepDef {
	RegisterPage registerPage;
	ReadExcelFile excelFile;
	
	@Given("^launch opencart website using property file$")
	public void launch_opencart_website_using_property_file() throws Throwable {
	    
		BaseClass.launchBrowser();
	}

	@When("^Go to my account and Select Register$")
	public void go_to_my_account_and_Select_Register() throws Throwable {
	    
		registerPage=new RegisterPage();
		registerPage.clickMyAccount();
	}

	@Then("^enter the  details in input field and click submit$")
	public void enter_the_details_in_the_input_field_and_click_submit() throws Throwable {
		registerPage=new RegisterPage();
		excelFile=new ReadExcelFile();
		ArrayList<String> testdata=excelFile.getData("user1");
		registerPage.registerInvalidOpenCart(testdata.get(1), testdata.get(2), testdata.get(3),  testdata.get(5), testdata.get(6));
		System.out.println("User unable to register as a one field is missing");
	}

}
