package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaLoginpage {
	@FindBy(xpath="//input[@id='userid']")private WebElement email;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgotid;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement usererrorid;
	
	
	
	public ZerodaLoginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enteruserID(String user) {
		email.sendKeys(user);
	}
	public void enterpass(String pass) {
		password.sendKeys(pass);
	}
	public void clickonlogin() {
		login.click();
	}
	public void clickonforgot() {
		forgotid.click();
	}
	public void clickonsignup() {
		signup.click();
	}
	public String isuseridgettext() {
		
		String text=usererrorid.getText();
		return text;

	}
	
	

}
