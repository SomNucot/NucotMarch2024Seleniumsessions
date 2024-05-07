package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassnameDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		//1.Open the Browser
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  odriver=new ChromeDriver();
		
		
		
		
		//open the app
		
		odriver.get("https://www.saucedemo.com/");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement un=odriver.findElement(By.className("input_error"));
		
		un.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement pw=odriver.findElement(By.id("password"));
		
		pw.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement lbtn=odriver.findElement(By.className("submit-button"));
		
		lbtn.click();
		Thread.sleep(3000);
		
		
		odriver.quit();

	}

}
