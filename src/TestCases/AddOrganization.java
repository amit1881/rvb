package TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Org;

public class AddOrganization {
	public static WebDriver driver=null;
	@BeforeMethod
	public void beforeMethod(){
		driver=new ChromeDriver();
		refLogin.dologin(driver);
	}
	@Test(enabled=true)
	public void addOrg() {
		Org.Orgname(driver).sendKeys("test-organization-september");
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
		//driver.findElement(By.className("confirm")).click();
		//driver.findElement(By.xpath("html/body/div[5]/div[7]/div/button")).click();
	}
	@Test(enabled=false)
	public void addDuplicateOrg() {
		Org.Orgname(driver).sendKeys("test-organization-september");
		Org.OrgDiscription(driver).sendKeys("its a social organization");
		Org.OrgCompanysite(driver).sendKeys("ravabe.com");
		Org.OrgCompanyadd(driver).click();
		Org.OrgSave(driver).click();
		WebElement confirmdialogue=Org.SweetAlert(driver);
		List<WebElement> confirmdialogue_items=confirmdialogue.findElements(By.tagName("p"));
		System.out.println(confirmdialogue_items.size());
		System.out.println(confirmdialogue_items.get(0).getText());
		Org.ConfirmDialogue(driver).click();
		
	}
	@AfterMethod
	public void afterMethod(){
		driver.close();
	}
	

}
