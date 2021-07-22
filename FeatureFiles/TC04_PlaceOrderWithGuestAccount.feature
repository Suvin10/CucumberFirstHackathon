Feature: Order Placement with guest checkout

Scenario: Verify user can able to place order using guestaccount
    Given launch the opencart website using property file  
    When mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks
    And select hp laptop and click add to cart
    And click Item basket button and click checkout button
    And Select GuestCheck out option and enter all the mandatory feilds
    And click terms and condition and place the order
