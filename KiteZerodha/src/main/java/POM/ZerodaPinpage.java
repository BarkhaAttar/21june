package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodaPinpage {
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")private WebElement select;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	
	
	public ZerodaPinpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String addnumber ,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(20000));
		WebElement w1=wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(addnumber);
	}
	public void clickoncontinue() {
		select.click();
	}
	public void clickonforgot() {
		forgot.click();
	}
	public void clickonsignup() {
		signup.click();
	}
	

}
