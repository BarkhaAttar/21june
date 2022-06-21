package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodaHomepage;
import POM.ZerodaLoginpage;
import POM.ZerodaPinpage;
import Utility.Parameterization2;

public class Zerodahomepagetest {
	
	WebDriver driver;
	 @Test
	 public void browser() {
		 driver=Browser2.openbrowser();
	 }
	 
	 @Test
	 public void clickonZerodahomepagetest() throws EncryptedDocumentException, IOException, InterruptedException {
		 ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
			String username=Parameterization2.getdata(0,1);
			String password=Parameterization2.getdata(1, 1);
			zerodaloginpage.enteruserID(username);
			zerodaloginpage.enterpass(password);
			zerodaloginpage.clickonlogin();
			ZerodaPinpage zerodapinpage=new ZerodaPinpage(driver);
			String addnumber=Parameterization2.getdata(2, 1);
			System.out.println(addnumber);
			zerodapinpage.enterpin(addnumber,driver);
			zerodapinpage.clickoncontinue();
			ZerodaHomepage zerodahomepage=new ZerodaHomepage (driver);
			Thread.sleep(1000);
			String address=Parameterization2.getdata(3, 1);
			 zerodahomepage.clickonsearch(address);
			 zerodahomepage.clickonbuy(driver);
			zerodahomepage.clickonradiobsc();
			zerodahomepage.clickonitraday();
			zerodahomepage.clickonmarket();
			zerodahomepage.clickonlimit();
			zerodahomepage.clickonstoploss();
			zerodahomepage.clickonstoplosslimitmarket();
	         zerodahomepage.clickonbuy();
//			zerodahomepage.clickontoggle();
//			zerodahomepage.clickonsellmarket();
//			zerodahomepage.clickonselllimitorder();
//			zerodahomepage.clickonsellstoploss();
//			zerodahomepage.clickonselltoplossmarket();
//			zerodahomepage.clickonssubmit();
//			Thread.sleep(10000);
//			zerodahomepage.clickoncancel();
			zerodahomepage.clickonsell(driver,address);
			zerodahomepage.clickonintradaysell();
			zerodahomepage.clickonsellmarket();
			zerodahomepage.clickonselllimitorder();
			zerodahomepage.clickonsellstoploss();
			zerodahomepage.clickonselltoplossmarket();
			zerodahomepage.clickonssubmit();
			
		//	zerodahomepage.clickoncancel();
			
			zerodahomepage.clickonchart(driver, address);
			zerodahomepage.clickondelete(driver, address);
//			Thread.sleep(1000);
//			zerodahomepage.clickondelete();


	 }
	
	

}
 