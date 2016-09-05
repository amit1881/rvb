package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import Utility.Org;

public class AddOrganization {
	public static WebDriver driver=null;
	
	public static void main(String args[]) throws InterruptedException{
		//driver=new HtmlUnitDriver();
		driver=new ChromeDriver();
		refLogin.dologin(driver);
		Org.Orgname(driver).sendKeys("test organization1");
		Org.OrgDiscription(driver).sendKeys("its a social organization");
		Org.OrgCompanysite(driver).sendKeys("ravabe.com");
		Org.OrgCompanyadd(driver).click();
		Org.OrgSave(driver).click();
		//driver.switchTo().window(arg0);
		//driver.findElement(By.className("confirm"));
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		//driver.close();
		/*
		Set <String> set1=driver.getWindowHandles();
	    Iterator <String> win1=set1.iterator();
	    String parent=win1.next();
	    String child=win1.next();
	    driver.switchTo().window(child);
	    driver.findElement(By.className("confirm")).click();
	    //Thread.sleep(5000);
        //driver.switchTo().window(parent);
         * 
         */
		driver.findElement(By.className("confirm")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div[7]/div/button")).click();
	}

}
