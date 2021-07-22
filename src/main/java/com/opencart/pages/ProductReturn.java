package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.util.BaseClass;

public class ProductReturn extends BaseClass {
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath="//aside[@id='column-right']//a[text()='Order History']")
	WebElement orderHistory;
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	WebElement view;
	
	@FindBy(xpath="//i[@class='fa fa-reply']")
	WebElement retunOrder;
	
	@FindBy(xpath="//input[@type='radio' and @value='1' and @name='return_reason_id']")
	WebElement radioReason;
	
	@FindBy(xpath="//input[@type='radio' and @value='0' and @name='opened']")
	WebElement radioProduct1;
	
	@FindBy(xpath="//input[@type='radio' and @value='1' and @name='opened']")
	WebElement radioProduct;
	
	@FindBy(id="input-comment")
	WebElement comment;

	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public ProductReturn() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectOrderhistory() {
		orderHistory.click();
		view.click();	
	}
	
	public void returnProducts() {
		retunOrder.click();
		radioReason.click();	
		comment.sendKeys("Retun");
		submit.click();
		
	}

}
