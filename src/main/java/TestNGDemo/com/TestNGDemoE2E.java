package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemoE2E {
	
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
		odriver.get("https://askomdch.com/");
	}
	
	
	@Test
	
	void bloginPage()
	{
		WebElement store=odriver.findElement(By.linkText("Store"));
		store.click();
		
		
		WebElement searchValue=odriver.findElement(By.id("woocommerce-product-search-field-0"));
		
		searchValue.sendKeys("red");
		
		
		WebElement clickOnSearch=odriver.findElement(By.xpath("//button[@type='submit']"));
		
		clickOnSearch.click();
	}
	
	
	@Test
	void closebrowser()
	{
		odriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
