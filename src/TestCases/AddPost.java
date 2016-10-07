package TestCases;

import org.testng.annotations.Test;

import Utility.Org;
import Utility.TakeVideo;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AddPost {
	private static ScreenRecorder scr;
public static WebDriver driver=null;

  @BeforeMethod
  public void beforeMethod() {
	    driver=new ChromeDriver();
		refLogin.dologin(driver);
  }
  @Test(enabled=false)
  public void addPost() throws IOException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(0).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(3).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
      Org.publishbtn(driver).click();
      
	  

  }
  @Test(enabled=false)
  public void postlink() throws IOException, InterruptedException {
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
	 // Org.postArea(driver).sendKeys(description);
	  Org.Linktxt(driver).sendKeys(Linkpost);
	  Org.insertbtn(driver).click();
	  Thread.sleep(3000);
      Org.publishbtn(driver).click(); 	  
  }
  @Test(enabled=false)
  public void linkwithtext() throws IOException, InterruptedException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
  }
  @Test(enabled=false)
  public void googlelinkpost() throws IOException, InterruptedException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
  }
  @Test(enabled=false)
  public void googlwithtext() throws IOException, InterruptedException{
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
	  
  }
  @Test(enabled=false)
  public void cotentwithtag() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	 
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  //channelsection.get(3).click();
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(3).click();
	  System.out.print("Enter post Tag::");
      String Tagpost=br.readLine();
      Org.Nametag(driver).sendKeys(Tagpost);
      Org.NametagBtn(driver).click();
      Thread.sleep(3000);
      Org.publishbtn(driver).click();
      scr.stop();
  }
  @Test(enabled=false)
  public void contentlinktag() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  attachsection.get(3).click();
	  System.out.print("Enter post Tag::");
      String Tagpost=br.readLine();
      Org.Nametag(driver).sendKeys(Tagpost);
      Org.NametagBtn(driver).click();
      Thread.sleep(3000);
      Org.publishbtn(driver).click();
      scr.stop();
      
  }
  @Test(enabled=false)
  public void Imagewithcontent() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectTwitter(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(0).click();
	  Org.ImageUpload(driver).click();
	  try {
			Runtime.getRuntime().exec("E://AutoIT//Upload File.exe");
			Thread.sleep(5000);
	     } 
	      catch (Exception e) {
			//TODO Auto-generated catch block
	    	  System.out.println(e.getMessage());
		
	      }
	  Thread.sleep(6000);
      Org.publishbtn(driver).click();
      scr.stop();
  }
  @Test(enabled=false)
  public void postfb() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
      Org.publishbtn(driver).click();
      scr.stop();
  }
  @Test(enabled=false)
  public void linkwithcontent() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
	  scr.stop();
	  
	  
  }
  @Test(enabled=false)
      public void googlelink() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(3000);
	  Org.publishbtn(driver).click();
	  scr.stop();  
  }
  @Test(enabled=false)
  public void googlewithcontent() throws Exception{
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" "+description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.googledropdown(driver);
      Org.insertbtn(driver).click();
	  Thread.sleep(5000);
	  Org.publishbtn(driver).click();
	  scr.stop();
  }
  @Test(enabled=false)
  public void contentimagefb() throws Exception{
	 
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	  List<WebElement> attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(0).click();
	  Org.ImageUpload(driver).click();
	  try {
			Runtime.getRuntime().exec("E://AutoIT//Upload File.exe");
			Thread.sleep(5000);
	     } 
	      catch (Exception e) {
			//TODO Auto-generated catch block
	    	  System.out.println(e.getMessage());
		
	      }
	  Thread.sleep(5000);
	  Org.ImagecancelBtn(driver).click();
	  Thread.sleep(5000);
	  Org.publishbtn(driver).click();
	  
  }
  @Test
  public void contentlinkimage() throws Exception{
	  List<WebElement>attachsection;
	  scr=TakeVideo.takeVideo(scr);
	  scr.start();
	 
	  Org.addbtn(driver).click();
	  Org.AddPost(driver).click();
	  List<WebElement> orgsection=Org.OrgSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<orgsection.size();i++){
		  System.out.println(orgsection.get(i).getText());
	  }
	  orgsection.get(2).click();
	  List<WebElement> prosection=Org.ProjectSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<prosection.size();i++){
		  
	  }
	  prosection.get(1).click();
	  List<WebElement> channelsection=Org.ChannelSection(driver).findElements(By.tagName("a"));
	  for(int i=0;i<channelsection.size();i++){
		  System.out.println(channelsection.get(i).getText());
	  }
	  Org.selectfacebook(driver).click();
	  Org.AddPostBtn(driver).click();
	  InputStreamReader input= new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(input);
      System.out.print("Enter post description::");
      String description=br.readLine();
	  Org.postArea(driver).sendKeys(" " +description);
	   attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(0).click();
	  Org.ImageUpload(driver).click();
	  try {
			Runtime.getRuntime().exec("E://AutoIT//Upload File.exe");
			Thread.sleep(5000);
	     } 
	      catch (Exception e) {
			//TODO Auto-generated catch block
	    	  System.out.println(e.getMessage());
		
	      }
	  Thread.sleep(5000);
	  Org.ImagecancelBtn(driver).click();
	  Thread.sleep(5000);
	   attachsection=Org.linktaglocation(driver).findElements(By.tagName("a"));
	  for(int i=0;i<attachsection.size();i++){
		  System.out.println(attachsection.get(i).getText());
	  }
	  attachsection.get(2).click();
	  System.out.print("Enter post Link::");
      String Linkpost=br.readLine();
      Org.Linktxt(driver).sendKeys(Linkpost);
      Org.insertbtn(driver).click();
      Thread.sleep(3000);
      Org.linkcancelBtn(driver).click();
      Thread.sleep(5000);
	  Org.publishbtn(driver).click();
	  
	  
	  scr.stop();
  }
  
  
  @AfterMethod
  public void afterMethod() {
	   // driver.close();
  }

}
