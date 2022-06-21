package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zerodalogoinkeyword2 {
	
	
	@Test
	public  void testa() {
		System.out.println(" testa executed");
	}
	@Test
    public void testb() {
		System.out.println(" testb executed");
	}
	@Test
	public void testc() {
		System.out.println(" testc executed");
	}
	 @BeforeClass
	 public void beforeclass() {
		 System.out.println(" beforeclass executed");
	 }
	 
	 @AfterClass
	 public void afterclass() {
		 System.out.println(" afterclass executed");
		 
	 }
	 
	 @BeforeMethod
	 public void beforemethod() {
		 System.out.println(" beforemethod executed");
		 
		  }
	 @AfterMethod
	 public void aftermethod() {
		 System.out.println(" aftermethod executed");
		  }
	 
	 
	 
	 
	
	
	

}
