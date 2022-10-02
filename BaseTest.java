package com.utility.app;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//
//import org.testng.annotations.BeforeSuite;
//
//
//public class BaseTest {
//protected WebDriver driver; 
//	
//
//	@BeforeSuite
//	public void setup() {
//		
//		//While running on windows, we need to change the chromedriver path
//		System.setProperty("webdriver.chrome.driver", "chromedriver");
//		setDriver(new ChromeDriver());
//		
//		getDriver().manage().window().maximize();
//		getDriver().manage().deleteAllCookies();
//		
//		
//		
//		getDriver().get("https://subscribe.stctv.com");
//			
//	}
//	
//	@AfterMethod
//	public void tearDown() {
//		getDriver().quit();
//	}
//
//	public WebDriver getDriver() {
//		return driver;
//	}
//
//	public void setDriver(WebDriver driver) {
//		this.driver = driver;
//	}
//
//}
