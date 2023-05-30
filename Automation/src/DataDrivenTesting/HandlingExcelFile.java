package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream fis =new FileInputStream("./data/JaleelDetails.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
     String data = wb.getSheet("AJ").getRow(1).getCell(1).getStringCellValue();
     System.out.println(data);
     FileOutputStream fos =new FileOutputStream("./data/JaleelDetails.xlsx");
     wb.getSheet("AJ").getRow(1).getCell(5).setCellValue("pass");
     wb.write(fos);
     wb.close();
	}

}
