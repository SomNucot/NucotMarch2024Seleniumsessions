package seleniumsessions.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationScript {

	public static void main(String[] args) throws InterruptedException {
		
		//1.Open the Browser
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeDriver  odriver=new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver odriver=new FirefoxDriver();
		
		odriver.get("https://www.flipkart.com");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		odriver.quit();
		
		
		
		
		
		
	}

}
