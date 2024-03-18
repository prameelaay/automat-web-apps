package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.baseclass.TestBase;
import com.qa.pageobjects_Customer.HomePage;
import com.qa.pageobjects_Customer.TradePage;
import com.qa.pageobjects_Customer.Zipcode;

public class TradeSteps extends TestBase {

	static HomePage homePage;
	static TradePage tradePage;
	static Zipcode zipcode;

	public TradeSteps() {
		super();
	}

	@Test
	public void enters_Trade() throws Exception {
		TradeSteps tradeSteps = new TradeSteps();
		tradeSteps.initialize1();

		homePage = new HomePage();
		boolean image = homePage.Image_Displayed();
		Assert.assertEquals(image, image, "Image matched");
		homePage.click_On_View_Inventory();
		homePage.click_On_BuyNow_Button();
		Zipcode zipcode = new Zipcode();
		zipcode.close_Window();
		Thread.sleep(2000);
		zipcode.Enter_zipcode();
//		zipcodeSteps = new ZipcodeSteps();
//		zipcodeSteps.enterZip();
		tradePage = new TradePage();
		tradePage.Enter_Trade("2023");
		tradePage.Select_Dropddown();
		tradePage.click_credit();

	}

}
