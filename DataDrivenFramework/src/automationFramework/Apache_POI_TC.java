package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import pageObjects.*;

import utility.Constant;

// Import Package utility.*

import utility.ExcelUtils;

import appModules.SignIn_Action;


public class Apache_POI_TC {
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		 
	        driver = new FirefoxDriver();
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get(Constant.URL);
	        SignIn_Action.Execute(driver);
	     
	 
	        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
	 
	      //  Home_Page.lnk_LogOut(driver).click(); 
	 
	        driver.quit();
	 
	        //This is to send the PASS value to the Excel sheet in the result column.
	 
	        ExcelUtils.setCellData("Pass", 1, 3);
	 
		
		

	}

}
