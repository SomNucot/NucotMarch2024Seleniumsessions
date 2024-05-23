package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingpopupDemo {
	
	
static WebDriver odriver;
	
	@BeforeSuite
	void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
	}
	
	
	@Test(priority=1)
	void getTitleOfPage()
	{
		String title=odriver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2)
	void getCurrentUrlOfPage()
	{
		
		String url=odriver.getCurrentUrl();
		System.out.println(url);
		
	}
	
	@Test(priority=2)
	void handlingBrowserpopups() throws InterruptedException
	{
		WebElement jsbuttonAlert=odriver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		jsbuttonAlert.click();
		
		
		String textValue=odriver.switchTo().alert().getText();
		System.out.println(textValue);
		
		odriver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		
	}
	
	@AfterSuite
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	

}
