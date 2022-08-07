package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.SauceDemoLogOutPOM;
import com.SauceDemo.POMClasses.SauceDemoLoginPOM;
import com.SauceDemo.UtilityClasses.SauceUtilityClass;

public class SauceDemoLogOutTest extends SauceUtilityClass 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
		"E:\\Selenium Unzip Files\\New folder (3)\\chromedriver.exe");
								
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
								
		driver.get("https://www.saucedemo.com/");
		
		SauceDemoLogOutTest.takeScreenshot(driver);
		
		SauceDemoLoginPOM li=new SauceDemoLoginPOM(driver);
		li.UserName();
		li.PassWord();
		li.ClkBtn();
		SauceDemoLogOutTest.takeScreenshot(driver);
		
		
		SauceDemoLogOutPOM lo=new SauceDemoLogOutPOM(driver);
		lo.logoutManu();
		lo.logoutBtn();
		SauceDemoLogOutTest.takeScreenshot(driver);
		
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
