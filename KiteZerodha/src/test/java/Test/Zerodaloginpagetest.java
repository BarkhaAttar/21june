package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Browser2;
import POM.ZerodaLoginpage;
import Utility.Parameterization2;


@Listeners(Testlistner.class)
public class Zerodaloginpagetest  extends Basetest{
	//WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver=Browser2.openbrowser();
	}
	
	@Test
	public void loginwithvalidcredentialstest() throws EncryptedDocumentException, IOException {
		ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
		String username =Parameterization2.getdata(0, 1);
		String password=Parameterization2.getdata(1, 1);
		zerodaloginpage.enteruserID(username);
		zerodaloginpage.enterpass(password);
		zerodaloginpage.clickonlogin();
			
		}
	
	@Test
	public void loginwithoutcredentials() throws EncryptedDocumentException, IOException {
		ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
		zerodaloginpage.clickonlogin();
		String exp="User ID should be minimum ";
		System.out.println(exp);
		String text=zerodaloginpage.isuseridgettext();
		System.out.println(text);
		Assert.assertEquals(text, exp); //hard assert
//		SoftAssert softassert=new SoftAssert();
//		softassert.assertEquals(text, exp);
//		String username =Parameterization2.getdata(0, 1);
//		String password=Parameterization2.getdata(1, 1);
//		zerodaloginpage.enteruserID(username);
//		zerodaloginpage.enterpass(password);
//		zerodaloginpage.clickonlogin();
//		softassert.assertAll();
//		
	zerodaloginpage.enterpass("velocity");
//		
		

		
	}
	@Test
	public void loginwithforgotpasswordtest() {
		ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
		zerodaloginpage.clickonforgot();
			}
	
	@Test
	public void loginwithsignuptest() {
	ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
		zerodaloginpage.clickonsignup();
	}
	
	
}
//	@BeforeMethod
//	
//	public void closetab() {
//		driver.quit();
//	}
	
	
	


