package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.Org;

public class AddOrganization {
	public static WebDriver driver=null;
	
	public static void main(String args[]){
		driver=new ChromeDriver();
		refLogin.dologin(driver);
		Org.Orgname(driver).sendKeys("test organization1");
		Org.OrgDiscription(driver).sendKeys("its a social organization");
		Org.OrgCompanysite(driver).sendKeys("ravabe.com");
		Org.OrgCompanyadd(driver).click();
		Org.OrgSave(driver).click();
		//driver.close();
	}

}
