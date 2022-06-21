package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodaLoginpage;
import POM.ZerodaPinpage;
import Utility.Parameterization2;
@Listeners(Testlistner.class)
public class ZerodaPinpagetest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void browser() {
		 driver=Browser2.openbrowser();
		}
	
	
	@Test
	public void loginwithvalipintest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodaLoginpage zerodaloginpage=new ZerodaLoginpage(driver);
		String username=Parameterization2.getdata(0,1);
		String password=Parameterization2.getdata(1, 1);
		zerodaloginpage.enteruserID(username);
		zerodaloginpage.enterpass(password);
		zerodaloginpage.clickonlogin();
		Thread.sleep(5000);
		ZerodaPinpage zerodapinpage=new ZerodaPinpage(driver);
		String addnumber=Parameterization2.getdata(2, 1);
		System.out.println(addnumber);
		zerodapinpage.enterpin(addnumber,driver);
		zerodapinpage.clickoncontinue();
		}
	

	
	
}
