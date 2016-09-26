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

	private static String addlinkxpath;
	private static String addpostxpath;
	private static String orgsectionxpath;
	private static String projectsectionxpath;
	private static String channelsectionxpath;
	private static String posttypesectionxpath;
	

	private static String addbuttonXpath;
	private static String addprojectXpath;
	private static String selectbuttonXpath;
	private static String pronameid;
	private static String prodescriptionXpath;
	private static String prochannelXpath;
	private static String prosaveXpath;
	private static String orgsectionXpath;
	private static String proteamid;
	private static String addemailid;

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

			addlinkxpath=prop.getProperty("add-link-xpath");
			addpostxpath=prop.getProperty("add-post-xpath");
			orgsectionxpath=prop.getProperty("org-section-xpath");
			projectsectionxpath=prop.getProperty("project-section-xpath");
			channelsectionxpath=prop.getProperty("channel-section-xpath");
			posttypesectionxpath=prop.getProperty("post-type-section-xpath");

			addbuttonXpath=prop.getProperty("add-button-xpath");
			addprojectXpath=prop.getProperty("add-project-xpath");
			selectbuttonXpath=prop.getProperty("select-button-xpath");
			pronameid=prop.getProperty("pro-name-id");
			prodescriptionXpath=prop.getProperty("pro-description-xpath");
			prochannelXpath=prop.getProperty("pro-channel-xpath");
			prosaveXpath=prop.getProperty("pro-save-xpath");
			orgsectionXpath=prop.getProperty("org-section-xpath");
			proteamid=prop.getProperty("pro-team-id");
			addemailid=prop.getProperty("email-add-xpath");
			

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

	//add post
	public static WebElement AddLink(WebDriver driver){
		element=driver.findElement(By.xpath(addlinkxpath));
		return element;
	}
	public static WebElement AddPost(WebDriver driver){
		element=driver.findElement(By.xpath(addpostxpath));
		return element;
	}
	public static WebElement OrgSection(WebDriver driver){
		element=driver.findElement(By.xpath(orgsectionxpath));
		return element;
	}
	public static WebElement ProjectSection(WebDriver driver){
		element=driver.findElement(By.xpath(projectsectionxpath));
		return element;
	}
	public static WebElement ChannelSection(WebDriver driver){
		element=driver.findElement(By.xpath(channelsectionxpath));
		return element;
	}
	public static WebElement PostTypeSection(WebDriver driver){
		element=driver.findElement(By.xpath(posttypesectionxpath));
		return element;
	}
	

	
	/*
	 * Add project 
	 */
	 public static WebElement addbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(addbuttonXpath));
		   return element;
	   }
	 public static WebElement addproject(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(addprojectXpath));
		   return element;
	   }
	 public static WebElement selectbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(selectbuttonXpath));
		   return element;
	   }
	 public static WebElement proName(WebDriver driver)
	   {
		   element=driver.findElement(By.id(pronameid));
		   return element;
	   }
	 public static WebElement proDescription(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(prodescriptionXpath));
		   return element;
	   }
	 public static WebElement prochannel(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(prochannelXpath));
		   return element;
	   }
	 public static WebElement savebtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(prosaveXpath));
		   return element;
	   }
	 public static WebElement orgsection(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(orgsectionXpath));
		   return element;
	   }
	 public static WebElement proteam(WebDriver driver)
	   {
		   element=driver.findElement(By.id(proteamid));
		   return element;
	   }
	 public static WebElement addemailbtn(WebDriver driver)
	   {
		   element=driver.findElement(By.xpath(addemailid));
		   return element;
	   }
	 
	 

}
