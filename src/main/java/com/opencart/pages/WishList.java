package com.opencart.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.opencart.util.BaseClass;

public class WishList extends BaseClass{
	
	@FindBy(xpath="//a[text()='Components']")
	WebElement components;
	
	@FindBy(xpath="//a[text()='Monitors (2)']")
	WebElement monitors;
	
	@FindBy(id="input-sort")
	WebElement selectPrice;
	
	@FindBy(xpath="//div[@class='button-group']//i[@class='fa fa-heart']")
	WebElement wishList;
	

	@FindBy(id="wishlist-total")
	WebElement clickWishlist;
	
	@FindBy(xpath="//button[@class='btn btn-primary']//i[@class='fa fa-shopping-cart']")
	WebElement addToCart;
	
	@FindBy(id="cart-total")
	WebElement viewbasket;
	
	@FindBy(xpath="//strong[text()=' View Cart']")
	WebElement clickviewCart;
	
	public WishList() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectMonitors() {
		components.click();
		monitors.click();
		Select select=new Select(selectPrice);
		select.selectByIndex(4);
		
	}
	
	public void addWishList() {
		wishList.click();
		clickWishlist.click();
		
	}
	
	public void addCart() throws InterruptedException{
		addToCart.click();
		Thread.sleep(3000);
		viewbasket.click();
		clickviewCart.click();
		TakesScreenshot ts=(TakesScreenshot)driver;        
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    try {
	        FileUtils.copyFile(source, new File("./screenshots/wishlist.png"));
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    System.out.println("Successfully added to wish list and  screenshot is taken");
	}
}
