package com.SauceDemo.POMClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SauceDemoLoginPOM 
{
	WebDriver driver;
	
	@FindBy(xpath=("//input[@id='user-name']"))
	WebElement UserName;
	public void UserName()
	{
	   UserName.sendKeys("standard_user");
		System.out.println("UN entered");
	}
		
	@FindBy(xpath=("//input[@id='password']"))
	WebElement PassWord;
	public void PassWord()
	{
		PassWord.sendKeys("secret_sauce");
		System.out.println("PW entered");
	}	
			
	@FindBy(xpath=("//input[@id='login-button']"))
	WebElement ClkBtn;
	public void ClkBtn()
	{
		ClkBtn.click();
		System.out.println("lick on button");
	}	
		
	public SauceDemoLoginPOM(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
