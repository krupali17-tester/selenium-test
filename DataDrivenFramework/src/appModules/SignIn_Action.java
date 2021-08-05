package appModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Log;
import pageObject.Home_Page;
import pageObject.Login_Page;


import utility.ExcelUtils;

public class SignIn_Action {
	
	
	public static void Execute(WebDriver driver){
		// This is old code for gmail application. 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
/*
		String sUserName = ExcelUtils.getCellData(1, 0);

		String sPassword = ExcelUtils.getCellData(1, 1);

		/*driver.findElement(By.id("Email")).sendKeys(sUserName);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(sPassword);
		driver.findElement(By.id("signIn")).click();
		
		Home_Page.lnk_MyAccount(driver).click();

	//LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

	//LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

	//LogIn_Page.btn_LogIn(driver).click();*/

		
		// This is new code for Logs
		
		String sUserName = ExcelUtils.getCellData(1, 1);
		 
		Log.info("Username picked from Excel is "+ sUserName );

		String sPassword = ExcelUtils.getCellData(1, 2);

		Log.info("Password picked from Excel is "+ sPassword );

		Home_Page.lnk_MyAccount(driver).click();

		Log.info("Click action performed on My Account link");

		Login_Page.txtbx_UserName(driver).sendKeys(sUserName);

		Log.info("Username entered in the Username text box");

		Login_Page.txtbx_Password(driver).sendKeys(sPassword);

		Log.info("Password entered in the Password text box");

		Login_Page.btn_LogIn(driver).click();

		Log.info("Click action performed on Submit button");
		
		
		
	}
}
