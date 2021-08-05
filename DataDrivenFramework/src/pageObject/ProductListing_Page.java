package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductListing_Page {
	
	
	public static class Product_1{
		
			public static WebElement txt_Price(WebDriver driver){
				
				WebElement element = null;
				element = driver.findElement(By.id("XX"));
				return element;
				
			}
	}
	
	

}
