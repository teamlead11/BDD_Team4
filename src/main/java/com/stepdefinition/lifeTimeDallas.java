package com.stepdefinition;

import com.ObjectRepository.LTF;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lifeTimeDallas extends FunctionalLibrary {

	@Given("^I am on LifeTime Fitness Page$")
	public void i_am_on_LifeTime_Fitness_Page() throws Throwable {
		driver.get("https://www.lifetime.life");
	}

	@When("^clicking on the location and search Dallas$")
	public void clicking_on_the_location_and_search_Dallas() throws Throwable {
		LTF l = new LTF();
		click(l.getBtnLocation());
		setText(l.getTxtSearch(), "Dallas");
		click(l.getSearchBox());

	}

	@Then("^Verify wether the user has searched dallas location$")
	public void verify_wether_the_user_has_searched_dallas_location() throws Throwable {
		LTF l = new LTF();
		l.verifyUserpage("Dallas - Highland Park");
	}

}
