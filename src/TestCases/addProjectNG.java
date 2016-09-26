package TestCases;

import org.testng.annotations.Test;

import Utility.Org;
import Utility.project;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class addProjectNG {
	public static  WebDriver driver;
	WebDriverWait wait=null;
  @Test(enabled=false)
  public void testproject() throws Exception {
	  Org.addbtn(driver).click();
	  Org.addproject(driver).click();
	  List<WebElement> orgsection=Org.orgsection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(1).click();
	  Org.selectbtn(driver).click();
	  System.out.print("Would you like to continue(yes/no)::");
 	  InputStreamReader isr=new InputStreamReader(System.in);
 	  BufferedReader brd=new BufferedReader(isr);
 	  String str=brd.readLine();
 	  while(str.equals("yes")){
 	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter project Name::");
      String proname=br.readLine();
      System.out.print("Enter project Description::");
      String prodesc=br.readLine();
      Org.proName(driver).sendKeys(proname);
	  Org.proDescription(driver).sendKeys(prodesc);
	  List<WebElement> prochannel=Org.prochannel(driver).findElements(By.tagName("label"));
	  for(int i=0;i<prochannel.size();i++){
		  System.out.println(prochannel.get(i).getText());
		  prochannel.get(i).click();
	  }
	  System.out.print("Enter email id::");
      String emailid=br.readLine();
      Org.proteam(driver).sendKeys(emailid);
      Org.addemailbtn(driver).click();
	  Org.savebtn(driver).click();
	 // Org.OrgCompanysite(driver).sendKeys(orgsite);
	 // Org.OrgCompanyadd(driver).click();
	  //Org.OrgSave(driver).click();
	  System.out.print("Would you like to continue with event::");
 		 InputStreamReader isrd=new InputStreamReader(System.in);
 		 BufferedReader brdr=new BufferedReader(isrd);
 		 str=brdr.readLine();
 		 if(str.equals("no")){
 			 System.out.println("ok, thanks");
 		 }
 		 }
	  
  }
  
  @Test(enabled=true)
  public void editproject() throws Exception {
	  Org.publish(driver).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Org.editOrgSection(driver)));
	  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='diffmodule-selection']/div[2]/div/div[2]/ul")));
	  List<WebElement> editorgsection=Org.editOrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<editorgsection.size();i++){
		  System.out.println(editorgsection.get(i).getText());
	  }
	  editorgsection.get(1).click();
	  wait.until(ExpectedConditions.elementToBeClickable(Org.editprosection(driver)));
	 // Org.editprosection(driver).findElement(By.linkText("ravabe")).click();
	  List<WebElement> editprosection=Org.editprosection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<editprosection.size();i++){
		  
	  }
	  editprosection.get(1).click();
	  Org.accessbtn(driver).click();
	  System.out.print("Would you like to continue(yes/no)::");
 	  InputStreamReader isr=new InputStreamReader(System.in);
 	  BufferedReader brd=new BufferedReader(isr);
 	  String str=brd.readLine();
 	  while(str.equals("yes")){
 	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter editproject Name::");
      String editproname=br.readLine();
      System.out.print("Enter editproject Description::");
      String editprodesc=br.readLine();
      Org.editname(driver).sendKeys(editproname);
      Org.editdescription(driver).sendKeys(editprodesc);
      System.out.print("Would you like to continue with event::");
		 InputStreamReader isrd=new InputStreamReader(System.in);
		 BufferedReader brdr=new BufferedReader(isrd);
		 str=brdr.readLine();
		 if(str.equals("no")){
			 System.out.println("ok, thanks");
 	  }
 	  }
      
      
	  
	 
  }

  
  
  
  @BeforeMethod
  public void beforeMethod(){
		driver=new ChromeDriver();
		refLogin.dologin(driver);
		wait=new WebDriverWait(driver,30);
  }

  @AfterMethod(enabled=true)
  public void afterMethod() throws InterruptedException {
	  //Thread.sleep(2000);
	  //driver.close();
	  
  }

}
