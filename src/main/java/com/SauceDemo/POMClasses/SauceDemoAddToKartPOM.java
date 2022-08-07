package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoAddToKartPOM 
{
	WebDriver driver;
	
	@FindBy(xpath=("//input[@id='user-name']"))
	WebElement UserName;
	public void UserName()
	{
	   UserName.sendKeys("standard_user");
		
	}
		
	@FindBy(xpath=("//input[@id='password']"))
	WebElement PassWord;
	public void PassWord()
	{
		PassWord.sendKeys("secret_sauce");
		
	}	
			
	@FindBy(xpath=("//input[@id='login-button']"))
	WebElement ClkBtn;
	public void ClkBtn()
	{
		ClkBtn.click();
		
	}		
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement AddToCartClk;
	
	public void addToCartClk()
	{
		AddToCartClk.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement AddToCartBtnClk;
	
	public void addToCartBtnClk()
	{
		AddToCartBtnClk.click();
	}
	
	public String getAttValue()
	{
	 AddToCartBtnClk.getAttribute("shopping_cart_badge");
	 return "ag";
	}
		
	public SauceDemoAddToKartPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		

}
