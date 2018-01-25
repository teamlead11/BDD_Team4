package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.ObjectRepository.AmazonPOM;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonPage extends FunctionalLibrary {
	@Given("^I am on Amazon Page$")
	public void i_am_on_Amazon_Page() throws Throwable {
		driverInit();
		driver.get("https://www.amazon.in");
	}

	@When("^I Insert the text Search$")
	public void i_Insert_the_text_Search() throws Throwable {
		AmazonPOM amz = new AmazonPOM();
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

	@Then("^I verify the Product Price$")
	public void i_verify_the_Product_Price() throws Throwable {
		AmazonPOM amz = new AmazonPOM();
		System.out.println(amz.getListingProductCount().size());
	}

}
