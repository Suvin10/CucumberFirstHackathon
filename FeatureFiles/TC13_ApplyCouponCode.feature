Feature: This is to test Applying Couponcode operation in open cart page
Scenario: Applying Couponcode operation

Given launch the opencart website using property file 
	Given launch the opencart website using property file  
    When mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks
    And select hp laptop and click add to cart
	#Then user going to enter date and quantity
	#|2021-19-07|5|
	Then user going to click add cart button and click shopping cart
	Then user is going to apply coupon code
	