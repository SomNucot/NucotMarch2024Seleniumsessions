package NavigationDemo.com;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		// Browser navigation

		//1.driver.navigate().to("https://selenium.dev");
		//2.driver.navigate().back();
		//3.driver.navigate().forward();
		//4.driver.navigate().refresh();
		
//1.Open the Browser
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver odriver=new ChromeDriver();
		
		//open the ap
		
	
		odriver.navigate().to("https://www.gmail.com/");
		
		odriver.manage().window().maximize();
		
		
		
		odriver.navigate().back();
		
		odriver.navigate().forward();
	
		
		odriver.navigate().refresh();
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}

}
