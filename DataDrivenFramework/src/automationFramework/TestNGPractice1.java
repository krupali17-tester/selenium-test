package automationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class TestNGPractice1 {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  	// Click on MyAccount link
	  
	    driver.findElement(By.className("account_icon")).click();
	  	assertEquals("Your Account | ONLINE STORE", driver.getTitle());
	  	
	    driver.findElement(By.id("log")).clear();
	    driver.findElement(By.id("log")).sendKeys("nikunj23190");
	    driver.findElement(By.id("pwd")).clear();
	    driver.findElement(By.id("pwd")).sendKeys("Fume@729");
	    driver.findElement(By.id("login")).click();
	    assertEquals("Your Account | ONLINE STORE", driver.getTitle());
	    System.out.println("Now Hover event");
	    WebElement element = driver.findElement(By.linkText("Product Category"));
	    
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
	    driver.findElement(By.linkText("iPhones")).click();
	    System.out.println(" Hover event successfull");
	    assertEquals("iPhones | ONLINE STORE", driver.getTitle());
	    System.out.println("before click on Grid");
	    driver.findElement(By.linkText("Grid")).click();
	    System.out.println("Clicked on Grid");
	    assertEquals("iPhones | ONLINE STORE", driver.getTitle());
	    
	    
	    String bodyText = driver.findElement(By.linkText("Apple iPhone 4S 16GB SIM-Free – Black")).getText();
	    
	    try {
	    	Assert.assertTrue("Text not found!", bodyText.contains("Apple iPhone 4S 16GB SIM-Free – Black"));
	    } catch (Error e) {
	      System.out.println("Test case fail 1");
	    }
	    driver.findElement(By.linkText("Apple iPhone 4S 16GB SIM-Free – Black")).click();
	    assertEquals("Apple iPhone 4S 16GB SIM-Free - Black | ONLINE STORE", driver.getTitle());
	    try {
	      assertEquals("Apple iPhone 4S 16GB SIM-Free – Black", driver.findElement(By.cssSelector("h1.prodtitle")).getText());
	    } catch (Error e) {
	    	System.out.println("Test case fail 2");
	    }
	    driver.findElement(By.name("Buy")).click();
	    driver.findElement(By.linkText("Go to Checkout")).click();
	    assertEquals("Checkout | ONLINE STORE", driver.getTitle());
	    driver.findElement(By.cssSelector("span.vk_bk.vk_h")).click();
	    try {
	      assertEquals("Nikunj Parmar", driver.findElement(By.cssSelector("div.ynWC6c")).getText());
	    } catch (Error e) {
	    	 System.out.println("Test case fail 3");
	    }
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String baseUrl;
	  
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  baseUrl = "http://store.demoqa.com/";
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(baseUrl);
	    
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
