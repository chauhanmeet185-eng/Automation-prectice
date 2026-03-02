package taskcucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	WebDriver driver;
	
	@Given("open browser")
	public void method1()
	{
		driver = new ChromeDriver();
	}
	
	@And("Go to url")
	public void method2()
	{
		driver.get("https://www.automationexercise.com/login");
	}
	
	@When("user enter data in uname and password")
	public void method3()
	{
		driver.findElement(By.name("email")).sendKeys("meetc04@gmail.com");
		driver.findElement(By.name("password")).sendKeys("meet04@gmail.com.in");
	}
	
	@And("click on login button")
	public void method4()
	{
		driver.findElement(By.className("btn-default")).click();
	}
	
	@Then("user should redirect on home page")
	public void method5()
	{
		System.out.println("in home");
	}

}
