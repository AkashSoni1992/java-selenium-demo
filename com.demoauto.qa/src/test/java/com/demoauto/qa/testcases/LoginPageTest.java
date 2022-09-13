package com.demoauto.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoauto.qa.base.TestBase;
import com.demoauto.qacom.pages.LandingPage;
import com.demoauto.qacom.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	LandingPage landingPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void loginPageTitleTest() throws InterruptedException {
		Thread.sleep(100);
		String title = loginPage.getLoginPageTitle();
		
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test
	public void loginPageLoginScenarioTest() throws InterruptedException {
		
		loginPage.inputUserName("standard_user");
		loginPage.inputPassword("secret_sauce");
		Thread.sleep(1000);
		landingPage = loginPage.clickLoginBtn();
		Thread.sleep(1000);
		
		String title = landingPage.getTitleSpanValue();
		
		Assert.assertEquals(title, "PRODUCTS");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
