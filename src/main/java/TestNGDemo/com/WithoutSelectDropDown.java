package TestNGDemo.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectDropDown {
	
	
static WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://demo.mobiscroll.com/select/country-picker");
		
		
	}
	
	
	
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		
		WebElement dropDown=odriver.findElement(By.xpath("//input[@id='demo155-country-picker']"));
		dropDown.click();
		
		List<WebElement>alloptionsinDropDown=odriver.findElements(By.cssSelector("div.mbsc-scrollview-scroll"));
	/*	
		for(int i=0;i<alloptionsinDropDown.size();i++)
		{
			
			System.out.println(alloptionsinDropDown.get(i).getText());
			
		}
		
	*/
		
		
		
		for(WebElement newvalue:alloptionsinDropDown)
		{
			
			System.out.println(newvalue.getSize());
			System.out.println(newvalue.getText());
			
		}
		
		
	}
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	
	

}
