package TestCases;

import org.testng.annotations.Test;

import Utility.Test_Helper;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignupNG {
	public static WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.navigate().to("http://alpha.ravabe.com/");
	      driver.manage().window().maximize();
	      Test_Helper.Link(driver).click();
	  }
  @Test(priority=0)
  public void blankFirstname() throws Exception {
	      Test_Helper.firstName(driver).sendKeys("");
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=1)
  public void blanksecondname() throws Exception {
	      Test_Helper.firstName(driver).sendKeys("anuj");
		  Test_Helper.lastName(driver).sendKeys("");
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=2)
  public void blankemail() throws Exception {
	      Test_Helper.firstName(driver).sendKeys("anuj");
		  Test_Helper.lastName(driver).sendKeys("chauhan");
		  Test_Helper.Email(driver).sendKeys("");
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=3)
  public void invalidemail() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("anuj");
	  Test_Helper.lastName(driver).sendKeys("chauhan");
	  Test_Helper.Email(driver).sendKeys("xyz");
      Test_Helper.signup(driver).click();
  }
  @Test(priority=4)
  public void blankpwd() throws Exception{
	      Test_Helper.firstName(driver).sendKeys("anuj");
		  Test_Helper.lastName(driver).sendKeys("chauhan");
		  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
		  Test_Helper.Password(driver).sendKeys("");
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=5)
  public void invalidpwd() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("anuj");
	  Test_Helper.lastName(driver).sendKeys("chauhan");
	  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	  Test_Helper.Password(driver).sendKeys("1234");
      Test_Helper.signup(driver).click();
	  
  }
  @Test(priority=6)
  public void acceptterms() throws Exception{
	      Test_Helper.firstName(driver).sendKeys("anuj");
		  Test_Helper.lastName(driver).sendKeys("chauhan");
		  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
		  Test_Helper.Password(driver).sendKeys("Anuj123456");
		  Test_Helper.acceptTerms(driver);
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=7)
  public void timezone() throws Exception{
	      Test_Helper.firstName(driver).sendKeys("anuj");
		  Test_Helper.lastName(driver).sendKeys("chauhan");
		  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
		  Test_Helper.Password(driver).sendKeys("Anuj123456");
		  Test_Helper.selectTimeZone(driver);
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=8)
  public void signup() throws Exception{
	      Test_Helper.firstName(driver).sendKeys("anuj");
		  Test_Helper.lastName(driver).sendKeys("chauhan");
		  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
		  Test_Helper.Password(driver).sendKeys("Anuj123456");
		  Test_Helper.acceptTerms(driver).click();
		  Test_Helper.selectTimeZone(driver);
	      Test_Helper.signup(driver).click();
  }
  @Test(priority=9)
  public void blankfields() throws Exception{
	      Test_Helper.firstName(driver).sendKeys("");
		  Test_Helper.lastName(driver).sendKeys("");
		  Test_Helper.Email(driver).sendKeys("");
		  Test_Helper.Password(driver).sendKeys("");
		  Test_Helper.acceptTerms(driver);
		  Test_Helper.signup(driver).click();
  }
  @Test(priority=10)
  public void invalidfristname() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("@%!*");
	  Test_Helper.lastName(driver).sendKeys("chauhan");
	  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	  Test_Helper.Password(driver).sendKeys("Anuj123456");
	  Test_Helper.acceptTerms(driver).click();
	  Test_Helper.selectTimeZone(driver);
      Test_Helper.signup(driver).click();
  }
  @Test(priority=11)
  public void invalidlastname() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("anuj");
	  Test_Helper.lastName(driver).sendKeys("@%!*");
	  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	  Test_Helper.Password(driver).sendKeys("Anuj123456");
	  Test_Helper.acceptTerms(driver).click();
	  Test_Helper.selectTimeZone(driver);
      Test_Helper.signup(driver).click();
  }
  @Test(priority=12)
  public void invalidemailformat() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("anuj");
	  Test_Helper.lastName(driver).sendKeys("chauhan");
	  Test_Helper.Email(driver).sendKeys("anuj@%!*@ravabe.com");
	  Test_Helper.Password(driver).sendKeys("Anuj123456");
	  Test_Helper.acceptTerms(driver).click();
	  Test_Helper.selectTimeZone(driver);
      Test_Helper.signup(driver).click();
	  
  }
  @Test(priority=13)
  public void invalidpwdformat() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("anuj");
	  Test_Helper.lastName(driver).sendKeys("chauhan");
	  Test_Helper.Email(driver).sendKeys("anuj@ravabe.com");
	  Test_Helper.Password(driver).sendKeys("@%!*$%#%");
	  Test_Helper.acceptTerms(driver).click();
	  Test_Helper.selectTimeZone(driver);
      Test_Helper.signup(driver).click();
  }
  @Test(priority=14)
  public void invalidvalues() throws Exception{
	  Test_Helper.firstName(driver).sendKeys("@%!*$%#%");
	  Test_Helper.lastName(driver).sendKeys("@%!*$%#%");
	  Test_Helper.Email(driver).sendKeys("@%!*$%#%");
	  Test_Helper.Password(driver).sendKeys("@%!*$%#%");
	  Test_Helper.acceptTerms(driver).click();
	  Test_Helper.selectTimeZone(driver);
      Test_Helper.signup(driver).click();
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
