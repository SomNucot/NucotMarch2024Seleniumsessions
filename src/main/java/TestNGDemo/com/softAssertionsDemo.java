package TestNGDemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softAssertionsDemo {
	
	
	
	
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
		
		
		String actualtitle=odriver.getTitle();
		String expectedTitle="abc";
	
		
	}
	
	
	
	
	

	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	

}
