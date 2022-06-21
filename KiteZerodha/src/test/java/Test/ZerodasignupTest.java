package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodaLoginpage;
import POM.ZerodaPinpage;
import POM.ZerodaSignuppage;
import Utility.Parameterization2;

public class ZerodasignupTest {
	
	
	WebDriver driver;
	
	@Test
	public void browser() {
		driver=Browser2.openbrowser();
	}
	 @Test
	 public void loginwithnumbertest() throws EncryptedDocumentException, IOException{
		 ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
			String username =Parameterization2.getdata(0, 1);
			String password=Parameterization2.getdata(1, 1);
			zerodaloginpage.enteruserID(username);
			zerodaloginpage.enterpass(password);
			zerodaloginpage.clickonlogin();
			ZerodaPinpage zerodapinpage=new ZerodaPinpage(driver);
			String addnumber=Parameterization2.getdata(2, 1);
			System.out.println(addnumber);
			zerodapinpage.enterpin(addnumber,driver);
			zerodapinpage.clickoncontinue();
	 
		 ZerodaSignuppage zerodasignuppage=new ZerodaSignuppage(driver);
		 String mobnumber=Parameterization2.getdata(3, 1);
		 zerodasignuppage.entermobile(mobnumber);
		 zerodasignuppage.clickoncontinue();
		 }
	 
	 @Test
	 public void loginwithcontinuetest() {
		 ZerodaSignuppage zerodasignuppage=new ZerodaSignuppage(driver);
		 zerodasignuppage.clickoncontinue();
		 
	 }
	 @Test
	 public void loginwithopentest()
	 {
		 ZerodaSignuppage zerodasignuppage=new ZerodaSignuppage(driver);
		 zerodasignuppage.clickonopen();
	 }
	

}
