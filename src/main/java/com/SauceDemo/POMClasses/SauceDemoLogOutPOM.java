package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLogOutPOM
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement LogoutManu;
	public void logoutManu()
	{
		LogoutManu.click();
	}

	@FindBy(xpath="//a[text()='Logout']")
	WebElement LogoutBtn;
	public void logoutBtn()
	{
		LogoutBtn.click();
	}
	
	public SauceDemoLogOutPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}                                           
	

	
	
	
}
