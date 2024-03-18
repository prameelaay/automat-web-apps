package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.baseclass.TestBase;
import com.qa.pageobjects_Customer.ContactPage;
import com.qa.pageobjects_Customer.HomePage;
import com.qa.pageobjects_Customer.Zipcode;
public class ContactSteps extends TestBase {
	
	static HomePage homePage;
	static ContactPage  contactPage;
	static Zipcode zipcode;
	
	
	public ContactSteps() {
		super();
	}
	
	
	@Test
	public void submit_Contact() throws Exception {
		
		ContactSteps contactSteps = new ContactSteps();
		contactSteps.initialize1();
		
		homePage = new HomePage();
        homePage.click_On_View_Inventory();
		 homePage.click_On_BuyNow_Button();
		 Thread.sleep(1000);
		 zipcode = new Zipcode();
		 zipcode.close_Window();
		 contactPage = new ContactPage();
		 contactPage.click_On_Contact();
		 contactPage.add_Contact("prameela", "devi", "8765434567", "30060");
		 contactPage.click_On_Save$Continue();
		 
		
		
		
		
	}

}
