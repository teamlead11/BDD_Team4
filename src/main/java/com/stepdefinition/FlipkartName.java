package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.ObjectRepository.Flipkart;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartName extends FunctionalLibrary {

	@Given("^I am on flipkart page$")
	public void i_am_on_flipkart_page() throws Throwable {
		driver.get("https://www.flipkart.com");
	}

	@When("^Search the product to add in cart$")
	public void search_the_product_to_add_in_cart() throws Throwable {
		Flipkart f = new Flipkart();
		setText(f.getTxtSearch(), "iphonex");
		click(f.getBtnSearch());
		click(f.getMobilePhones().get(0));
		click(f.getAddToCart());

	}

	@When("^Delete the product based on name$")
	public void delete_the_product_based_on_name() throws Throwable {
		Flipkart f = new Flipkart();
		f.deleteBasedOnName("Apple iPhone X (Silver, 64 GB)");
	}

	@Then("^Verify whether the product is deleted$")
	public void verify_whether_the_product_is_deleted() throws Throwable {
		Flipkart f = new Flipkart();
		int size = ((List<WebElement>) f.getCartListing()).size();
		System.out.println(size);
	}

}
