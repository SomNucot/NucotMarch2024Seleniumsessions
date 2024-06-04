package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationDemo {
	
	
//Testng-- Assertions--->Validations
static WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		
		odriver=new FirefoxDriver();
		
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	
	@Test
	void titleOfThePage()
	{
		
		
		String actualTilte=odriver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualTilte, expectedTitle);

	}
	
	@Test
	void currentUrlOfThePage()
	{
		
		
		String actualUrl=odriver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(actualUrl, expectedUrl);
		

	}
	
	
	

	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
