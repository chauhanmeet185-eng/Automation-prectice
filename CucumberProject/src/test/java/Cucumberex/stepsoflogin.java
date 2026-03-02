package Cucumberex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsoflogin {
	
	WebDriver driver; // int a;
	
	@Given("open browser")
	public void method1()
	{
		//int a=10
		driver = new ChromeDriver();
	}

	@And("Go to url")
	public void method2()
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	
	@When("user enter data in uname and password")
	public void method3()
	{
		driver.findElement(By.id("inputUsername")).sendKeys("stad");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	}
	
	@And("click on login button")
	public void method4()
	{
		driver.findElement(By.className("signInBtn")).click();
	}
	
	@Then("user should redirect on home page")
	public void method5()
	{
		System.out.println("in home");
	}

}
