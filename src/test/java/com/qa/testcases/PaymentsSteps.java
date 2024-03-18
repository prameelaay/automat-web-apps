package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.baseclass.TestBase;
import com.qa.pageobjects_Customer.ContactPage;
import com.qa.pageobjects_Customer.CreditPage;
import com.qa.pageobjects_Customer.HomePage;
import com.qa.pageobjects_Customer.PaymentsPage;
import com.qa.pageobjects_Customer.TradePage;
import com.qa.pageobjects_Customer.Zipcode;

public class PaymentsSteps extends TestBase {
	
	static HomePage homePage;
	static TradePage tradePage;
	static Zipcode zipcode;
	static CreditPage creditPage;
	static ContactPage contactPage;
	static PaymentsPage paymentsPage;

	
	public PaymentsSteps() {
		super();
	}
	
	@Test
	public void submit_Payment() throws InterruptedException {
		
		PaymentsSteps paymentsSteps = new PaymentsSteps();
		paymentsSteps.initialize1();
		
		homePage = new HomePage();
		boolean image = homePage.Image_Displayed();
		Assert.assertEquals(image, image, "Image matched");
		homePage.click_On_View_Inventory();
		homePage.click_On_BuyNow_Button();
		zipcode = new Zipcode();
		zipcode.close_Window();
		Thread.sleep(2000);
		zipcode.Enter_zipcode();
		tradePage = new TradePage();
		tradePage.Enter_Trade("2023");
		tradePage.Select_Dropddown();
		tradePage.click_credit();
		creditPage = new CreditPage();
		Thread.sleep(2000);
		creditPage.credit_Tier();
		creditPage.navigate_Payment();
		contactPage = new ContactPage();
		Thread.sleep(2000);
		//contactPage.click_On_Contact();
		//contactPage.add_Contact("prameela", "devi", "2334678765", "30060");
		//contactPage.click_On_Save$Continue();
		paymentsPage = new PaymentsPage();
		Thread.sleep(2000);

		paymentsPage.click_DownPayment("2000");
		paymentsPage.click_Terms();
		
		
		
		
	}
}
