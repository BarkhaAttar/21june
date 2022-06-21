package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaSignuppage {
	@FindBy(xpath="")private WebElement mobile;
	@FindBy(xpath="")private WebElement  continuebutton;
	@FindBy(xpath="")private WebElement nri;
	
	
	
	public ZerodaSignuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void entermobile(String number) {
		mobile.sendKeys(number);
	}
	public void clickoncontinue() {
		continuebutton.click();
	}
	public void clickonopen() {
		nri.click();
	}

}
