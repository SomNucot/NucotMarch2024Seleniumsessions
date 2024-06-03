package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invocatiobDemo {
	
	
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
	

	@Test(invocationCount=3)
	void doLogin() throws InterruptedException
	{

		Thread.sleep(3000);
		
		WebElement userName123=odriver.findElement(By.name("username"));
		
		userName123.sendKeys("gfgh");
		
		Thread.sleep(3000);
		WebElement passWord123=odriver.findElement(By.name("password"));
		
		passWord123.sendKeys("ahh4gfhjgjghj");
		
		Thread.sleep(3000);
		
		WebElement logbtn=odriver.findElement(By.xpath("//button[@type='submit']"));
		logbtn.click();
		
	}
	
	
	
	
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	

}
