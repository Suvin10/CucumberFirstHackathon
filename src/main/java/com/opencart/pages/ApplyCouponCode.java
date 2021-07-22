package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.opencart.util.BaseClass;

public class ApplyCouponCode extends BaseClass{
	public void myAccount() {
		WebElement account=driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		account.click();
		WebElement login=driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Login')]"));
		login.click();
				
	}
	
	public void userName(String username) {
		WebElement userEmail=driver.findElement(By.xpath("//input[@name='email']"));
		userEmail.sendKeys(username);
	}
	
	public void userPassword(String password) {
		WebElement userPassword=driver.findElement(By.xpath("//input[@name='password']"));
		userPassword.sendKeys(password);
	}
	
	public void loginButton() {
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
	}
public void mouseOverOnLaptopsAndNotebooks() throws InterruptedException {
		
		WebElement laptops=driver.findElement(By.xpath("//a[contains(text(),'Laptops & Notebooks')]"));
	    Actions act=new Actions(driver);
		act.moveToElement(laptops).build().perform();	
	}
    public void selectingallLaptops() {
    	WebElement selectlaptops=driver.findElement(By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]"));
		selectlaptops.click();
    }
    public void selectHPlaptop() {
    	WebElement Hplaptop=driver.findElement(By.xpath("//div[@class='product-thumb']//a[contains(text(),'HP LP3065')]"));
    	Hplaptop.click();
    }
    public void changeDate(String date ,String Quantity) {
    	Actions scroll=new Actions(driver);
		scroll.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		WebElement delivery=driver.findElement(By.xpath("//input[@id='input-option225']"));
		delivery.sendKeys(date);
		WebElement quantity=driver.findElement(By.xpath("//input[@name='quantity']"));
		quantity.clear();
		quantity.sendKeys(Quantity);
    }
    
    public void addCart() {
    	WebElement cart=driver.findElement(By.id("button-cart"));
    	cart.click();
    	WebElement shoppCart=driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]"));
    	shoppCart.click();
        }
    public void couponCode()throws InterruptedException {
    	
    	Thread.sleep(2000);
    	WebElement coupon=driver.findElement(By.xpath("//div[@id='accordion']//a[@href='#collapse-coupon']"));
    	coupon.click();
    	WebElement entercode=driver.findElement(By.xpath("//input[@id='input-coupon']"));
    	entercode.sendKeys("VIN123");
    	WebElement apply=driver.findElement(By.xpath("//input[@id='button-coupon']"));
    	apply.click();
    	System.out.println("coupon applied succesfully");
    	
    }


}
