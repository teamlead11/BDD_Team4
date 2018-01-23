package com.stepdefinition;

import com.ObjectRepository.FlipkartAppliances;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FlipkartAppSteps extends FunctionalLibrary {

	@Given("^I am on Flipkart Page$")
	public void i_am_on_Flipkart_Page() throws Throwable {
		driver.get("https://www.flipkart.com");
	}

	@When("^Printing the alues based on module$")
	public void printing_the_alues_based_on_module() throws Throwable {
		FlipkartAppliances F = new FlipkartAppliances();
		click(F.getAppliancesModule());
		F.fridgeNames();
		F.washingMachineModes();
		F.kitchenApp();

	}

}
