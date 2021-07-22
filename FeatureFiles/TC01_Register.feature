Feature: User is able to register account in the opencart application
Scenario: Verify user is able to create an account in opencart

    Given launch the opencart website using property file
    When Go to My Account and Select Register
    Then enter the given details in the input field and click submit
    
 
 Scenario: Register Account failure
 		
 		Given launch the opencart website using property file
    	When Go to My Account and Select Register
    	Then enter the  details in the input field and click submit