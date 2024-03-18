package com.qa.pageobjects_Customer;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.baseclass.TestBase;

public class Zipcode extends TestBase {

	@FindBy(xpath = "//button[@data-original-title='Close popup']//i")
	WebElement close;

	@FindBy(xpath = "//button[@class=\"bn-btn --w100 --primary \"]")
	WebElement closebutton;

	public Zipcode() {
		PageFactory.initElements(driver, this);

	}

	public void Enter_zipcode() throws InterruptedException {

		List<WebElement> zip = driver.findElements(By.xpath("//div[@id='bn-step-q-zip']//input[@name='zip']"));
		System.out.println("Found zip code fields: " + zip.size());
		WebElement zipEle = zip.get(0);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(zipEle)); 
		zipEle.clear();
		zipEle.sendKeys("30060");
		closebutton.click();

	}

	public void close_Window() throws InterruptedException {
		WebElement frame1 = driver.findElement(By.xpath("//div[@id=\"cn_chat_container\"]//iframe"));
		driver.switchTo().frame(frame1);
		System.out.println("Switch to frame1");
		Thread.sleep(4000);
		close.click();
		//closebutton.click();

	}

}