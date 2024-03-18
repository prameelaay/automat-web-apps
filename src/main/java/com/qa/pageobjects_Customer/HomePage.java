package com.qa.pageobjects_Customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[@class=\"inventory-link\"]")
	WebElement Viewinventory;

	@FindBy(xpath = "//img[@class=\"body-bg\"]")
	WebElement image;

	public void click_On_View_Inventory() {
		Viewinventory.click();
	}

	public void click_On_BuyNow_Button() {
		
		List<WebElement> buynow = driver.findElements(By.xpath("//span[text()=\"Buy Now!!\"]"));
		buynow.get(0).click();
	}

	public boolean Image_Displayed() {
		return image.isDisplayed();

	}

	public HomePage() {
		PageFactory.initElements(driver, this);

	}
}
