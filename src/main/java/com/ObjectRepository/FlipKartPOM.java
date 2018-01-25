package com.ObjectRepository;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlipKartPOM extends FunctionalLibrary {

	@FindBy(xpath = "//span[text()='Appliances']")
	private WebElement appliancesModule;

	@FindBy(xpath = "//span[text()='Washing Machine']")
	private WebElement washingMachine;

	@FindBy(xpath = "(//span[text()='Refrigerators'])[1]")
	private WebElement refrigerator;

	@FindBy(xpath = "//span[text()='Kitchen Appliances']")
	private WebElement kitchenApp;

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
	
	
	
	
	public WebElement getAppliancesModule() {
		return appliancesModule;
	}

	public WebElement getWashingMachine() {
		return washingMachine;
	}

	public WebElement getRefrigerator() {
		return refrigerator;
	}

	public WebElement getKitchenApp() {
		return kitchenApp;
	}

	public FlipKartPOM() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	public void deleteBasedOnName(String name) {
		if(getCartListing().equals(name)) {
			click(getRemoveItems());
		}
		}
	
	
	public void fridgeNames() {
		WebElement refrigerator2 = getRefrigerator();
		List<WebElement> list = refrigerator2.findElements(By.tagName("li"));
		for (int i = 0; i < list.size(); i++) {
			String fridgeModes = list.get(i).getText();
			System.out.println(fridgeModes);
		}

	}

	public void washingMachineModes() {
		WebElement washing = getWashingMachine();
		List<WebElement> list = washing.findElements(By.tagName("li"));
		for (int i = 0; i < list.size(); i++) {
			String washingMachine = list.get(i).getText();
			System.out.println(washingMachine);
		}
	}

	public void kitchenApp() {
		WebElement kitchen = getKitchenApp();
		List<WebElement> list = kitchen.findElements(By.tagName("li"));
		for (int i = 0; i < list.size(); i++) {
			String kitchenList = list.get(i).getText();
			System.out.println(kitchenList);
		}

}

}