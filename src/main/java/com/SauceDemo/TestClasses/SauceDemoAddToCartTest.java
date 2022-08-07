package com.SauceDemo.TestClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.SauceDemoAddToKartPOM;

public class SauceDemoAddToCartTest 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",
		"E:\\Selenium Unzip Files\\New folder (3)\\chromedriver.exe");
						
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
						
		driver.get("https://www.saucedemo.com/");
		
//		login activity
		SauceDemoAddToKartPOM AK=new SauceDemoAddToKartPOM(driver);

		AK.UserName();
		AK.PassWord();
		AK.ClkBtn();
		AK.addToCartClk();
		AK.addToCartBtnClk();
		
//		validation
		
		String ExpectedResult="1";
	    String ActualResult= AK.getAttValue();
	    
	    System.out.println("actualresult   "+  ActualResult);
		
	    if(ActualResult.equals(ExpectedResult))
	    {
	    	System.out.println("tc passes");	  
	    }
	    else
	    {
	    	System.out.println("tc failed");
	    }
	
//	    After execution
	    driver.close();

	
	
	
	}
	
	

}
