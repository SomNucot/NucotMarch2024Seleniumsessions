package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		
	/*	
		There are two different types of XPath:
			a)Absolute XPath.--->/
			b)Relative XPath.--->//
*/
		
		//1.Open the Browser
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver odriver=new ChromeDriver();
			
				odriver.manage().window().maximize();
				
				odriver.manage().deleteAllCookies();
				
				//2.Open the App
				odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				
				//syntax
				//-->//tagName[@attribute='Value']
				//-->//input[@name='username']
				
				
				//1.//input[@type='email']
				//2.//input[@id='username']
				//3.//input[@name='username']
				//4.//*[@name='username']
				//5.//input[@class='input r4 wide mb16 mt8 username']
				
				
				
				Thread.sleep(3000);
				
				WebElement userName=odriver.findElement(By.xpath("//input[@name='username']"));
				userName.sendKeys("Admin");
				WebElement passWord=odriver.findElement(By.xpath("//input[@name='password']"));
				passWord.sendKeys("admin123");
		
				WebElement loginBtn=odriver.findElement(By.xpath("//button[@type='submit']"));
				loginBtn.click();
		
		
	}

}
