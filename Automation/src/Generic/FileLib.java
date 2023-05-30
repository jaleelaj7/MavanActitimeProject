package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getProperyData(String key) throws IOException {
	FileInputStream fis =new FileInputStream("./data/actitime.property");
	Properties p=new  Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	}
	public String getExcelData(String SheetName,int row,int col) throws IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}

}
