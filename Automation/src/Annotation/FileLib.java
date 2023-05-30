package Annotation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String getPropertyData(String key) throws IOException {
	FileInputStream fis= new FileInputStream("./data/actitime.property");
	Properties p=new Properties();
	p.load(fis);
    String data = p.getProperty(key);
	return data;
}
	public String getexceldata(String sheetname,int row,int cell ) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./data/TestScript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
	   String data=wb.getSheet(sheetname).getRow(cell).getCell(cell).getStringCellValue();
		return data;
	}
}
