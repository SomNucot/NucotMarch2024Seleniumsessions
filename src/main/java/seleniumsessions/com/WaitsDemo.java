package seleniumsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	public static void main(String[] args) {
		
		
		//1.static wait --->example-->Thread.sleep
		//2.Dynamic waits--->example
		//a.Implicit wait
		//b.Explicit wait
		//c.Fluent wait
		
		
		//2.dynamic waits
		//applied for all the web elements 
		//global wait
		//dynamic wait
		//1.Implicit wait
		//syntax-->

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));

	//	b.Explicit wait	
		
		//syntax-->
		
		
		//-->WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(webelement)));
	
		
		//c.Fluent wait
		/*
		 Wait<WebDriver> wait =new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(2))
        .pollingEvery(Duration.ofMillis(300))
        .ignoring(ElementNotInteractableException.class);
		 */
		
		
		
		
		
		//1.Open the Browser
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver odriver=new ChromeDriver();
			
				odriver.manage().window().maximize();
				
				odriver.manage().deleteAllCookies();
				
				//2.Open the App
				odriver.get("https://askomdch.com/");
				
				
				

			WebElement accessories=odriver.findElement(By.cssSelector("a.menu-link"));
			accessories.click();

			odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			odriver.quit();



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
