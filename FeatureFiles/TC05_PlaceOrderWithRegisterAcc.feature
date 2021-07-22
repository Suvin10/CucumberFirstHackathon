Feature: Order Placement with register account

Scenario: Verify user can able to place order using register account
    Given launch the opencart website using property file  
    When Go to My Account and Select login 
	Then enter the valid credentails and submit 
    When mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks
    And select the hp laptop and click add to cart
    And click Item basket button and click checkout button
    And Select option and enter all the mandatory feilds
    And click terms and condition to place the order
    
