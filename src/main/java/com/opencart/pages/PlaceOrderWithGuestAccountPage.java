package com.opencart.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.opencart.util.BaseClass;

public class PlaceOrderWithGuestAccountPage extends BaseClass {
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	WebElement laptop;
	
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	WebElement allLaptop;
	
	@FindBy(xpath="(//a[text()='HP LP3065'])[1]")
	WebElement hpLaptop;
	
	@FindBy(id="button-cart")
	WebElement addToCart;
	
	@FindBy(id="cart-total")
	WebElement viewCart;
	
	@FindBy(xpath="//strong[text()=' Checkout']")
	WebElement checkOut;
	
	@FindBy(xpath="//input[@value='guest']")
	WebElement radioBtn;
	
	@FindBy(id="button-account")
	WebElement clickContinue;
	
	@FindBy(id="input-payment-firstname")
	WebElement fName;
	
	@FindBy(id="input-payment-lastname")
	WebElement lname;
	
	@FindBy(id="input-payment-email")
	WebElement email;
	
	@FindBy(id="input-payment-telephone")
	WebElement phone;
	
	@FindBy(id="input-payment-address-1")
	WebElement address1;
	
	@FindBy(id="input-payment-address-2")
	WebElement address2;
	
	@FindBy(id="input-payment-city")
	WebElement city;
	
	@FindBy(id="input-payment-postcode")
	WebElement postcode;
	
	@FindBy(id="input-payment-country")
	WebElement country;
	
	@FindBy(id="input-payment-zone")
	WebElement zone;
	
	@FindBy(id="button-guest")
	WebElement guestContinue;
	
	@FindBy(id="button-shipping-method")
	WebElement flatBtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement checkbox;
	
	@FindBy(id="button-payment-method")
	WebElement paymentsubmit;
	
	@FindBy(id="button-confirm")
	WebElement confirmOrder;
	
	public PlaceOrderWithGuestAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectLaptops() {
		
		Actions action=new Actions(driver);
		action.moveToElement(laptop).build().perform();
		allLaptop.click();
			
	}
	
	public void selectHpLaptop() throws InterruptedException {
		
		hpLaptop.click();
		addToCart.click();
		
	}
	
	public void checkOutlaptop() {
		viewCart.click();
		checkOut.click();
		
	}
	
	public void selectGuestOptions(String firstname,String lastName, String mail, String number,
			String add1, String add2,String city1, String code )  {
		
		radioBtn.click();
		clickContinue.click();
		fName.sendKeys(firstname);
		lname.sendKeys(lastName);
		email.sendKeys(mail);
		phone.sendKeys(number);
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		city.sendKeys(city1);
		postcode.sendKeys(code);
		country.click();
		Select select=new Select(country);
		select.selectByIndex(1);
		zone.click();
		Select select1=new Select(zone);
		select1.selectByIndex(2);
		guestContinue.click();
		flatBtn.click();
		checkbox.click();
		paymentsubmit.click();
		
	}
	
	public void orderPlaced() {
		
		confirmOrder.click();
		TakesScreenshot ts=(TakesScreenshot)driver;        
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(source, new File("./screenshots/OrderPlacedusingGuestAccount.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Order Placed screenshot is taken");
		
	}
	
	
	
	
	
	
	
	

}
