package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class amazon extends FunctionalLibrary {

	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtSearch;

	@FindBy(xpath = "(//span[@class='nav-search-submit-text nav-sprite']")
	private WebElement btnSearch;

	@FindBy(xpath = "(//div[@class='a-row a-spacing-none'])[1]")
	private WebElement oneplus;

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCart;

	@FindBy(id = "hlb-view-cart-announce")
	private WebElement cartCheckout;

	@FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
	private WebElement mobileName;

	@FindBy(className = "a-size-small sc-action-delete")
	private WebElement deleteProduct;

	@FindBy(className = "a-size-medium sc-product-title a-text-bold")
	private List<WebElement> listingProductCount;
	
	@FindBy(className = "a-size-medium a-color-price sc-price sc-white-space-nowrap sc-product-price sc-price-sign a-text-bold")
	private WebElement priceValue;
	

	public WebElement getPriceValue() {
		return priceValue;
	}

	public List<WebElement> getListingProductCount() {
		return listingProductCount;
	}

	public WebElement getDeleteProduct() {
		return deleteProduct;
	}

	public WebElement getCartCheckout() {
		return cartCheckout;
	}

	public WebElement getMobileName() {
		return mobileName;
	}

	public WebElement getIphoneX() {
		return oneplus;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public amazon() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	public void deleteBasedOnName(String name) {
		if (getMobileName().getText().equals(name)) {
			click(getDeleteProduct());
		}
	}
	
	public void deleteBasedOnPrice(String priceValue) {
		WebElement required = null;
		WebElement priceValue2 = getPriceValue();
		List<WebElement> price = priceValue2.findElements(By.tagName("span"));
		for (int i = 0; i < price.size(); i++) {
			if (price.get(i).getText().equals(priceValue)) {
				 required = price.get(i);
				
			}
		
		}
		click(required);
	}
	
}