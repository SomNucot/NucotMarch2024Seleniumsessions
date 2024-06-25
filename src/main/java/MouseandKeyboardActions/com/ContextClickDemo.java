package MouseandKeyboardActions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickDemo {
	
	
	
	
	
	static WebDriver odriver;
	@BeforeSuite
	void lauchApp()
	{
	
			//1.Open the Browser
			WebDriverManager.chromedriver().setup();
			
			odriver=new ChromeDriver();
		
			odriver.manage().window().maximize();
			
			odriver.manage().deleteAllCookies();
			
			//2.Open the App
			odriver.get("https://askomdch.com/account/");
		}
		
		
	
	
	@Test(priority=1)
	void dragAndDropTestCase() throws InterruptedException
	{
		//contextclick(Right click)
				WebElement loginBtn=odriver.findElement(By.xpath("//button[text()='Log in']"));
				//Second way to click
				//Move to an Element and click
				Actions oaction=new Actions(odriver);
				oaction.contextClick(loginBtn).perform();
				Thread.sleep(3000);
		
	}
	
	
	
	
	@AfterSuite
	void closeApp()
	{
		odriver.quit();
	}
	
	

}
