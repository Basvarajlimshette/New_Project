package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

	
	FileInputStream fis;
	
	XSSFWorkbook workbook;
	
	XSSFSheet sheet;
	
	public ExcelReader1(String path,String sheetName) {
		
		try {
			fis=new FileInputStream("path");
			workbook=new XSSFWorkbook();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
