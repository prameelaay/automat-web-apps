package com.qa.pageobjects_Customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.TestBase;

public class PaymentsPage extends TestBase{

	@FindBy(xpath="//input[@ng-change=\"checkDownPayment()\"]")
	WebElement down_payment;
	
	@FindBy(xpath="//div[@class=\"bn-sel-btns\"]//button[@class=\"bn-sel-btns__btn bn-select-button --term\"]")
	List<WebElement> terms;
	
	public void click_DownPayment(String che) {
		down_payment.clear();
		down_payment.sendKeys(che);
	}
	
	public void click_Terms() {
		terms.get(1).click();
	}
	
	public PaymentsPage() {
		PageFactory.initElements(driver, this);
	}
}
