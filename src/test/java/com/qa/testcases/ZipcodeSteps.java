package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.baseclass.TestBase;
import com.qa.pageobjects_Customer.HomePage;
import com.qa.pageobjects_Customer.TradePage;
import com.qa.pageobjects_Customer.Zipcode;

public class ZipcodeSteps extends TestBase {

	HomePageSteps homePageSteps;

	public ZipcodeSteps() {
		super();
	}

	@Test
	public void enterZip() throws Exception {
//		homePageSteps = new HomePageSteps();
//		homePageSteps.Launch_Buynow();
		Zipcode zipcode = new Zipcode();
		zipcode.close_Window();
		 zipcode.Enter_zipcode();

	}
}
