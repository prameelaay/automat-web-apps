package com.qa.pageobjects_Customer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.baseclass.TestBase;

public class TradePage extends TestBase {

	public TradePage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//span[text()='Cridit submit']")
	WebElement creditbutton;


	public void Enter_Trade(String year) throws InterruptedException {
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("//div[@id='bn-step-q-trade']//input[@name='vehicle']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(d));
		d.sendKeys(year);

	}

	public void Select_Dropddown() {
		List<WebElement> drop = driver.findElements(By.xpath("//a[@ng-click=\"onSelectVehicle(vehicle)\"]"));
		drop.get(3).click();
		//driver.findElement(By.xpath("//button[@class=\"bn-btn --primary  \"]")).click();
	}
	
	public void click_credit() {
		creditbutton.click();
		
	}

}
