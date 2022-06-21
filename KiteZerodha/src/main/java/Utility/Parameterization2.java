package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization2 {
public static String getdata(int row,int column) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Automation\\KiteZerodha\\src\\test\\resources\\Book1.xlsx");
     String user=WorkbookFactory.create(file).getSheet("Credentials").getRow(row).getCell(column).getStringCellValue();
     return user;
}

}
