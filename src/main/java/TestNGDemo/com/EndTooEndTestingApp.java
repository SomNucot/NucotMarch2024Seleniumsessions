package TestNGDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndTooEndTestingApp {
	
	static WebDriver odriver;
	@BeforeSuite
	void lauchApp()
	{
	
			//1.Open the Browser
			WebDriverManager.chromedriver().setup();
			
			odriver=new ChromeDriver();
		
			odriver.manage().window().maximize();
			
			odriver.manage().deleteAllCookies();
			
			//2.Open the App
			odriver.get("https://askomdch.com/account/");
		}
		
		
	
	
	@Test(priority=1)
	void registerUser() throws InterruptedException
	{
		
		WebElement userName=odriver.findElement(By.xpath("//input[@id='reg_username']"));
		userName.sendKeys("nucot12345");
		Thread.sleep(3000);
		WebElement emailId=odriver.findElement(By.xpath("//input[@id='reg_email']"));
		emailId.sendKeys("nucot.softwaretesting12345@gmail.com");
		Thread.sleep(3000);
		WebElement passWord=odriver.findElement(By.xpath("//input[@id='reg_password']"));
		passWord.sendKeys("nucot12345");
		Thread.sleep(3000);
		WebElement loginBtn=odriver.findElement(By.xpath("//button[text()='Register']"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement loginOut=odriver.findElement(By.xpath("//a[text()='Logout']"));
		loginOut.click();
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=2)
	void loginUser() throws InterruptedException
	{
		WebElement emailAddress=odriver.findElement(By.xpath("//input[@id='username']"));
		emailAddress.sendKeys("nucot.softwaretesting12345@gmail.com");
		
		WebElement passWord=odriver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("nucot12345");
		
		WebElement loginBtn=odriver.findElement(By.xpath("//button[text()='Log in']"));
		loginBtn.click();
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=3)
	void addingAddressOfUser() throws InterruptedException
	{
		
		
		WebElement clickOnAddress=odriver.findElement(By.xpath("//a[text()='Addresses']"));
		clickOnAddress.click();
		Thread.sleep(3000);
		WebElement addAddress=odriver.findElement(By.xpath("(//a[text()='Add'])[1]"));
		addAddress.click();
		Thread.sleep(3000);
		
	}
	
	@AfterSuite
	void closeApp()
	{
		odriver.quit();
	}
	
	
	
	

}
