package com.opencart.pages;



import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.opencart.util.BaseClass;



public class AddToCartMacPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement desktop;
	
	@FindBy(xpath="//a[contains(text(),'Mac (1)')]")
	WebElement selectMac;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertMessage;
	
	public AddToCartMacPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectMacLaptop() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(desktop).build().perform();
		Thread.sleep(3000);
		selectMac.click();
	}
	
	public void addToCart() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartBtn);
		addToCartBtn.click();
	}
	
	public void  verifyAlertMessage() {
		assertTrue(alertMessage.isDisplayed());
		System.out.println("Item is added successfully");
		
		TakesScreenshot ts=(TakesScreenshot)driver;        
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(source, new File("./screenshots/AddToCart.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("The screenshot is taken");
		
	}	
}
	
	
	
	
	


