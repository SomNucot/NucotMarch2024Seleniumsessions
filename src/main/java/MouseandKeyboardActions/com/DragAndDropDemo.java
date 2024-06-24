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

public class DragAndDropDemo {
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
			odriver.get("https://the-internet.herokuapp.com/drag_and_drop");
		}
		
		
	
	
	@Test(priority=1)
	void dragAndDropTestCase() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement buttonA=odriver.findElement(By.xpath("(//div[@class='column'])[1]"));
		WebElement buttonB=odriver.findElement(By.xpath("//div[@id='column-b']"));
		Thread.sleep(3000);
		Actions oaction=new Actions(odriver);
		oaction.dragAndDrop(buttonA, buttonB).perform();
		Thread.sleep(3000);
		
	}
	
	
	
	
	@AfterSuite
	void closeApp()
	{
		odriver.quit();
	}
	
	
	
	
	
	

}
