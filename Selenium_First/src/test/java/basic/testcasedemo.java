package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcasedemo {
	
	static WebDriver driver;
	
	 // Browser Setup Method
   void setupBrowser() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://rahulshettyacademy.com/locatorspractice/");
   }

   // Login Reusable Method
   void login(String username, String password) {
       driver.findElement(By.id("inputUsername")).sendKeys(username);
       driver.findElement(By.name("inputPassword")).sendKeys(password);
       driver.findElement(By.className("signInBtn")).click();
   }

   // Title Verification Method
   void verifyTitle(String expectedTitle) {
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle);
   }

   @Test
   void loginTest() throws InterruptedException {

       setupBrowser();

       login("rahul", "rahulshettyacademy");

       // Wait just for demo (better to use WebDriverWait in real project)
       Thread.sleep(2000);

       verifyTitle("Rahul Shetty Academy - Login page");

       driver.quit();
   }

}
