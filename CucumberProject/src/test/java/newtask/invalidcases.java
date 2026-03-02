package newtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class invalidcases {
	
	WebDriver driver;
	
	@Given("Launch browser")
	public void method()
	{
		driver = new ChromeDriver();
	}

	@And("navigate to 'https:automationexercise.com'")
	public void method1()
	{
		driver.get("https://www.automationexercise.com/");
	}
	
	@Then("verify home page is visible or not")
	public void method2()
	{
		driver.findElement(By.linkText("Home"));
		System.out.println("Home page visible successfully");
	}
	
	@And("click on 'Signup & Login button'")
	public void method3()
	{
		driver.findElement(By.linkText("Signup / Login")).click();
		System.out.println("Signup & Login button clicked successfully");
	}
	
	@Then("verify Login to your account is visible or not")
	public void method4()
	{
		driver.findElement(By.cssSelector("div.login-form h2")).click();
		System.out.println("Login to your account is visible");
	}
	
	@And("Enter incorrect email and password")
	public void method5()
	{
		driver.findElement(By.name("email")).sendKeys("meetc04@gmail.com");
		driver.findElement(By.name("password")).sendKeys("meet04@gmail.com.in");
		System.out.println("Enter incorrect email and password");
	}
	
	@And("click on 'login' button")
	public void method6()
	{
		driver.findElement(By.className("btn-default")).click();
		System.out.println("click login button successfully");
	}
	
	@Then("Verify error 'Your email or password is incorrect!' is visible")
	public void method7()
	{
		driver.findElement(By.cssSelector("div.login-form p"));
		System.out.println("Your email or password is incorrect! is visible");
	}

}
