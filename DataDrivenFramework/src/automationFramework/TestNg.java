package automationFramework;

import org.testng.annotations.Test;

import pageObject.ProductListing_Page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestNg {
public WebDriver driver;
  @Test
  public void main() {
	  
	
	// Find the element that's ID attribute is 'account'(My Account)

      driver.findElement(By.className("account_icon")).click();
      
      
      // Find the element that's ID attribute is 'log' (Username)

      // Enter Username on the element found by above desc.

      driver.findElement(By.id("log")).sendKeys("nikunj23190");

      // Find the element that's ID attribute is 'pwd' (Password)

      // Enter Password on the element found by the above desc.

      driver.findElement(By.id("pwd")).sendKeys("Fume@729");

      // Now submit the form. WebDriver will find the form for us from the element

      driver.findElement(By.id("login")).click();
      
      // Print a Log In message to the screen

      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

      // Find the element that's ID attribute is 'account_logout' (Log Out)

      driver.findElement(By.id("account_logout"));
      
 
     
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {


	  // Create a new instance of the Firefox driver

      driver = new FirefoxDriver();

      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
 

      //Launch the Online Store Website

      driver.get("http://www.store.demoqa.com");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}





	


 
