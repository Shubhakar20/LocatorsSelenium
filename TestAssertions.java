package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAssertions {
	WebDriver driver;
	
	@Test
	public void FireFoxBrowser() {
		String WebURL = "http://automationpractice.com/index.php";
		String expectedTitle = "My Store45";
		String actualTitle = "My Store45";
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\Shubhakar D\\eclipse-workspace\\Locators in selenium\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(WebURL);
		driver.manage().window().maximize();
		
		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("TestCase successful...!");
		else
			System.out.println("TestCase Senorio failed!");
		driver.quit();
	}

}
