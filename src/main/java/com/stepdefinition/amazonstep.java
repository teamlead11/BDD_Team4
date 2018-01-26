package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.ObjectRepository.amazon;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonstep extends FunctionalLibrary {

	@Given("^I am on Amazon page$")
	public void i_am_on_Amazon_Page() throws Throwable {
		driverInit();
		driver.get("https://www.amazon.in");
	}

	@When("^Searching the product to add in cart$")
	public void i_Insert_the_text_Search() throws Throwable {
		amazon amz = new amazon();
		amz.InputTxtValue(amz.getTxtSearch(), "iphone x");
		amz.clickopt(amz.getBtnSearch());
		// amz.clickopt(amz.getIphoneX());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// amz.clickopt(amz.getBtnAddToCart());
		amz.GetWindowHandel();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		amz.clickopt(amz.getBtnCartCheckout());

		amz.DeleteBasedOnPrice("Apple iPhone X (Space Grey, 64GB)");
	}

	@Then("^Verify the correct product is deleted$")
	public void i_verify_the_Product_Price() throws Throwable {
		amazon amz = new amazon();
		System.out.println(amz.getListingProductCount().size());
	}

}
