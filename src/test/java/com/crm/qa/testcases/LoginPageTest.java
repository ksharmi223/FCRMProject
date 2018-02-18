package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	
	public LoginPageTest() {
	super();// to call test base class constructor
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();	
	}
	@Test( priority=1)
	public void loginPageTitleTest(){
		String title=loginpage.validateTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		}
	
	@Test(priority=2)
	public void loginPagelogTest() {
		boolean logo = loginpage.validateLogo();
		Assert.assertTrue(logo);
		}
	
	@Test(priority= 3)
	public void signIn() {
		homePage=loginpage.logIn(prop.getProperty("username"),prop.getProperty("password"));
		
		}
	
	
	
	
	
	@AfterMethod
	public void  tearDown() {
		//driver.quit();
		
	}
}
