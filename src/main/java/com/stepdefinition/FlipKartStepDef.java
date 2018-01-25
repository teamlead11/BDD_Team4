package com.stepdefinition;

import java.io.File;

import org.openqa.selenium.By;

import com.ObjectRepository.FlipKartPOM;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipKartStepDef extends FunctionalLibrary {

	@Given("^I am on Flipkart Home page$")
	public void i_am_on_Flipkart_Home_page() throws Throwable {
		driver.get("https://www.flipkart.com");
	}

	@When("^I have print on the washing machine,Refigerators and Kitchen App$")
	public void i_have_print_on_the_washing_machine_Refigerators_and_Kitchen_App() throws Throwable {
		FlipKartPOM flip = new FlipKartPOM();
		setText(flip.getTxtSearch(), "iphonex");
		click(flip.getBtnSearch());
		click(flip.getMobilePhones().get(0));
		click(flip.getAddToCart());

		flip.deleteBasedOnName("Apple iPhone X (Silver, 64 GB)");
	}

	@Then("^I validate the Flipkart all Product$")
	public void i_validate_the_Flipkart_all_Product() throws Throwable {
	   
	}

}
