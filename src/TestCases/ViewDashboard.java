package TestCases;

import org.testng.annotations.Test;

import Utility.Editproject;
import Utility.Org;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ViewDashboard {
	public static  WebDriver driver;
	public static WebDriverWait wait;
  @BeforeMethod
  public void beforeMethod() {
	    driver=new ChromeDriver();
		refLogin.dologin(driver);
		
	  }
  
  @Test
  public void viewDashboard() {
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  Org.CancelPost(driver).click();
	  //Org.publish(driver).click();
	  Editproject.editProject(driver, wait);
  }
  
  @AfterMethod
  public void afterMethod() {
        //driver.close(); 
  }

}
