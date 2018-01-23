package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class Flipkart extends FunctionalLibrary {
	
	@FindBy(className = "LM6RPg")
	private WebElement txtSearch;
	
	@FindBy(className = "vh79eN")
	private WebElement btnSearch;
	
	@FindBy(className = "_1Nyybr _30XEf0")
	private List<WebElement> mobilePhones;
	
	@FindBy(className = "_2AkmmA _2Npkh4 _2MWPVK")
	private WebElement addToCart;
	
	@FindBy(className = "_325-ji _3ROAwx")
	private List<WebElement> cartListing;
	
	@FindBy(xpath= "//span[text()='Remove']")
	private WebElement removeItems;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public List<WebElement> getMobilePhones() {
		return mobilePhones;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public List<WebElement> getCartListing() {
		return cartListing;
	}

	public WebElement getRemoveItems() {
		return removeItems;
	}
	
	public Flipkart() {
PageFactory.initElements(FunctionalLibrary.driver,this);
	}
public void deleteBasedOnName(String name) {
	if(getCartListing().equals(name)) {
		click(getRemoveItems());
	}
		
}
}
