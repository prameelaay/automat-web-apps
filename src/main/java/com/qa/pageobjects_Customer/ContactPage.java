package com.qa.pageobjects_Customer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclass.TestBase;

public class ContactPage extends TestBase{
	
	@FindBy(xpath = "//button[@class=\"bn-leftnav__car__row__btn ng-binding ng-scope\"]")
	WebElement contact;
	
	@FindBy(xpath = "//input[@name=\"first_name\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name=\"last_name\"]")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@name=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath = "//input[@aria-label=\"ZIP Code\"]")
	WebElement zipcode;
	
	@FindBy(xpath = "//button[@class=\"bn-btn --w100 --primary --inline  \"]")
	WebElement save$continue;
	
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void click_On_Contact() {
		contact.click();
        
		
	}
	
	public void add_Contact(String name, String lname, String phon, String zip ) {
		firstname.sendKeys(name);
		lastname.sendKeys(lname);
		phone.sendKeys(phon);
		List<WebElement> mail = driver.findElements(By.xpath("//input[@name=\"email\"]"));
		mail.get(1).sendKeys("asde@dd.com");
		zipcode.clear();
		zipcode.sendKeys(zip);
	}
		
		public void click_On_Save$Continue() {
			save$continue.click();
			
		}		
	}


