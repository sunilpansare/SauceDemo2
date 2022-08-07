package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoLoginPOM;

public class SauceDemoLoginTest
{
	@Test
	public  void logIn() 
	{
//		log in activity
		System.setProperty("webdriver.chrome.driver",
		"E:\\Selenium Unzip Files\\New folder (3)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
//		in maven implicitly wait need to use updated method need to use
		driver.get("https://www.saucedemo.com/");
		SauceDemoLoginPOM SaucDemoL=new SauceDemoLoginPOM (driver);
		  
		SaucDemoL.UserName();
		SaucDemoL.PassWord();
		SaucDemoL.ClkBtn();
		
//		*** validation ***
		
		String ExpectedResult="Swag Labs";
		
		String ActualResult=driver.getTitle();
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("We are logged in successfuly ");
			System.out.println("Tc passed");
		}
		else
		{
			System.out.println("TC failed");
		}
		
//		browser close activity
		
		driver.close();
		System.out.println("We sclosed browser");
		
		
	}
	
}
