package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Org {
	private static WebElement element=null;
	private static List<WebElement> lielement=null;
	private static String orgnameXpath;
	private static String orgdescriptionXpath;
	private static String companywebsiteId;
	private static String companywebsiteaddbtnXpath;
	private static String orgsavebtnXpath;
	private static String confirmClass;
	private static String sweetAlertClass;
	public static void getPageElements(){
		Properties prop = new Properties();
		InputStream input= null;

		try {

			input = new FileInputStream("C://Users//amit 1//workspace-mars//rvb//src//properties//org-elements.properties");

			// load a properties file
			prop.load(input);
            //get the property value
			orgnameXpath=prop.getProperty("org-name-xpath");
			orgdescriptionXpath=prop.getProperty("org-description-xpath");
			companywebsiteId=prop.getProperty("company-website-id");
			companywebsiteaddbtnXpath=prop.getProperty("company-website-addbtn-xpath");
			orgsavebtnXpath=prop.getProperty("org-savebtn-xpath");
			confirmClass=prop.getProperty("confirm-class");
			sweetAlertClass=prop.getProperty("sweet-alert-class");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	static {
	    getPageElements();
	  }

	
	/*
	   *Add organization 
	    */
	 public static WebElement OrgLink(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[2]/nav/div/div[2]/ul/li[2]"));
		   return element;
	   }
	 //Add org. button
	 public static WebElement AddOrg(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div/div[1]/a/span"));
		   return element;
	   }
	 //org name 

	 public static WebElement Orgname(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgnameXpath));
		   return element;
	   }
      //org description 
	 public static WebElement OrgDiscription(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgdescriptionXpath));
		   return element;
	   }
	 //org add people 
	 public static WebElement OrgAddpeople(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email_value']"));
		   return element;
	   }
	 //org add people btn
	 public static WebElement OrgAddpeoplebtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/section[2]/div/div/div[1]/div/span/img"));
		   return element;
	   }
	 //company 
	 public static WebElement OrgCompanysite(WebDriver driver)
	   {
		   element=driver.findElement(By.id(companywebsiteId));
		   return element;
	   }
	 //company add btn
	 public static WebElement OrgCompanyadd(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(companywebsiteaddbtnXpath));
		   return element;
	   }
	 //Save btn
	 public static WebElement OrgSave(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgsavebtnXpath));
		   return element;
	   }
	 //cancel button 
	 public static WebElement OrgCancel(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/div/div/div/button[2]"));
		   return element;
	   }
      //Add Image
	 public static WebElement AddImage(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='file-uploader']/div"));
		   return element;
	   }
	 public static WebElement ConfirmDialogue(WebDriver driver){
		 element=driver.findElement(By.className(confirmClass));
		 return element;
	 }
	public static WebElement SweetAlert(WebDriver driver){
		element=driver.findElement(By.className(sweetAlertClass));
		return element;
	}
}
