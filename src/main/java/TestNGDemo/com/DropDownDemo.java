package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
	
	
	static WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://the-internet.herokuapp.com/dropdown");
		
		
	}
	
	
	
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		
		WebElement  dropDownMenu=odriver.findElement(By.xpath("//select[@id='dropdown']"));
		dropDownMenu.click();
		
		Select  olselect=new Select(dropDownMenu);
		
		//olselect.selectByIndex(2);//
		
		//olselect.selectByValue("1");
		olselect.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
