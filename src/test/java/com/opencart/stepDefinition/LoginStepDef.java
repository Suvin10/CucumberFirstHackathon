package com.opencart.stepDefinition;

import java.util.ArrayList;

import org.junit.Assert;

import com.opencart.excelData.ReadExcelFile;
import com.opencart.pages.LoginPage;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends BaseClass {
	
	LoginPage loginPage;
	ReadExcelFile excelFile;
	
	@When("^Go to My Account and Select login$")
	public void go_to_My_Account_and_Select_login() throws Throwable {
		
		loginPage=new LoginPage();
		loginPage.clickloginBtn();
	    
	   
	}

	@Then("^enter the valid credentails and submit$")
	public void enter_the_valid_credentails_and_submit() throws Throwable {
		loginPage=new LoginPage();
		excelFile=new ReadExcelFile();
		ArrayList<String> testdata=excelFile.getData("user1");
		loginPage.login(testdata.get(3), testdata.get(5));
		System.out.println("Login Successfully");
		
		
	    
	}
	
	@Then("^click home icon and verify the title$")
	public void click_home_icon_and_verify_the_title() throws Throwable {
		
		loginPage=new LoginPage();
		loginPage.goToHomePage();
		String pageTitle=loginPage.verifyHomePageTitle();
		Assert.assertEquals("Your Store", pageTitle);
		
	  
	}

}
