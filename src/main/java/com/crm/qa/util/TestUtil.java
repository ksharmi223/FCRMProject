package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=20;

	public static long IMPLICIT_WAIT=10;



 public static void HandleModelPopUp() {
	 driver.switchTo().frame("intercom-borderless-frame");
	 Actions action=new Actions(driver);
	 action.moveToElement(driver.findElement(By.xpath("div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
	 driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
	 
 }
 }
 