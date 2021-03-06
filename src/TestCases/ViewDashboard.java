package TestCases;

import org.testng.annotations.Test;
import Utility.Org;
import Utility.TakeVideo;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeMethod;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class ViewDashboard {
	static final Logger logger = LogManager.getLogger(ViewDashboard.class.getName());
	public static  WebDriver driver;
	public static WebDriverWait wait;
    private static ScreenRecorder scr;
    static String driverPath = "C:/Users/amit 1/workspace-mars/IM/lib/";
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String browser) {
	  try {
			if (browser.equalsIgnoreCase("Firefox")) {
				//System.setProperty("webdriver.firefox.bin", "C://Users//amit 1//Downloads//firefox-47.0.1.win64.sdk//firefox-sdk//bin//firefox.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	    //driver=new ChromeDriver();
		refLogin.dologin(driver);
		}
  @Test
  public void viewDashboard() throws Exception {
	  DOMConfigurator.configure("log.xml");
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
	  logger.info("TEST Has Stopped");
      logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
  }
  
  @AfterMethod
  public void afterMethod() {
        driver.close(); 
  }

}
