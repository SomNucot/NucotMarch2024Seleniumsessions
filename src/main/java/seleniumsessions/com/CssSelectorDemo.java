package seleniumsessions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 *  ID: Used to locate an element by its ID.
			Name: Used to locate an element by its name.
			TagName: Used to locate an element by its HTML tag.
			ClassName: Used to locate an element by its CSS class.
		 * 
		 * <tagname>1.#<id value>
		 * 
		 * example-->li#menu-item-1232

			2.#<id value>
					#menu-item-1232

			3.<tagname>[id=’<id value>’]
			
			//-->li[id='menu-item-1232']


		 * 
		 *--->class attribute
		 *		1.<tagname>.<class value>
		 *			example-->a.menu-link
		 *
		 *
				2-->.<class value>
					.menu-link
				
				3.--><tagname>[class=’<class value>’]
				a[class='menu-link']
		 * 
		 * 
		 * 
		 * 
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


	Thread.sleep(3000);
			
			
			
			odriver.quit();




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
