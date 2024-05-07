package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*Below is the list of these locators of Selenium WebDriver:

			1.ID
			2.Name
			3.ClassName
			4.LinkText
			5.Partial LinkText
			6.TagName
			7.CSS Selector
			8.XPath
			There are two different types of XPath:
			a)Absolute XPath.
			b)Relative XPath.
			
*/
		
		
		
//1.Open the Browser
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  odriver=new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		
		
		//open the app
		
		odriver.get("https://app.hubspot.com/login");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement userName=odriver.findElement(By.id("username"));
		
		userName.sendKeys("nucot@gmail.com");
		
		Thread.sleep(3000);
		WebElement passWord=odriver.findElement(By.id("password"));
		
		passWord.sendKeys("Bangalore");
		
		Thread.sleep(3000);
		
		WebElement loginBtn=odriver.findElement(By.id("loginBtn"));
		
		loginBtn.click();
		

	}

}
