package Selenium.Selenium_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondScript {
	
	public static void main(String[] args) {

		        WebDriver driver = null;

		        // Change browser name here: chrome / firefox / edge
		        String browser = "chrome";

		        // SWITCH CASE FOR MULTIPLE BROWSERS
		        switch (browser.toLowerCase()) {

		            case "chrome":
		                driver = new ChromeDriver();
		                break;

		            case "firefox":
		                driver = new FirefoxDriver();
		                break;

		            case "edge":
		                driver = new EdgeDriver();
		                break;

		            default:
		                System.out.println("Invalid browser name");
		                return;
		        }

		        // Open application
		        driver.get("https://www.automationexercise.com/login");

		        // Heading verification (By XPath)
		        //driver.findElement(By.xpath("//*[@id="form"]/div/div/div[1]/div/h2"));

		        // Email field (By ID) issu
		        //driver.findElement(By.id("email")).click();

		        // Password field (By Name)
		        //driver.findElement(By.name("password")).sendKeys("Test@123");
		        
		        // Login button (By ClassName) issu
		        //driver.findElement(By.className("submit")).click();

		        // Login button text (By CSS Selector)
		        //driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button")).click();

				// Email enabled
		        //WebElement email1 = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)"));
		        //System.out.println("Email enabled: " + email1.isEnabled());

		        // Password enabled
		        //WebElement pass = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)"));
		        //System.out.println("Password enabled: " + pass.isEnabled());
		        
				// Login button enabled
		        WebElement loginBtn1 = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button"));
		        System.out.println("Login enabled: " + loginBtn1.isEnabled());
	}
}
