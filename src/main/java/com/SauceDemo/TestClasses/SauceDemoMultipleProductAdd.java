package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.SauceDemo.POMClasses.SauceDemoLoginPOM;
import com.SauceDemo.POMClasses.SauceDemoMultipleAddToCart;

public class SauceDemoMultipleProductAdd 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		"E:\\Selenium Unzip Files\\New folder (3)\\chromedriver.exe");
								
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
								
		driver.get("https://www.saucedemo.com/");
		
		SauceDemoLoginPOM li=new SauceDemoLoginPOM(driver);
		li.UserName();
		li.PassWord();
		li.ClkBtn();
		
		SauceDemoMultipleAddToCart Addtocart=new SauceDemoMultipleAddToCart(driver);
		
		Addtocart.addToCartBtn();
		
		
//		*** validation ***
		
		String ExpectedResult="6";
		
		String ActualResult  =Addtocart. addToCartBtnText();
		
//		if(ActualResult.equals(ExpectedResult))
//		{
//			System.out.println("We are logged in successfuly ");
//			System.out.println("Tc passed");
//		}
//		else
//		{
//			System.out.println("TC failed");
//		}
		
		Assert.assertEquals(ActualResult,ExpectedResult,"TC failed");
		
		
		
		
		
//		browser close activity
		
		driver.quit();
		System.out.println("We sclosed browser");
		
			
		
		
	}
}

	
	
	
	
	
	
	
