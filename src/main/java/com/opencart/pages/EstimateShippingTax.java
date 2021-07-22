package com.opencart.pages;


import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import com.opencart.util.BaseClass;

public class EstimateShippingTax extends BaseClass {

	@FindBy(id = "cart-total")
	WebElement viewbasket;

	@FindBy(xpath = "//strong[text()=' View Cart']")
	WebElement clickviewCart;

	@FindBy(xpath = "//a[text()='Estimate Shipping & Taxes ']")
	WebElement estimateShipping;

	@FindBy(id = "input-country")
	WebElement country;

	@FindBy(id = "input-zone")
	WebElement zone;

	@FindBy(id = "input-postcode")
	WebElement code;

	@FindBy(id = "button-quote")
	WebElement getQuote;

	@FindBy(xpath = "//input[@value='flat.flat']")
	WebElement alertRadioBtn;

	@FindBy(id = "button-shipping")
	WebElement applyShipping;

	@FindBy(xpath = "//a[text()='Checkout']")
	WebElement clickCheckout;

	@FindBy(xpath = "//input[@value='existing']")
	WebElement radioBtn;

	@FindBy(id = "button-payment-address")
	WebElement clickContinue;

	@FindBy(id = "button-shipping-address")
	WebElement clickDeliveryContinue;

	@FindBy(id = "button-shipping-method")
	WebElement flatcontinue;

	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement checkbox;

	@FindBy(id = "button-payment-method")
	WebElement paymentsubmit;

	@FindBy(id = "button-confirm")
	WebElement confirmOrder;

	public EstimateShippingTax() {
		PageFactory.initElements(driver, this);
	}

	public void estimateTax() throws InterruptedException {
		viewbasket.click();
		clickviewCart.click();
		estimateShipping.click();
		Select select = new Select(country);
		select.selectByIndex(1);
		Select selectzone = new Select(zone);
		selectzone.selectByIndex(2);
		code.clear();
		code.sendKeys("123");
		getQuote.click();

		alertRadioBtn.click();
		//applyShipping.click();
		try {
			
			WebElement applyShipping=driver.findElement(By.id("button-shipping"));
			applyShipping.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebElement applyShipping=driver.findElement(By.id("button-shipping"));
			applyShipping.click();
		}
		

	}
	
	public void placeorder() throws InterruptedException {
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickCheckout);
		Actions scroll=new Actions(driver);
		scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		clickCheckout.click();
//		JavascriptExecutor js2=(JavascriptExecutor) driver;
//		js2.executeScript("arguments[0].click();", clickCheckout);
		clickContinue.click();
		flatcontinue.click();
		checkbox.click();
		paymentsubmit.click();
		confirmOrder.click();
	}

}
