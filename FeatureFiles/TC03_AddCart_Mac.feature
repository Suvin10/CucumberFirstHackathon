Feature: Add Mac to cart page

Scenario: Add to cart the Apple(mac) laptop model
    Given launch the opencart website using property file
    When Go to My Account and Select login 
	Then enter the valid credentails and submit 
	And click the desktop and select Mac
	And click add button of Mac laptop 
	And Verify mac laptop is succesfully added to the cart
	
	
	 