package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAssertionGetTitle1 {
	WebDriver driver;
	
	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubhakar D\\eclipse-workspace\\Locators in selenium\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String WebURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(WebURL);
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("TestCase successful...!");
		else
			System.out.println("TestCase Senorio failed!");
		driver.quit();
	}

}
