package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseURL = "https://www.mydevsystems.com/dev/gap_v2/index.php/login/login";
	public String baseUsername = "INVadmin";
	public String basePassword = "INVadmin";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
	    try {
	        // Set up ChromeDriver using WebDriverManager with specific Chrome version
	        WebDriverManager.chromedriver().browserVersion("116.0.5845.188").setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-debugging-port=9222");
	        driver = new ChromeDriver(options);
	    } catch (Exception e) {
	        System.out.println("Error occurred during WebDriver setup: " + e.getMessage());
	    }
	}


	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
