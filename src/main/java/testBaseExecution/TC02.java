package testBaseExecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoLogOutPOM;
import com.SauceDemo.TestClasses.SauceDemoLogOutTest;

import testBaseClass.TestBaseClass;

public class TC02  extends TestBaseClass 
   
{
	
	@Test
	public void method2() throws IOException 
	{
		SauceDemoLogOutPOM lo=new SauceDemoLogOutPOM(driver);
		lo.logoutManu();
		lo.logoutBtn();
		SauceDemoLogOutTest.takeScreenshot(driver);
		
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
