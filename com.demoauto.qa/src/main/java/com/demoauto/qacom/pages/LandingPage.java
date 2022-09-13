package com.demoauto.qacom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoauto.qa.base.TestBase;

public class LandingPage extends TestBase{

	@FindBy(className="title")
	WebElement titleSpan;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	
	public String getTitleSpanValue() {
		return titleSpan.getText();
	}
}
