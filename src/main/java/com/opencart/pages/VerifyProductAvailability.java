package com.opencart.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.util.BaseClass;

public class VerifyProductAvailability extends BaseClass {
	 	@FindBy(name="search")
	    WebElement search;
	 
	    @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	    WebElement search1;
	    
	    @FindBy(linkText="iPhone")
	    WebElement iphone;
	    
	    @FindBy(name="quantity")
	    WebElement quantity;
	    
	    @FindBy(id="button-cart")
	    WebElement addtocart;
	    
	    @FindBy(id="cart-total")
	    WebElement viewCart;
	        
	        @FindBy(xpath="//strong[text()=' Checkout']")
	        WebElement checkOut;
	        
	    public VerifyProductAvailability() {
	        PageFactory.initElements(driver, this);
	    }
	 
	    public void searchprd()
	    {
	        search.sendKeys("Iphone");
	        search1.click();
	    }
	    public void phone()
	    {
	        iphone.click();
	        quantity.clear();
	        quantity.sendKeys("2");
	        addtocart.click();
	    }
	    public void check() throws InterruptedException
	    {
	        viewCart.click();
	        checkOut.click();
	        Thread.sleep(1000);
	        TakesScreenshot ts=(TakesScreenshot)driver;        
	        File source=ts.getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(source, new File("./screenshots/productavailablity.png"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        System.out.println("The screenshot is taken");
	    Thread.sleep(10000);
	    }
	}
	 


