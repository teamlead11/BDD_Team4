package com.stepdefinition;

import com.ObjectRepository.LTFBasketBall;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lftSteps extends FunctionalLibrary {
	
	
	@Given("^I am on LifeTime Fitness page$")
	public void i_am_on_LifeTime_Fitness_page() throws Throwable {
		driver.get("https://www.lifetime.life");
		}

	@When("^clicking on the sports tab and entering into basketball page$")
	public void clicking_on_the_sports_tab_and_entering_into_basketball_page() throws Throwable {
		LTFBasketBall l = new LTFBasketBall();
		click(l.getSportsTab());
		click(l.getBasketBall());
	}

	@Then("^Verify wether the user is on Basketball page$")
	public void verify_wether_the_user_is_on_Basketball_page() throws Throwable {
		LTFBasketBall l = new LTFBasketBall();
		l.getCurrnetPagetTitle("Training & Events");
	}
}
