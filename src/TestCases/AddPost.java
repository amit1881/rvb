package TestCases;

import org.testng.annotations.Test;

import Utility.Org;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddPost {
public static WebDriver driver=null;
  @BeforeMethod
  public void beforeMethod() {
	    driver=new ChromeDriver();
		refLogin.dologin(driver);
  }
  
  @Test
  public void addPost() {
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
  }
  
  @AfterMethod
  public void afterMethod() {
	    driver.close();
  }

}
