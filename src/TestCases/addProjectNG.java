package TestCases;

import org.testng.annotations.Test;

import Utility.Org;
import Utility.project;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class addProjectNG {
	public static  WebDriver driver;
  @Test
  public void testproject() throws Exception {
	  refLogin.dologin(driver);
	  Org.OrgLink(driver).click();
	  project.prolink(driver).click();
	  project.proname(driver).sendKeys("my firstpro 2");
	  Thread.sleep(2000);
	  project.backGround(driver).sendKeys("Invest in the growth of your business by using Twitter Ads to reach more potential customers.");
	  Thread.sleep(2000);
	  project.saveBtn(driver).click();
  }
  public void test() throws Exception {
	  refLogin.dologin(driver);
	  Org.OrgLink(driver).click();
	  project.prolink(driver).click();
	  project.proname(driver).sendKeys("my firstpro 2");
	  Thread.sleep(2000);
	  project.backGround(driver).sendKeys("Invest in the growth of your business by using Twitter Ads to reach more potential customers.");
	  Thread.sleep(2000);
	  project.saveBtn(driver).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.navigate().to("http://test.ravabe.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
