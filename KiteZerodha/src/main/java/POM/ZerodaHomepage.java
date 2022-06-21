package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POJO.Browser2;

public class ZerodaHomepage {
	  @FindBy(xpath="//input[@type='text']")private WebElement search;
	  @FindBy(xpath="(//span[@class='symbol'])[1]")private WebElement tata;
	  @FindBy(xpath="(//button[@type='button'])[1]")private WebElement buy;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[1]")private WebElement bsc;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[6]")private WebElement intraday;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[8]")private WebElement market;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[9]")private WebElement limit;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[10]")private WebElement stoploss;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[11]")private WebElement stoplosslimit;
	  @FindBy(xpath="//button[@type='submit']") private WebElement submitt;
	  @FindBy(xpath="(//button[@type='button'])[2]")private WebElement sell1;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[8]")private WebElement sintraday;
	 // @FindBy(xpath="//label[@class='su-switch-control']")private WebElement toggle;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[9]")private WebElement smarket;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[10]")private WebElement slimit;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[11]")private WebElement sstoploss;
	  @FindBy(xpath="(//label[@class='su-radio-label'])[12]")private WebElement sstoplosslimit;
	  @FindBy(xpath="//button[@type='submit']")private WebElement sell;
	  //@FindBy(xpath="(//button[@type='button'])[3]")private WebElement cancel;
	 @FindBy(xpath="(//button[@class='button-outline'])[1]")private WebElement chart;
	 @FindBy(xpath="//span[@class='icon icon-trash']")private WebElement delete;
	  
	 
	  
	  
	  
	  public ZerodaHomepage( WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  public void clickonsearch(String address) {
		  search.click();
		  search.sendKeys(address);
	  }
	  public void clickonbuy(WebDriver driver) {
		  Actions act=new Actions(driver);
		  act.moveToElement(tata);
		  act.click();
		  act.perform();
		  act.moveToElement(buy);
		  act.perform();
		  act.click();
		  act.perform();
	  }
	  public void clickonradiobsc() throws InterruptedException {
		  Thread.sleep(1000);
		  bsc.click();	  
		  	  }
	  public void clickonitraday() {
		  intraday. click();
		  
	  }
	  public void  clickonmarket() {
		  market.click();
	  }
	  public void clickonlimit() throws InterruptedException  {
		  Thread.sleep(1000);
		  limit.click();
	  }
	  public void clickonstoploss() throws InterruptedException {
		  Thread.sleep(0);
		  stoploss.click();
	  }
	  
	 
	  public void clickonstoplosslimitmarket() throws InterruptedException  {
		  Thread.sleep(1000);
		 stoplosslimit.click();
	  }
	  public void clickonbuy() throws InterruptedException {
		  Thread.sleep(2000);
		  submitt.click();
	  }
//	  public void clickontoggle() throws InterruptedException {
//		  Thread.sleep(1000);
//		  toggle.click();
//	  }
	  public void clickonsell(WebDriver driver,String address) throws InterruptedException {
		  Thread.sleep(1000);
		  search.click();
		  search.sendKeys(address);
		  Actions act=new Actions(driver);
		  act.moveToElement(tata);
		  act.click();
		  act.perform();
		  act.moveToElement(sell1);
		  act.click();
		  act.perform();
		  
	  }
	  public void clickonintradaysell() {
		  sintraday.click();
	  }

	  public void clickonsellmarket() throws InterruptedException {
		  Thread.sleep(1000);
		  slimit.click();
	  }
	  public void clickonselllimitorder() throws InterruptedException {
		  Thread.sleep(1000);
		  smarket.click();
	  }
	  public void clickonsellstoploss() throws InterruptedException {
		 Thread.sleep(1000);
		 sstoploss.click();
	  }
	  public void clickonselltoplossmarket() throws InterruptedException {
		  Thread.sleep(1000);
		  sstoplosslimit.click();
	  }
	  public void clickonssubmit() throws InterruptedException {
		  Thread.sleep(2000);
		  sell.click();
		  
	  }
//	  public void clickoncancel() throws InterruptedException {
//		  Thread.sleep(1000);
//		  cancel.click();
//	  }
		  public void clickonchart(WebDriver driver,String address) throws InterruptedException {
		  Thread.sleep(1000);
		  search.click();
		  search.sendKeys(address);
		  Actions act=new Actions(driver);
		  act.moveToElement(tata);
		  act.click();
		  act.perform();
		  act.moveToElement(chart);
		  act.click();
		  act.perform();
		   }
	  public void clickondelete(WebDriver driver,String address) throws InterruptedException {
		  
		  search.click();
		  search.sendKeys(address);
		  Actions act=new Actions(driver);
		  act.click();
		  act.moveToElement(tata);
		  Thread.sleep(1000);
		  act.moveToElement(delete);
		  act.click();
		  act.perform();
		  }
//	  public void clickondel() {
//		  
//		  delete.click();
//		  
//	  }
	 
	
}
	
	
	
	