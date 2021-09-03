package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.helper.DataUtil;

public class Numeric {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\Drivenframe.xlsx");
    FileInputStream stream = new FileInputStream(f);
    Workbook book = new XSSFWorkbook(stream);
    Sheet sheet = book.getSheet("Sheet1");
    for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
    	Row row = sheet.getRow(i);
    	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
    		Cell cell = row.getCell(j);
    		
    		
    		// to get number r date formet we use getcell type
    		int cellType = cell.getCellType();
    		System.out.println(cellType);
    		
   		if (cellType==1) {
    			String ss = cell.getStringCellValue();
    			System.out.println(ss);
    			}
    		
   		else if (DateUtil.isCellDateFormatted(cell)) {
   			Date dd = cell.getDateCellValue();
   		
    			SimpleDateFormat date = new SimpleDateFormat("YYYY-MMM-dd");
  			String format = date.format(dd);
   			System.out.println(format);
    		}
    		else {
   			
    			double nc = cell.getNumericCellValue();
   			long l = (long) nc;
    			String valueOf = String.valueOf(l);
   			System.out.println(valueOf);				
			}
				
			
				
		

			
		}
		
	}
	
	
	
	
	
	
	
	
}
}
