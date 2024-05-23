package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingpopupjsconfirm {
	
	
static WebDriver odriver;
	
	@BeforeMethod
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
	
	@Test(priority=3)
	void handlingBrowserjspopups() throws InterruptedException
	{
		
		WebElement jsConfirm=odriver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		jsConfirm.click();
		
		String textvalue=odriver.switchTo().alert().getText();
		System.out.println(textvalue);
		
		
		odriver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		
	}
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
