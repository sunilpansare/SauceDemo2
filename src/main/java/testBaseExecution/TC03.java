package testBaseExecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.SauceDemoAddToKartPOM;

import testBaseClass.TestBaseClass;

public class TC03 extends TestBaseClass 
{    
	@Test
	public void method3() 
	{
		SauceDemoAddToKartPOM AK=new SauceDemoAddToKartPOM(driver);
		String ExpectedResult="1";
	    String ActualResult= AK.getAttValue();
		AK.addToCartClk();
		AK.addToCartBtnClk();
		
	    System.out.println("actualresult   "+  ActualResult);
		
	    if(ActualResult.equals(ActualResult))
	    {
	    	System.out.println("tc passes");	  
	    }
	    else
	    {
	    	System.out.println("tc failed");
	    }
		
	}

}
