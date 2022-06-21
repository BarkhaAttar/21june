package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser2;

public class Screenshot2 {
	public static void teakeScreenShot(WebDriver driver,String name) throws IOException {
		String d=Screenshot2.date();
	//WebDriver driver1=Browser2.openbrowser("https://vctcpune.com/");
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\ADMIN\\Desktop\\New folder// "+ name+ d +".jpg"); 
	FileHandler.copy(source,destination);
	}


public static String date() {
	LocalDateTime currentTime=LocalDateTime.now();
	String date=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss").format(LocalDateTime.now());
	return date;
}
}