package com.opencart.stepDefinition;

import com.opencart.util.BaseClass;

import cucumber.api.java.After;

public class Hook extends BaseClass{
	
	@After
	public void closeBrowser() {
		driver.quit();
	}

}
