Feature: User is able to apply estimate shipping

Scenario: Verify Remove cart 
	Given launch the opencart website using property file 
	When Go to My Account and Select login 
	Then enter the valid credentails and submit 
	When mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks 
	And select the hp laptop and click add to cart 
	And click the Item basket button and apply estimate shipping
