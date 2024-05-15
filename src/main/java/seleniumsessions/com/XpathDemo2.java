package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Second way
		//-->1.By text() method
		
		//1.Open the Browser
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver odriver=new ChromeDriver();
			
				odriver.manage().window().maximize();
				
				odriver.manage().deleteAllCookies();
				
				//2.Open the App
				odriver.get("https://askomdch.com/");
				
				
				//by using text()
				//-->//a[text()='Accessories']
		
				//3.index based with text()
				//-->(//a[text()='Accessories'])[1]
		
		WebElement accessories=odriver.findElement(By.xpath("(//a[text()='Accessories'])[1]"));
		accessories.click();
		
		
		Thread.sleep(3000);
		
		
		
		WebElement addToCart=odriver.findElement(By.xpath("(//a[text()='Add to cart'])[2]"));
		addToCart.click();
		
		Thread.sleep(3000);
		
		
		
		WebElement listCart=odriver.findElement(By.xpath("(//span[@class='count'])[1]"));
		listCart.click();
				
		Thread.sleep(3000);
		
		
		
		WebElement addCoupon=odriver.findElement(By.xpath("//input[@id='coupon_code']"));
		addCoupon.sendKeys("AAQRTUGB");
				
		Thread.sleep(3000);
		
		WebElement clickOnaddCoupon=odriver.findElement(By.xpath("//button[text()='Apply coupon']"));
		clickOnaddCoupon.click();
				
		Thread.sleep(3000);

	}

}
