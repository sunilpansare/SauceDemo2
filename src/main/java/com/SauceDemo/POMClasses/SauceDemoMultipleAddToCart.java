package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SauceDemo.UtilityClasses.SauceUtilityClass;

public class SauceDemoMultipleAddToCart extends SauceUtilityClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> AddToCartBtn;
	
	public void addToCartBtn()
	{
//			for(int i=0; i<AddToCartBtn.size(); i++)     //For loop
//		{
//			AddToCartBtn.get(i).click();
//		}	
		
		for(WebElement i:AddToCartBtn)               //for each loop
		{
			i.click();
			System.out.println("button clicked");
		}
		
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement AddToCartButton;
	public String addToCartBtnText()
	{
		return AddToCartButton.getText();
		
	}
	
	
	public SauceDemoMultipleAddToCart (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
