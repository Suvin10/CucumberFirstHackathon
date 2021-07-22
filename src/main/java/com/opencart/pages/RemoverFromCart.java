package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.util.BaseClass;

public class RemoverFromCart extends BaseClass {
	@FindBy(id="cart-total")
	WebElement viewbasket;
	
	@FindBy(xpath="//strong[text()='View Cart']")
	WebElement clickviewCart;
	
	@FindBy(xpath="//button[@type='button' and @class='btn btn-danger']")
	WebElement closePopup2;
	
	public RemoverFromCart() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void removeCart() {
		viewbasket.click();
		clickviewCart.click();
		closePopup2.click();
	}

}
