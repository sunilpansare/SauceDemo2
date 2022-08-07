package testBaseClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.SauceDemoLoginPOM;
import com.SauceDemo.TestClasses.SauceDemoLogOutTest;

public class TestBaseClass 
{	
	  protected WebDriver driver;
	  
	 Logger log= Logger.getLogger("SauceDmo.COM");
	
	  
	  
	@Parameters("BrowserName")
	@BeforeMethod
	public void beforeMethod1(String BrowserName) throws IOException
	{
		if(BrowserName.equals("chrome"))
		{System.setProperty("webdriver.chrome.driver",
		"E:\\Selenium Unzip Files\\New folder (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
			"E:\\Selenium Unzip Files\\New folder (3)\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					
		log.info("implicitly wait applied");
		driver.get("https://www.saucedemo.com/");				
		SauceDemoLogOutTest.takeScreenshot(driver);
		log.info("Screen shot taken");
		SauceDemoLoginPOM login=new SauceDemoLoginPOM(driver);
		login.UserName();
		log.info("un Entered");
		login.PassWord();
		log.info("PW Entered");
		login.ClkBtn();
		log.info("clk on buttom");
		SauceDemoLogOutTest.takeScreenshot(driver);
						
	}
	
	@AfterMethod()
	public void afterMethod()
	{
//		driver.close();
		log.info("Browser Closed");
	
	}

}
