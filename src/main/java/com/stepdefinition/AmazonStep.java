package com.stepdefinition;

import com.ObjectRepository.Amazon;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStep extends FunctionalLibrary {

	@Given("^I am on Amazon page$")
	public void i_am_on_Amazon_page() throws Throwable {
		driver.get("https://www.amazon.in");
	}

	@When("^Searching the product to add in cart$")
	public void searching_the_product_to_add_in_cart() throws Throwable {
		Amazon a = new Amazon();
		setText(a.getTxtSearch(), "iphone x");
		click(a.getBtnSearch());
		click(a.getIphoneX());
		click(a.getAddToCart());
		click(a.getCartCheckout());

	}

	@When("^Deleting the product based on name$")
	public void deleting_the_product_based_on_name() throws Throwable {
		Amazon a = new Amazon();
		a.deleteBasedOnName("Apple iPhone X (Space Grey, 64GB)");
	
	}

	@Then("^Verify the correct product is deleted$")
	public void verify_the_correct_product_is_deleted() throws Throwable {
		Amazon a = new Amazon();
		System.out.println(a.getListingProductCount().size());

	}

}
