package com.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	private WebDriver driver;
	
//	private By subjectHeading = By.id("id_contact");
//	private By email = By.id("email");
//	private By orderRef = By.id("id_order");
//	private By messageText = By.id("message");
//	private By submitButton = By.id("submitMessage");
//	private By succesMsg = By.cssSelector("div#center_column p");
	
	@FindBy(id="id_contact")
	WebElement subjectHeading;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="id_order")
	WebElement orderRef;
	
	@FindBy(id="message")
	WebElement messageText;
	
	@FindBy(id="submitMessage")
	WebElement submitButton;
	
	@FindBy(id="div#center_column p")
	WebElement succesMsg;
	
	public ContactUsPage (WebDriver driver){
		this.driver=driver;
	}
	
	public void FillContactUsFrom(String heading,String emailId,String orderref,String message){
//		Select select=new Select(succesMsg);
//		succesMsg.select.selectByVisibleText(heading);
		email.sendKeys(emailId);
		orderRef.sendKeys(orderref);
		messageText.sendKeys(message);
	}
	
	public void clickSend(){
		submitButton.click();	
	}
	
	public String getSuccessMsg(){
		return succesMsg.getText();	
	}

}
