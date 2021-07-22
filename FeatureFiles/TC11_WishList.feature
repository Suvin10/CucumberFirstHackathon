Feature: Wish list
Scenario: verify user is able to add to wish list
   Given launch the opencart website using property file 
   When Go to My Account and Select login 
	Then enter the valid credentails and submit 
	Then Mouseover on components click monitors and select price
	Then add to wish list and click on wish list icon
	Then add to cart and take screenshot
   