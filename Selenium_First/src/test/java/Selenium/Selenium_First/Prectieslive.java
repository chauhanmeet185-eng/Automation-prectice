package Selenium.Selenium_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prectieslive {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Title Matching
		String actualTitle = driver.getTitle();
		String expectedTitle = "Rahul Shetty Academy - Login page";
		assert actualTitle.equals(expectedTitle) : "Title is Matching";
		System.out.println("Title Matching Successfully");
		
		//Click on forgot your password
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("Clicked on Forgot password");
		
		//Add value to name, email and phone no filed
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Meet Chauhan");
		System.out.println("Name Enter Successfully");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("meet@04gmail.com");
		System.out.println("Email Enter Successfully");
		
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("6523478452");
		System.out.println("Phone number Enter Successfully");
		Thread.sleep(2000);
		
		//Click Reset Login Button
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println("RESET LOGIN button clicked successfully");
		Thread.sleep(2000);
		
		//Click Go To Login
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		System.out.println("GO TO LOGIN button clicked successfully");
		Thread.sleep(2000);
		
		//click on Sign in from and add user name
		driver.findElement(By.id("inputUsername")).sendKeys("Meet Chauhan");
		System.out.println("Username enter successfully");
		
		//click on Sign in from and add password
		driver.findElement(By.cssSelector("input[type=password]:nth-child(3)")).sendKeys("rahulshettyacademy");
		System.out.println("Password enter successfully");
	}

}
