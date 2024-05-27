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

public class DropDownDemo2 {
	
	
static WebDriver odriver;
	
	@BeforeMethod
	void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		
	}
	
	
	
	
	@Test
	void dropDownHandling() throws InterruptedException
	{
		
		//-->//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select
		WebElement  dropDownMenu=odriver.findElement(By.xpath("//select[1]"));
		dropDownMenu.click();
		
		Select  olselect=new Select(dropDownMenu);
		
		//olselect.selectByIndex(25);//
		
		//olselect.selectByValue("IND");
		olselect.selectByVisibleText("Singapore");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
	}
	
	@AfterMethod
	void closeBrowser()
	{
		odriver.quit();
		
	}
	

}
