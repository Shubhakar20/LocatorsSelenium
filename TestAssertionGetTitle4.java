package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAssertionGetTitle4 {
	WebDriver driver;
	
	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubhakar D\\eclipse-workspace\\Locators in selenium\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String WebURL = "http://www.half.ebay.com";
		driver.get(WebURL);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("TestCase successful...!");
		else
			System.out.println("TestCase Senorio failed!");
		driver.quit();
	}

}