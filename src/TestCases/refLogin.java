package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Test_Helper;

public class refLogin {
	public static  WebDriver driver;
	public static void main(String args[]){
	refLogin.dologin(driver);
	}
	 public static void dologin (WebDriver driver){
		 // driver = new ChromeDriver();
		// driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      driver.navigate().to("http://test.ravabe.com/");
	      driver.manage().window().maximize();
	      Test_Helper.EmailAddress(driver).sendKeys("anuj@ravabe.com");
		      Test_Helper.LoginPassword(driver).sendKeys("Anuj123456");
		      Test_Helper.Login(driver).click();
	 }
	

}
