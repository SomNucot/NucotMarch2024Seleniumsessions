package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo33 {
	
	
	
static WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://codepen.io/RobotsPlay/pres/pyNLdL");
		
		
	}
	
	
	
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		Thread.sleep(3000);
		
		odriver.switchTo().frame(0);
		WebElement  dropDownMenu=odriver.findElement(By.xpath("//label[@class='dropdown-label']"));
		dropDownMenu.click();
		
		WebElement  listMenu=odriver.findElement(By.xpath("(//input[@name='dropdown-group'])[3]"));
		
		listMenu.click();
		
		Thread.sleep(3000);
		
		
		
		
	
		
		
	}
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	

}
