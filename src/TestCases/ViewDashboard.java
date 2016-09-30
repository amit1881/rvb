package TestCases;

import org.testng.annotations.Test;

import Utility.Org;
import Utility.TakeVideo;

import org.testng.annotations.BeforeMethod;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ViewDashboard {
	static final Logger logger = LogManager.getLogger(ViewDashboard.class.getName());
	public static  WebDriver driver;
	public static WebDriverWait wait;
	private static ScreenRecorder scr;
  @BeforeMethod
  public void beforeMethod() {
	    driver=new ChromeDriver();
		refLogin.dologin(driver);
		}
  @Test
  public void viewDashboard() throws Exception {
	  DOMConfigurator.configure("Log4j2.xml");
	  logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
      logger.info("TEST Has Started");
	  scr=TakeVideo.takeVideo(scr);
	  //Start Capturing the Video
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  Org.CancelPost(driver).click();
	  // Stop the ScreenRecorder
	  scr.stop();
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
