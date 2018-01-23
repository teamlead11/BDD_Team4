package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

import junit.framework.Assert;

public class LTFBasketBall extends FunctionalLibrary{



		@FindBy(xpath = "//a[text()='Sports']")
		private WebElement sportsTab;

		@FindBy(xpath = "//a[@href='/sports-programs/basketball.html']")
		private WebElement basketBall;

		@FindBy(className = "h4 section-header")
		private List<WebElement> titleBlock;

		public WebElement getSportsTab() {
			return sportsTab;
		}

		public WebElement getBasketBall() {
			return basketBall;
		}

		public List<WebElement> getTitleBlock() {
			return titleBlock;
		}

		public void LTFBasketBall() {
			PageFactory.initElements(driver, this);
		}

		public void getCurrnetPagetTitle(String title) {
			int size = getTitleBlock().size();
			for (int i = 0; i < size; i++) {
				if (getTitleBlock().get(i).getText().equals(title)) {
					System.out.println("User is on Basket Ball page");

				}
			}

		}
	}


