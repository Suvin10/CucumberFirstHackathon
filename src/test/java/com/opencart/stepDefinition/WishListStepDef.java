package com.opencart.stepDefinition;

import com.opencart.pages.WishList;
import com.opencart.util.BaseClass;

import cucumber.api.java.en.Then;

public class WishListStepDef extends BaseClass {
	WishList wishlist;
	
	@Then("^Mouseover on components click monitors and select price$")
	public void mouseover_on_components_click_monitors_and_select_price() throws Throwable {
		wishlist=new WishList();
		wishlist.selectMonitors();
	}

	@Then("^add to wish list and click on wish list icon$")
	public void add_to_wish_list_and_click_on_wish_list_icon() throws Throwable {
		wishlist=new WishList();
		wishlist.addWishList();
	}

	@Then("^add to cart and take screenshot$")
	public void add_to_cart_and_take_screenshot() throws Throwable {
		wishlist=new WishList();
		wishlist.addCart();
	}

}
