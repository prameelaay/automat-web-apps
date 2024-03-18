package com.qa.pageobjects_Customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.TestBase;

public class CreditPage extends TestBase{
	
	
	@FindBy(xpath = "//a[contains(@ng-click,'useTestCreditPerson')][ancestor::div[contains(@aria-hidden,'false')]]")
	public List<WebElement> tiers;
	
	@FindBy(xpath = "//span[text()=\"Payment submit\"]")
	WebElement contine_credit;
	
	
	
public void credit_Tier() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  //Vertical scroll - down by 150  pixels
	  js.executeScript("window.scrollBy(0,-150)");

	tiers.get(0).click();
	}


       public void toggle() {
	
	driver.findElement(By.xpath("//div[@id=\"form-soft-credit-terms\"]//div[@class=\"bn-switch__toggler\"]")).click();
		
	}
       
       public void navigate_Payment() {
    	   contine_credit.click();
    		
    			
    		}
       
   	public CreditPage() {
		PageFactory.initElements(driver, this);

	}
}


