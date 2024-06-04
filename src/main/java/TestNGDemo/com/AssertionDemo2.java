package TestNGDemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo2 {
	
	
	//Testng-- Assertions--->Validations
	//Hard Assertions----
	static WebDriver odriver;
		
		@BeforeMethod
		void launchBrowser()
		{
			WebDriverManager.chromedriver().setup();
			
			odriver=new ChromeDriver();
			
		
			odriver.manage().window().maximize();
			
			odriver.manage().deleteAllCookies();
			
			//2.Open the App
			odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			
		}
		
		@Test
		void titleOfThePage()
		{
			
			
			boolean actualTilte=odriver.getTitle().equalsIgnoreCase("Orang");
			Assert.assertTrue(actualTilte);
			System.out.println("hello");
			
			
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
