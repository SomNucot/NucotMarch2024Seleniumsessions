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

public class DemoOnMouseActions {
	
	/*
	Mouse Actions in Selenium:

		doubleClick(): Performs double click on the element
		clickAndHold(): Performs long click on the mouse without releasing it
		dragAndDrop(): Drags the element from one point and drops to another
		moveToElement(): Shifts the mouse pointer to the center of the element
		contextClick(): Performs right-click on the mouse
		
		Keyboard Actions in Selenium:

		sendKeys(): Sends a series of keys to the element
		keyUp(): Performs key release
		keyDown(): Performs keypress without release
	*/
	
	
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
	void registerUser() throws InterruptedException
	{
		
		WebElement loginBtn=odriver.findElement(By.xpath("//button[text()='Log in']"));
		//Second way to click
		//Move to an Element and click
		Actions oaction=new Actions(odriver);
		oaction.moveToElement(loginBtn).click().perform();
		Thread.sleep(3000);
		
		//click and Hold an element
		
		
	}
	
	@Test(priority=2)
	void clickAndHold() throws InterruptedException
	{
		
		//click and Hold an element
		WebElement loginBtn=odriver.findElement(By.xpath("//button[text()='Log in']"));
		//Second way to click
		//Move to an Element and click
		Actions oaction=new Actions(odriver);
		oaction.clickAndHold(loginBtn).perform();
		Thread.sleep(3000);
		
		
		
	}
	
	
	@AfterSuite
	void closeApp()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
