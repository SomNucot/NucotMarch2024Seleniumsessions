package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		//1.Open the Browser
		
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver  odriver=new ChromeDriver();
				
				
				
				
				//open the app
				
				odriver.get("https://demo.bankid.com/");
				
				odriver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				WebElement loginBtn=odriver.findElement(By.className("bg-orange"));
				
				loginBtn.click();
				Thread.sleep(3000);
				
				
		
		
		
		
		
		
		
		

	}

}
