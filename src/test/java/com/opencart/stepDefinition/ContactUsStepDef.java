package com.opencart.stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.opencart.excelData.ExcelReader;
import com.opencart.pages.ContactUsPage;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class ContactUsStepDef extends BaseClass {
	
	private ContactUsPage contact;
	WebDriver driver;
	
	@Given("^user navigates to contact us page$")
	public void user_navigates_to_contact_us_page() {
		driver.get("http://automationpractice.com/index.php?controller=contact");
	}

	@When("^user enters all data using sheet name \"([^\"]*)\" and row number (\\d+)$")
	public void user_enters_all_data_using_sheet_name_and_row_number(String sheetName, int rowNumber)throws Throwable{
	   ExcelReader readexcel=new ExcelReader();
	   List<Map<String, String>> testData=readexcel.getData("C:\\Users\\Tejaswin\\Desktop\\Vinay\\New folder\\FeatureExcel.xlsx", sheetName);
	   String heading=testData.get(rowNumber).get("Subjectheading");
	   String emailId=testData.get(rowNumber).get("Email");
	   String orderref=testData.get(rowNumber).get("OrderRef");
	   String message=testData.get(rowNumber).get("Message");
	   
	   contact.FillContactUsFrom(heading, emailId, orderref, message);
	}

	@When("^user clicks on send button$")
	public void user_clicks_on_send_button() throws Throwable {
		contact.clickSend();
	}

	@Then("^user gets a success message \"([^\"]*)\"$")
	public void user_gets_a_success_message(String expectedSuccesssMsg) throws Throwable {
		String actualSuccessMsg=contact.getSuccessMsg();
		Assert.assertEquals(expectedSuccesssMsg, actualSuccessMsg);
	}
}
