package com.opencart.pages;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.opencart.util.BaseClass;

public class VerifyUploadFile extends BaseClass {
	
	@FindBy(xpath="//a[text()='Components']")
	WebElement components;
	
	@FindBy(xpath="//a[text()='Monitors (2)']")
	WebElement monitors;
	
	@FindBy(xpath="//a[text()='Apple Cinema 30\"']")
	WebElement appleMonitor;
	
	@FindBy(xpath="//input[@value='10']")
	WebElement checkbox;
	
	@FindBy(id="input-option208")
	WebElement text;
	
	@FindBy(id="input-option217")
	WebElement selectField;
	
	@FindBy(id="input-option209")
	WebElement textArea;
	
	@FindBy(id="button-upload222")
	WebElement upload;
	
	@FindBy(id="button-cart")
	WebElement addcart;
	
	@FindBy(xpath="//div[text()='File required!']")
	WebElement errorMessage;
	
	public VerifyUploadFile() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectApple() {
		Actions action=new Actions(driver);
		action.moveToElement(components).build().perform();
		monitors.click();
		appleMonitor.click();
		
		
	}
	
	public void enterInputFeild() throws AWTException, InterruptedException {
		checkbox.click();
		text.sendKeys("Test");
		Select select=new Select(selectField);
		select.selectByIndex(2);
		textArea.sendKeys("Text area");
		upload.click();	
		
	}
	
	public void addToCart() {
		addcart.click();
		assertTrue(errorMessage.isDisplayed());
		System.out.println("User unable to add the product to cart as file is not uploaded");
	}


}
