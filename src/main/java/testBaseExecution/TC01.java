package testBaseExecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoAddToKartPOM;

import testBaseClass.TestBaseClass;

public class TC01 extends TestBaseClass     
{
	
	@Test
	public void method1() 
	{
		

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
		
	}

}
