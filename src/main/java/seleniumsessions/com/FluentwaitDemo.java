package seleniumsessions.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentwaitDemo {
	
	
	static ChromeDriver  odriver;
	

	public static void main(String[] args) throws InterruptedException {
		//3.Fluentwait
		/*
		 * 
		 * syntax
		 * 
		 * 
		 * Wait<ChromeDriver> wait =
		        new FluentWait<>(odriver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
		 * 
		 * 
		 * 
		 * 
		 */
		

		//1.Open the Browser
		
		WebDriverManager.chromedriver().setup();
		
			odriver=new ChromeDriver();
		
		//open the app
		
		odriver.get("https://www.saucedemo.com/");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement un=odriver.findElement(By.className("input_error"));
		
		un.sendKeys("standard_user");
		
		
		WebElement pw=odriver.findElement(By.id("password"));
		
		pw.sendKeys("secret_sauce");
		
		Wait<ChromeDriver> wait =
		        new FluentWait<>(odriver)
		            .withTimeout(Duration.ofSeconds(2000))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
		
		WebElement lbtn=odriver.findElement(By.className("submit-button"));
		
		lbtn.click();
		Thread.sleep(3000);
		
		
		odriver.quit();
		
		
		
		
		
		
		
		
		

	}

}
