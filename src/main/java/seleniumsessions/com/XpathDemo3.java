package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		//By using contains
		
		//using attributes
		
		//-->//tagName[contains(@attribute,'value')]
		//-->//tagName[contains(text(),'value')]
		
		//--->example   (//a[contains(@class,'menu-link')])[5]
		
		
		
	
				//-->1.By text() method
				
				//1.Open the Browser
						WebDriverManager.chromedriver().setup();
						
						ChromeDriver odriver=new ChromeDriver();
					
						odriver.manage().window().maximize();
						
						odriver.manage().deleteAllCookies();
						
						//2.Open the App
						odriver.get("https://askomdch.com/");
						
						
						
				
				WebElement accessories=odriver.findElement(By.xpath("(//a[contains(@class,'menu-link')])[5]"));
				accessories.click();
				
				
				Thread.sleep(3000);
				
				
				
				WebElement addToCart=odriver.findElement(By.xpath("//a[contains(@data-product_id,'1198')]"));
				addToCart.click();
				
				Thread.sleep(3000);
				
				
						
				
				WebElement bestSeller=odriver.findElement(By.xpath("//h2[contains(text(),'Best')]"));
				
				String labelValue=bestSeller.getText();
				System.out.println(labelValue);
				Thread.sleep(3000);

	}

}
