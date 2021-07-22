Feature: remove items in Cart operation in open cart page

Scenario: Verifying User able to delete items in cart functionality
	Given launch the opencart website using property file 
	When Go to My Account and Select login 
	Then enter the valid credentails and submit 
	Then user going to click on shopping cart and remove the item and click on continue
	#Then user should able to remove the item and click on continue