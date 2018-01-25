package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class LifeTimePom extends FunctionalLibrary {


		@FindBy(xpath = "//a[text()='Locations']")

		private WebElement btnLocation;

		@FindBy(id = "locationInput")

		private WebElement txtSearch;

		@FindBy(xpath = "//button[@class='btn btn-primary js-omnibox-action']")

		private WebElement searchBox;

		@FindBy(xpath = "//p[text()='Dallas - Highland Park']")

		private WebElement locationName;

		@FindBy(xpath = "//a[text()='Sports']")

		private WebElement sportsTab;

		@FindBy(xpath = "//a[@href='/sports-programs/basketball.html']")

		private WebElement basketBall;

		@FindBy(xpath = "//h3[@class='h4 section-header']")

		private List<WebElement> titleBlock;

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

		public WebElement getSportsTab() {
			return sportsTab;
		}

		public WebElement getBasketBall() {
			return basketBall;
		}

		public List<WebElement> getTitleBlock() {
			return titleBlock;
		}

		public LifeTimePom() {
			PageFactory.initElements(driver, this);
		}

		public void clickopt(WebElement element) {
			element.click();
		}

		public void InputtxtValue(WebElement element, String name) {
			element.sendKeys(name);
		}

		public void verifyUserpage(String Name) {
			if (getLocationName().getText().equals(Name)) {
				System.out.println("Dallas - Highland Park");
			}

		}

		public void getCurrnetTitle(String title) {
			int size = getTitleBlock().size();
			for (int i = 0; i < size; i++) {
				if (getTitleBlock().get(i).getText().equals(title)) {
					// System.out.println("User is on Basket Ball page");

				}
			}

		}

	}


