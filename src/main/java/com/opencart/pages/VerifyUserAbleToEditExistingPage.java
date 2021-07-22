package com.opencart.pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import com.opencart.util.BaseClass;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUserAbleToEditExistingPage extends BaseClass {
		       
	@FindBy(xpath="//a[text()='Edit Account']")
	WebElement editAccount;
	
	@FindBy(id="input-lastname")
	WebElement lastname;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement clickContinue;
	
	@FindBy(xpath="//div[contains(text(),' Success: Your account has been successfully updated.')]")
	WebElement alertMessage;
	
//	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
//	WebElement alertMessage;
	
	@FindBy(xpath="//div[@class='list-group']//a[contains(text(),'Logout')]")
	WebElement logOut;
	
	@FindBy(xpath="//*[@id=\"common-success\"]/ul/li[1]/a")
	WebElement homeIcon;
	
	public VerifyUserAbleToEditExistingPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void edit() {
		editAccount.click();
		lastname.clear();
		lastname.sendKeys("Ramesh");
		//assertTrue(alertMessage.isDisplayed());
	}
	
	public void logout() {
		logOut.click();
		homeIcon.click();
	}

	public void  verifyAlertMessage() {
		assertTrue(alertMessage.isDisplayed());
		System.out.println("Last name edited successfully");
		
		TakesScreenshot ts=(TakesScreenshot)driver;        
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(source, new File("./screenshots/EditLastName.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("The screenshot is taken");
		
	}	 

	}


