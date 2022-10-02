package com.intigral.SubsciptionPackages;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class SubscriptionTest{
	
	ChromeDriver driver = new ChromeDriver();
	
	String typeLite,typeClassic,typePremium,currencyType;

	double priceLite, priceClassic, pricePremium;
	
	
	@BeforeMethod
	public void setup() {
		
		//Initiating the web driver 
		//NOTE: Webdriver path should be changed to .exe location if running on Windows machine
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	@Test(priority=1)
	public void verifyTestSaudiArabia() {
		
		//Calling the url here because there is no KSA country specified inside https://subscribe.stctv.com
		driver.get("https://subscribe.stctv.com/sa-en");
		String typeLite = driver.findElement(By.xpath("//h1[normalize-space()='Lite']")).getText();
		Assert.assertEquals(typeLite, "LITE");
		
		String typeClassic = driver.findElement(By.xpath("//h1[normalize-space()='Classic']")).getText();
		Assert.assertEquals(typeClassic, "CLASSIC");
		
		String typePremium = driver.findElement(By.xpath("//h1[normalize-space()='Premium']")).getText();
		Assert.assertEquals(typePremium, "PREMIUM");
		
		String priceLite = driver.findElement(By.xpath("//span[normalize-space()='15']")).getText();
		Assert.assertEquals(priceLite, "15");
		
		String priceClassic = driver.findElement(By.xpath("//span[normalize-space()='25']")).getText();
		Assert.assertEquals(priceClassic, "25");
		
	
		String pricePremium = driver.findElement(By.xpath("//span[normalize-space()='60']")).getText();
		Assert.assertEquals(pricePremium, "60");
		
		String currencyType = driver.findElement(By.xpath("//div[@class='packages packages Light']//span[@class='currency'][normalize-space()='SAR']")).getText();
		Assert.assertEquals(currencyType, "SAR");
		
	}
	
	@Test(priority=2)	
	public void verifyTestBahrain() {
		driver.get("https://subscribe.stctv.com/bh-en");
		String typeLite = driver.findElement(By.cssSelector("div[class='packages packages Light'] h1")).getText();
		Assert.assertEquals(typeLite, "LITE");
		
		String typeClassic = driver.findElement(By.cssSelector("div[class='packages packages Classic'] h1")).getText();
		Assert.assertEquals(typeClassic, "CLASSIC");
		
		String typePremium = driver.findElement(By.cssSelector("div[class='packages packages Premium'] h1")).getText();
		Assert.assertEquals(typePremium, "PREMIUM");
		
		String priceLite = driver.findElement(By.cssSelector("div[class='packages packages Light'] span[class='amount']")).getAttribute("textContent");
		Assert.assertEquals(priceLite, "2");
		
		String priceClassic = driver.findElement(By.cssSelector("div[class='packages packages Classic'] span[class='amount']")).getText();
		Assert.assertEquals(priceClassic, "3");
		
	
		String pricePremium = driver.findElement(By.cssSelector("div[class='packages packages Premium'] span[class='amount']")).getText();
		Assert.assertEquals(pricePremium, "6");
		
		String currencyType = driver.findElement(By.xpath("//div[@class='packages packages Light']//span[@class='currency'][normalize-space()='BHD']")).getText();
		Assert.assertEquals(currencyType, "BHD");
		
}
	
	@Test(priority=3)
	public void verifyTestKuwait() {
		driver.get("https://subscribe.stctv.com/kw-en");
		String typeLite = driver.findElement(By.xpath("//h1[normalize-space()='Lite']")).getText();
		Assert.assertEquals(typeLite, "LITE");
		
		String typeClassic = driver.findElement(By.xpath("//h1[normalize-space()='Classic']")).getText();
		Assert.assertEquals(typeClassic, "CLASSIC");
		
		String typePremium = driver.findElement(By.xpath("//h1[normalize-space()='Premium']")).getText();
		Assert.assertEquals(typePremium, "PREMIUM");
		
		String priceLite = driver.findElement(By.xpath("//span[normalize-space()='1.2']")).getText();
		Assert.assertEquals(priceLite, "1.2");
		
		String priceClassic = driver.findElement(By.xpath("//span[normalize-space()='2.5']")).getText();
		Assert.assertEquals(priceClassic, "2.5");
		
	
		String pricePremium = driver.findElement(By.xpath("//span[normalize-space()='4.8']")).getText();
		Assert.assertEquals(pricePremium, "4.8");
		
		String currencyType = driver.findElement(By.xpath("//div[@class='packages packages Light']//span[@class='currency'][normalize-space()='KWD']")).getText();
		Assert.assertEquals(currencyType, "KWD");
		
		
		
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}


}
