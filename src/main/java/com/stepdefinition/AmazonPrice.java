package com.stepdefinition;

import com.ObjectRepository.Amazon;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonPrice extends FunctionalLibrary {

	@Given("^I am on Amazon home page$")
	public void i_am_on_Amazon_home_page() throws Throwable {

		driver.get("https://www.amazon.in");
	}

	@When("^Searching the product to add in cart and Adding$")
	public void searching_the_product_to_add_in_cart_and_Adding() throws Throwable {
		Amazon a = new Amazon();
		setText(a.getTxtSearch(), "iphone x");
		click(a.getBtnSearch());
		click(a.getIphoneX());
		click(a.getAddToCart());
		click(a.getCartCheckout());

	}

	@When("^Deleting the product based on price$")
	public void deleting_the_product_based_on_price() throws Throwable {
		Amazon a = new Amazon();
		a.deleteBasedOnPrice("87,400.00");
	}

	@Then("^Verify whether the correct product is deleted$")
	public void verify_whether_the_correct_product_is_deleted() throws Throwable {
		Amazon a = new Amazon();
		System.out.println(a.getListingProductCount().size());

	}

}
