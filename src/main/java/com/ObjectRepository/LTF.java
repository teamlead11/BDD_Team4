package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class LTF extends FunctionalLibrary {

	@FindBy(xpath = "//a[text()='Locations']")
	private WebElement btnLocation;

	@FindBy(xpath = "//input[@id='locationInput']")
	private WebElement txtSearch;

	@FindBy(xpath = "Locate a Club Search Field:")
	private WebElement searchBox;

	@FindBy(xpath = "//p[text()='Dallas - Highland Park']")
	private WebElement locationName;

	public WebElement getLocationName() {
		return locationName;
	}

	public WebElement getBtnLocation() {
		return btnLocation;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void LifeTime() {
		PageFactory.initElements(driver, this);
	}

	public void verifyUserpage(String Name) {
		if (getLocationName().getText().equals(Name)) {
			System.out.println("Dallas - Highland Park");
		}

	}
}
