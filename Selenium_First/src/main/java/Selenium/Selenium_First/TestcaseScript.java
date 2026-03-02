package Selenium.Selenium_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseScript {

    public static void main(String[] args) throws InterruptedException {

        // 1. Launch Browser
        WebDriver driver = new ChromeDriver();

        // 2. Navigate to URL
        driver.get("http://automationexercise.com");

        // 3. Verify Home Page is Visible (Using CSS Selector)
        /*WebElement homeLogo = driver.findElement(By.cssSelector("img[alt='Website for automation practice']"));
        if(homeLogo.isDisplayed()) {
            System.out.println("Home Page is visible");
        }*/

        // 4. Click on Signup / Login button (Using XPATH)
        //driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();

        // 5. Verify Login to your account is visible (Using Xpath)
        	/*driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        	WebElement loginHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login to your account']")));
        	// If condition
        	if(loginHeader.isDisplayed()) {
        	    System.out.println("Login to your account is visible");
        	}*/

        // 6. Enter correct email address and password
        // Click Signup / Login
        /*driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        // Wait for email field (XPath)
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-email']")));
        emailField.sendKeys("meet04@gmail.com");
        
        // Wait for password field (XPath)
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-password']")));
        passwordField.sendKeys("meet@04");*/
        
        // 7. Click Login button (Using CSS Selector)
        // Click Signup / Login
        //driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
        // click login button
        //driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();

        // 8. Verify Logged in as username is visible (Using XPATH)
        // Click Signup / Login
        /*driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
        // Wait for email field
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-email']")));
        // Enter Email
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("meet05@gmail.com");
        // Enter Password
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("meet@05");
        // Click Login
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
        // Wait for Logged in text
        WebElement loggedIn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logged in as')]")));*/

        // 9. Click Delete Account button (Using XPATH) 
        driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]")).click(); 
        
        // 10. Verify account deleted is visible (Using XPATH) 
        WebElement deletedMsg = driver.findElement(By.xpath("//h2[contains(text(),'Account Deleted')]")); 
        if(deletedMsg.isDisplayed()) 
        { 
        	System.out.println("Account Deleted Successfully"); 
        }
    }
}