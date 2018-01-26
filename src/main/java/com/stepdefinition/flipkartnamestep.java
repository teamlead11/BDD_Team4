package com.stepdefinition;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.ObjectRepository.flipkartname;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class flipkartnamestep extends FunctionalLibrary {

	@Given("^I am on Flipkart Page$")
	public void i_am_on_Flipkart_Page() throws Throwable {
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		click(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")));
		
}

	@When("^Printing the alues based on module$")
	public void printing_the_alues_based_on_module() throws Throwable {
		flipkartname F = new flipkartname();
		click(F.getAppliancesModule());
		F.fridgeNames();
		F.washingMachineModes();
		F.kitchenApp();

	}

}
