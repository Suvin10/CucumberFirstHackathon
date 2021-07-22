Feature: User is able to edit the existing login account 
Scenario: Verify user is able to edit the account 
	Given launch the opencart website using property file 
	When Go to My Account and Select login 
	Then enter the valid credentails and submit 
	Then click edit account and update lastname and capture success message
	Then click logout and return to home page