package Test;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.Screenshot2;



public class Testlistner extends Basetest implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println(" test has started");
	}
	public void onTestFailure(ITestResult result) {
	try {
			Screenshot2.teakeScreenShot(driver, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
		//System.out.println("test has failure");
		


	}
	public void onTestSuccess(ITestResult result) {
		System.out.println(" Test r Sucesss");
	}
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() +" Test has skipped");
	}

}
