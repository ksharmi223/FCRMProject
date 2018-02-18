package com.crm.qa.pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	// Page Factory
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath="//button[contains[text(),'Sign Up')]")
	WebElement signupbtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement logo;
	
	@FindBy(xpath="//div[@id=\"navbar-collapse\"]/ul")
	WebElement toplinks;
	

	@FindBy(xpath="//ul[contains(@class,'list-unstyled']")
	WebElement footer;
	
	//initializing
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);// "this" for current class object
		
	}
	//Action
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
		
	}
	
	public HomePage logIn(String usernm,String passwd) {
	username.sendKeys(usernm);	
	password.sendKeys(passwd);
	//TestUtil.HandleModelPopUp();
	//loginbtn.click();
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].click();",loginbtn);
	return new HomePage();
	}
	
	
}
