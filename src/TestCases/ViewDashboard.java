package TestCases;

import org.testng.annotations.Test;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import Utility.Org;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ViewDashboard {
	public static  WebDriver driver;
	public static WebDriverWait wait;
	static final Logger logger = LogManager.getLogger(ViewDashboard.class.getName());
  @BeforeMethod
  public void beforeMethod() {
	    driver=new ChromeDriver();
		refLogin.dologin(driver);
		
	  }
  
  @Test
  public void viewDashboard() {
	  DOMConfigurator.configure("log.xml");
      logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
      logger.info("TEST Has Started");
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  Org.CancelPost(driver).click();
	  //Org.publish(driver).click();
	  //Editproject.editProject(driver, wait);
	//Print a Log In message to the screen
	  logger.info("TEST Has Stopped");
      logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
  }
  
  @AfterMethod
  public void afterMethod() {
        driver.close(); 
  }

}
