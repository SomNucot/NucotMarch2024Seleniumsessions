package MouseandKeyboardActions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo3 {
	
	
	
	
static ChromeDriver odriver;
	
	@Test
	void alaunchBrowser()
	{
		//1.Open the Browser
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void bdoLogin() throws InterruptedException
	{

		Thread.sleep(3000);
		
		WebElement userName123=odriver.findElement(By.name("username"));
	
		WebElement passWord123=odriver.findElement(By.name("password"));
		
		
		Actions oaction=new Actions(odriver);
		oaction.sendKeys(userName123, "admin123")
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.sendKeys("c")
		.keyUp(Keys.CONTROL).perform();
		
		//paste
		
		oaction.click(passWord123)
		.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL).perform();
		
		
		
		
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	void closebrowser()
	{
		odriver.quit();
	}
	

}
