package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AmazonPOM extends FunctionalLibrary {

	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtSearch;

	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	private WebElement btnSearch;

	@FindBy(xpath = "(//div[@class='a-row a-spacing-none'])[1]")
	private WebElement iphoneX;

	@FindBy(xpath = "(//span[@class='a-button-inner'])[10]")
	private WebElement BtnAddToCart;

	@FindBy(id="hlb-view-cart-announce")
	private WebElement ClkcartCheckout;

	@FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
	private WebElement mobileName;

	@FindBy(xpath = "//span[@class='a-size-small sc-action-delete']")
	private WebElement deleteProduct;

	@FindBy(xpath="(//span[@class='sc-product-title'])[1]")
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

	public WebElement getBtnCartCheckout() {
		return ClkcartCheckout;
	}

	public WebElement getMobileName() {
		return mobileName;
	}

	public WebElement getIphoneX() {
		return iphoneX;
	}

	public WebElement getBtnAddToCart() {
		return BtnAddToCart;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public AmazonPOM() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	public void DeleteBasedOnPrice(String name) {
		if (getMobileName().getText().equals(name)) {
			click(getDeleteProduct());
		}
	}

	public void InputTxtValue(WebElement element, String name) {
		element.sendKeys(name);

	}

	public void clickopt(WebElement element) {
		element.click();

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

	public void GetWindowHandel() {
		clickopt(getIphoneX());

		String ParentWind = driver.getWindowHandle();
		String Title = driver.getTitle();
		System.out.println("Parent Window ID:" + ParentWind);
		Set<String> childWind = driver.getWindowHandles();

		for (String CurrentWind : childWind) {
			if (!ParentWind.equals(CurrentWind)) {
				System.out.println("Chlid Window ID:" + childWind);
				driver.switchTo().window(CurrentWind);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement element = getBtnAddToCart();
				clickopt(element);
				System.out.println(element.getText());
				
			}
			
		}
	
	}
}