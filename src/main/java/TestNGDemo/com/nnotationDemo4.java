package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nnotationDemo4 {
	
	
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
	
	
	@Test(priority=1)
	void getTitleOfPage()
	{
		String title=odriver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=3)
	void getCurrentUrlOfPage()
	{
		
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	@Test(priority=2)
	void doLogin() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		WebElement userName123=odriver.findElement(By.name("username"));
		
		userName123.sendKeys("Admin");
		
		Thread.sleep(3000);
		WebElement passWord123=odriver.findElement(By.name("password"));
		
		passWord123.sendKeys("admin123");
		
		Thread.sleep(3000);
		
		
		
	}
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	

}
