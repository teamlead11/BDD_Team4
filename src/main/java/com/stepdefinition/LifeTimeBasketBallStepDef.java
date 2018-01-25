package com.stepdefinition;

import com.ObjectRepository.LifeTimePom;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LifeTimeBasketBallStepDef extends FunctionalLibrary {

	@Given("^I am on LifeTime Fitness page$")
	public void i_am_on_LifeTime_Fitness_page() throws Throwable {
		driverInit();
		driver.get("https://www.lifetime.life");

	}

	@When("^I click on the sports tab and entering into basketball page$")
	public void i_click_on_the_sports_tab_and_entering_into_basketball_page() throws Throwable {
		LifeTimePom life = new LifeTimePom();

		life.clickopt(life.getSportsTab());
		life.clickopt(life.getBasketBall());

	}

	@Then("^I validate  on Basketball page$")
	public void i_validate_on_Basketball_page() throws Throwable {
		LifeTimePom life = new LifeTimePom();
		life.getCurrnetTitle("Training & Events");

	}

}
