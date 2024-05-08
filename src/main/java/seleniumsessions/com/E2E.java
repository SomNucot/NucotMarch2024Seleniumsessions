package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E {


	
	public static void main(String[] args) throws InterruptedException {
		
		
		//1.Open the Browser
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
	
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//2.Open the App
		odriver.get("https://askomdch.com/");
		
		
		
		WebElement store=odriver.findElement(By.linkText("Store"));
		store.click();
		
		
		WebElement searchValue=odriver.findElement(By.id("woocommerce-product-search-field-0"));
		
		searchValue.sendKeys("red");
		
		
		WebElement clickOnSearch=odriver.findElement(By.xpath("//button[@type='submit']"));
		
		clickOnSearch.click();
		
		
		
		WebElement addToCart=odriver.findElement(By.name("add-to-cart"));
		
		addToCart.click();
		
		Thread.sleep(3000);
		WebElement viewToCart=odriver.findElement(By.xpath("(//a[@href='https://askomdch.com/cart/'])[5]"));
		
		viewToCart.click();
		
		Thread.sleep(3000);
	
		WebElement checkout=odriver.findElement(By.xpath("//a[@href='https://askomdch.com/checkout/']"));
		
		checkout.click();
		
		odriver.quit();
		
		
		
		
		
		
		
		
	}

}
