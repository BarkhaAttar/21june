package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodaForgotpage;

public class ZerodaForgottest {
	
    WebDriver driver;
    
    @Test
    public void browser() {
    driver=Browser2.openbrowser();
    }
    
    @Test
    public void clickonradio1() {
    	ZerodaForgotpage zerodaforgotpage=new ZerodaForgotpage(driver);
    	zerodaforgotpage.clickonradio1();
    }}
    
    
