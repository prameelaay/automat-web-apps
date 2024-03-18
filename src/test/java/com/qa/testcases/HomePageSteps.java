package com.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclass.TestBase;
import com.qa.pageobjects_Customer.HomePage;
import com.qa.pageobjects_Customer.Zipcode;



public class HomePageSteps extends TestBase{
	
	static HomePage homePage;
	
	public HomePageSteps() {
		super();
	}
	
	
	@Test
	public void Launch_Buynow() throws Exception{
		
		HomePageSteps homePageSteps = new HomePageSteps();
		homePageSteps.initialize1();
		
		homePage = new HomePage();
		boolean image = homePage.Image_Displayed();
		Assert.assertEquals(image, image,"Image matched");
        homePage.click_On_View_Inventory();
		 homePage.click_On_BuyNow_Button();
		
		Thread.sleep(1000);
	}
	
	
	
}
