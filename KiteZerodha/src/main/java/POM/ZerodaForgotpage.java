package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodaForgotpage {
	
	@FindBy(xpath="(//label[@class='su-radio-label'])[1]")private WebElement radio1;
	@FindBy(xpath="(//label[@class='su-radio-label'])[2]")private WebElement radio2;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement userID;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement pan;
	@FindBy(xpath="(//label[@class='su-radio-label'])[3]")private WebElement radio3;
	@FindBy(xpath="(//label[@class='su-radio-label'])[4]")private WebElement radio4;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement email;
	@FindBy(xpath="//button[@type='submit']")private WebElement reset;
	@FindBy(xpath="//p[@class='text-center']")private WebElement back;
	
public ZerodaForgotpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clickonradio1() {
	radio1.click();
}
public void clickonradio2() {
	radio2.click();
}
public void enteruserID(String useraddress) {
	userID.sendKeys(useraddress);
}

public void enterpan(String pannumber) {
	pan.sendKeys(pannumber);
}
public void clickonradio3() {
	radio3.click();
}
public void clickonradio4() {
	radio4.click();
}
public void enteremail(String emailaddress) {
	email.sendKeys(emailaddress);
}
public void clickonreset() {
	reset.click();
}
public void clickonback() {
	back.click();
}
}

