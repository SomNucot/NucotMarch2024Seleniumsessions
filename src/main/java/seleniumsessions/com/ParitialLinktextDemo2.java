package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParitialLinktextDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver  odriver=new ChromeDriver();
		
		
		//open the app
		
		odriver.get("https://app.hubspot.com/login");
		
		odriver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement linkText=odriver.findElement(By.partialLinkText("Forgot"));
		
		linkText.click();
		
		Thread.sleep(3000);

	}

}
