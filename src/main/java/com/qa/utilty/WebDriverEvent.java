package com.qa.utilty;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.events.WebDriverListener;

import com.qa.baseclass.TestBase;



public class WebDriverEvent extends TestBase implements WebDriverListener {
	
	public void beforeAnyWebDriverCall(WebDriver driver, Method method, Object[] args) {}

	public void afterAnyWebDriverCall(
	      WebDriver driver, Method method, Object[] args, Object result) {}

	public void beforeGet(WebDriver driver, String url) {
		System.out.println("Before navigating to: '" + url + "'");
	}

	public void afterGet(WebDriver driver, String url) {
		System.out.println("Navigated to: '" + url);
	}
	
	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		System.out.println("Exception occured: " +e);
		try {
			TestUtility.takeScreenshotAtEndOfTest();
		} catch (IOException e1) {
			e.printStackTrace();
		}
		
	}
	

	public void beforeGetCurrentUrl(WebDriver driver) {}

	public void afterGetCurrentUrl(String result, WebDriver driver) {}

	public void beforeGetTitle(WebDriver driver) {}

	public void afterGetTitle(WebDriver driver, String result) {}

	public void beforeFindElement(WebDriver driver, By locator) {
		System.out.println("Trying to find Element By : " +locator.toString() );
	}

	public void afterFindElement(WebDriver driver, By locator, WebElement result) {
		System.out.println("Found element by: " + locator.toString());
	}

	public void beforeFindElements(WebDriver driver, By locator) {}

	public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {}

	public void beforeGetPageSource(WebDriver driver) {}

	public void afterGetPageSource(WebDriver driver, String result) {}

	public void beforeClose(WebDriver driver) {}

	public void afterClose(WebDriver driver) {}

	public void beforeQuit(WebDriver driver) {}

	public void afterQuit(WebDriver driver) {}

	public void beforeGetWindowHandles(WebDriver driver) {}

	public void afterGetWindowHandles(WebDriver driver, Set<String> result) {}

	public void beforeGetWindowHandle(WebDriver driver) {}

	public void afterGetWindowHandle(WebDriver driver, String result) {}

	public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {}

	public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {}

	public void beforeExecuteAsyncScript(WebDriver driver, String script, Object[] args) {}

	public void afterExecuteAsyncScript(
	      WebDriver driver, String script, Object[] args, Object result) {}

	public void beforePerform(WebDriver driver, Collection<Sequence> actions) {}

	public void afterPerform(WebDriver driver, Collection<Sequence> actions) {}

	public void beforeResetInputState(WebDriver driver) {}

	public void afterResetInputState(WebDriver driver) {}

	  // WebElement

	public void beforeAnyWebElementCall(WebElement element, Method method, Object[] args) {}

	public void afterAnyWebElementCall(
	      WebElement element, Method method, Object[] args, Object result) {}

	public void beforeClick(WebElement element) {
		System.out.println("Trying to click on: " + element.toString());

	}

	public void afterClick(WebElement element) {
		System.out.println("Clicked on: " + element.toString());

	}

	public void beforeSubmit(WebElement element) {}

	public void afterSubmit(WebElement element) {}

	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {}

	public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		System.out.println("Entered value as: '" + keysToSend );
	}

	public void beforeClear(WebElement element) {}

	public void afterClear(WebElement element) {}

	public void beforeGetTagName(WebElement element) {}

	public void afterGetTagName(WebElement element, String result) {}

	public void beforeGetAttribute(WebElement element, String name) {}

	public void afterGetAttribute(WebElement element, String name, String result) {}

	public void beforeIsSelected(WebElement element) {}

	public void afterIsSelected(WebElement element, boolean result) {}

	public void beforeIsEnabled(WebElement element) {}

	public void afterIsEnabled(WebElement element, boolean result) {}

	public void beforeGetText(WebElement element) {}

	public void afterGetText(WebElement element, String result) {}

	public void beforeFindElement(WebElement element, By locator) {}

	public void afterFindElement(WebElement element, By locator, WebElement result) {}

	public void beforeFindElements(WebElement element, By locator) {}

	public void afterFindElements(WebElement element, By locator, List<WebElement> result) {}

	public void beforeIsDisplayed(WebElement element) {}

	public void afterIsDisplayed(WebElement element, boolean result) {}

	public void beforeGetLocation(WebElement element) {}

	public void afterGetLocation(WebElement element, Point result) {}

	public void beforeGetSize(WebElement element) {}

	public void afterGetSize(WebElement element, Dimension result) {}

	public void beforeGetCssValue(WebElement element, String propertyName) {}

	public void afterGetCssValue(WebElement element, String propertyName, String result) {}

	  // Navigation

	public void beforeAnyNavigationCall(
	      WebDriver.Navigation navigation, Method method, Object[] args) {}

	public void afterAnyNavigationCall(
	      WebDriver.Navigation navigation, Method method, Object[] args, Object result) {}

	public void beforeTo(WebDriver.Navigation navigation, String url) {
		
	}

	public void afterTo(WebDriver.Navigation navigation, String url) {}

	public void beforeTo(WebDriver.Navigation navigation, URL url) {

	}

	public void afterTo(WebDriver.Navigation navigation, URL url) {}

	public void beforeBack(WebDriver.Navigation navigation) {}

	public void afterBack(WebDriver.Navigation navigation) {}

	public void beforeForward(WebDriver.Navigation navigation) {
		System.out.println("Navigating back to previous page");

	}

	public void afterForward(WebDriver.Navigation navigation) {
		System.out.println("Navigating forward to next page");

	}

	public void beforeRefresh(WebDriver.Navigation navigation) {}

	public void afterRefresh(WebDriver.Navigation navigation) {}

	  // Alert

	public void beforeAnyAlertCall(Alert alert, Method method, Object[] args) {}

	public void afterAnyAlertCall(Alert alert, Method method, Object[] args, Object result) {}

	public void beforeAccept(Alert alert) {}

	public void afterAccept(Alert alert) {}

	public void beforeDismiss(Alert alert) {}

	public void afterDismiss(Alert alert) {}

	public void beforeGetText(Alert alert) {}

	public void afterGetText(Alert alert, String result) {}

	public void beforeSendKeys(Alert alert, String text) {}

	public void afterSendKeys(Alert alert, String text) {}



}
