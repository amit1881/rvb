package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Org {
	private static WebElement element=null;
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

	 public static WebElement Orgname (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/section[1]/div/div[1]/div[1]/input"));
		   return element;
	   }
      //org discription 
	 public static WebElement OrgDiscription (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/section[1]/div/div[1]/div[2]/textarea"));
		   return element;
	   }
	 //org add people 
	 public static WebElement OrgAddpeople (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='email_value']"));
		   return element;
	   }
	 //org add people btn
	 public static WebElement OrgAddpeoplebtn (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/section[2]/div/div/div[1]/div/span/img"));
		   return element;
	   }
	 //company 
	 public static WebElement OrgCompanysite (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='company']"));
		   return element;
	   }
	 //company add btn
	 public static WebElement OrgCompanyadd (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/section[1]/div/div[2]/div[2]/div/button"));
		   return element;
	   }
	 //Save btn
	 public static WebElement OrgSave (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/div/div/div/button[1]"));
		   return element;
	   }
	 //cancel button 
	 public static WebElement OrgCancel (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='Organizationctr']/form/div/div/div/div/button[2]"));
		   return element;
	   }
      //Add Image
	 public static WebElement AddImage (WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(".//*[@id='file-uploader']/div"));
		   return element;
	   }
	
}
