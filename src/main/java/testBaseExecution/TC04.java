package testBaseExecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoMultipleAddToCart;

import testBaseClass.TestBaseClass;

public class TC04 extends TestBaseClass 
{    
	
	@Test
	public void method4() 
	{

		SauceDemoMultipleAddToCart Addtocart=new SauceDemoMultipleAddToCart(driver);
		Addtocart.addToCartBtn();
		
		String ExpectedResult="6";
		
		String ActualResult  =Addtocart. addToCartBtnText();
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("We are logged in successfuly ");
			System.out.println("Tc passed");
		}
		else
		{
			System.out.println("TC failed");
		}
		
		
	}

}
