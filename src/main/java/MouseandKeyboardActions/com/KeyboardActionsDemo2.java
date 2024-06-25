package MouseandKeyboardActions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionsDemo2 {
	
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
		//sendway to pass value into input box
		Actions oaction=new Actions(odriver);
		oaction.sendKeys(userName123, Keys.ENTER).perform();
		
		
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	void closebrowser()
	{
		odriver.quit();
	}
	
	
	
	

}
