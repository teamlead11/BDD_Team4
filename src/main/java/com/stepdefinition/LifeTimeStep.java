package com.stepdefinition;

import com.ObjectRepository.LifeTimePom;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LifeTimeStep extends FunctionalLibrary {
	@Given("^I am on LifeTime Fitness Page$")
	public void i_am_on_LifeTime_Fitness_Page() throws Throwable {
		driverInit();
		driver.get("https://www.lifetime.life");

	}

	@When("^I click on the location and search Dallas$")
	public void i_click_on_the_location_and_search_Dallas() throws Throwable {
		LifeTimePom life=new LifeTimePom();
		life.clickopt(life.getBtnLocation());
		life.InputtxtValue(life.getTxtSearch(), "Dallas");
		life.clickopt(life.getSearchBox());

	}

	@Then("^I validate the user has searched dallas location$")
	public void i_validate_the_user_has_searched_dallas_location() throws Throwable {

		LifeTimePom life=new LifeTimePom();
		life.verifyUserpage("Dallas - Highland Park");
	}

}
