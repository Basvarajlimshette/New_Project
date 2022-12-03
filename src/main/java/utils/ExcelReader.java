package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
//	FileInputStream fis;
//	
//	XSSFWorkbook workbook;
//	
//	XSSFSheet sheet;
	public static void main (String []args) throws IOException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\final copy diploma project\\ExcelReader.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	int rowNum= sheet.getPhysicalNumberOfRows();
	
	int colNum=sheet.getLastRowNum();
	
	//XSSFRow row=sheet.getRow(0);
	System.out.println(rowNum);
	System.out.println(colNum);
	
    for(int i=0;i<rowNum;i++) {
    XSSFRow row=sheet.getRow(i);
    System.out.println("---------");
    
    for(int j=0;j<colNum;j++) {
    	System.out.println(row.getCell(j));
    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//for perticular row with Numeric and String value 
//	
//    	XSSFRow row=sheet.getRow(2);
//  
//        for(int j=0;j<colNum;j++) {
//    	if(row.getCell(j).getCellType().equals(CellType.NUMERIC)) {
//    		System.out.println(row.getCell(j).getNumericCellValue());
//    	}
//    	else if(row.getCell(j).getCellType().equals(CellType.STRING))
//    	System.out.println(row.getCell(j).getStringCellValue());
//    	
//    }
	
	
 }
}
