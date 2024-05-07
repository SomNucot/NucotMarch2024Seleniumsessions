package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
	//1.Open the Browser
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  odriver=new ChromeDriver();
		
		
		
		
		//open the app
		
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement userName123=odriver.findElement(By.name("username"));
		
		userName123.sendKeys("Admin");
		
		Thread.sleep(3000);
		WebElement passWord123=odriver.findElement(By.name("password"));
		
		passWord123.sendKeys("admin123");
		
		Thread.sleep(3000);
		
		

	}

}
