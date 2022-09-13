package com.demoauto.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoauto.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id="user-name")
	WebElement usernameInput;
	
	@FindBy(id="password")
	WebElement passwordInput;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void inputUserName(String name) {
		usernameInput.sendKeys(name);
	}
	
	public void inputPassword(String pass) {
		passwordInput.sendKeys(pass);
	}
	
	public LandingPage clickLoginBtn() {
		loginBtn.click();
		return new LandingPage();
	}
}
