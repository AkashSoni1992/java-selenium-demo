package com.demoauto.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
		readProperties();
	}
	
	public void readProperties() {
		prop = new Properties();
		String curDir = System.getProperty("user.dir");
		File file = new File(curDir + "/src/main/java/com/demoauto/qa/config/config.properties");
		try {
			FileInputStream input = new FileInputStream(file);
			prop.load(input);
			//prop.getProperty("url");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "/Users/akash.soni/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
	}
}
