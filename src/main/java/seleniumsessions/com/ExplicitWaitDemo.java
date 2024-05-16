package seleniumsessions.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {
	
	/*
	 * 
	 * 			alertIsPresent()
				elementSelectionStateToBe()
				elementToBeClickable()
				elementToBeSelected()
				frameToBeAvaliableAndSwitchToIt()
				invisibilityOfTheElementLocated()
				invisibilityOfElementWithText()
				presenceOfAllElementsLocatedBy()
				presenceOfElementLocated()
				textToBePresentInElement()
				textToBePresentInElementLocated()
				textToBePresentInElementValue()
				titleIs()
				titleContains()
				visibilityOf()
				visibilityOfAllElements()
				visibilityOfAllElementsLocatedBy()
				visibilityOfElementLocated()
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		//1.Open the Browser
	WebDriverManager.chromedriver().setup();
				
	ChromeDriver odriver=new ChromeDriver();
			
	odriver.manage().window().maximize();
				
	odriver.manage().deleteAllCookies();
				
	//2.Open the App
	odriver.get("https://askomdch.com/");
				
				
				
	WebElement store=odriver.findElement(By.linkText("Store"));
	store.click();
	
	WebDriverWait wait = new WebDriverWait(odriver,Duration.ofSeconds(1000));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("woocommerce-product-search-field-0")));		
				
	WebElement searchValue=odriver.findElement(By.id("woocommerce-product-search-field-0"));
				
	searchValue.sendKeys("red");
				
	WebElement clickOnSearch=odriver.findElement(By.xpath("//button[@type='submit']"));
				
	clickOnSearch.click();
				
	
		
				
	odriver.quit();
				
				
				
				

	}

}
