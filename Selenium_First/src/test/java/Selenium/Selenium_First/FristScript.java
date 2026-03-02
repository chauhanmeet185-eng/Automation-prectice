package Selenium.Selenium_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristScript {

	public static void main(String[] args) {

		/* To verify that FB login page open
		* 1. Open browser
		* 2. Go to Fb.com
		* 3. verify page title
		* 4. verify page url
		* ctrl+space
		* 
		**/

		// Open chromeBrowser
		WebDriver driver = new ChromeDriver(); // dynamic polymorphism

		// go to fb
		driver.get("https://www.facebook.com/");
		//String exptitle="FB login";

		//fetch page title
		/*String actualTitle= driver.getTitle();

		if(exptitle.equalsIgnoreCase (actualTitle))
			System.out.println("title match");
		else
			System.out.println("User on wrong page");
		
		String expurl="https://www.facebook.com/";

		//fetch page url
		String acturl=driver.getCurrentUrl();
		
		if(expurl.equalsIgnoreCase (acturl))
			System.out.println("Url match");
		else
			System.out.println("Url not match");*/
		
		//find and store element

		//WebElement ele=driver.findElement(By.id("email"));
		//ele.click();
		//ele.sendKeys("meet@gmail.com");

		// By id
		//driver.findElement(By.id("email")).click();

		// By name
		//driver.findElement(By.name("email")).click();

		// By classname
		//driver.findElement(By.className("inputtext")).sendKeys("Hellos");

		//By css selector
		//driver.findElement(By.cssSelector("#pass")).sendKeys("hello");

		//By xpat
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("hello");
		//driver.findElement(By.linkText("Create a Page")).click(); 
		//driver.findElement(By.partialLinkText("Create a")).click();
	}

}
