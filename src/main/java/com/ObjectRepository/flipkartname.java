package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class flipkartname {

	@FindBy(xpath = "//span[text()='TVs & Appliances']")
	private WebElement appliancesModule;

	@FindBy(xpath = "//span[text()='Washing Machine']")
	private WebElement washingMachine;

	@FindBy(xpath = "(//span[text()='Refrigerators'])[1]")
	private WebElement refrigerator;

	@FindBy(xpath = "//span[text()='Kitchen Appliances']")
	private WebElement kitchenApp;

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

	public flipkartname() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
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
