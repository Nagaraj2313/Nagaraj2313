package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ChangeValueXL {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\Drivenframe.xlsx");
	
	FileInputStream stream = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet1");
	Row row = sheet.getRow(2);
	Cell cell = row.getCell(0);
	String ss = cell.getStringCellValue();
	System.out.println(ss);
	if (ss.equals("raj")) {
		cell.setCellValue("loser");
		
	}
	FileOutputStream output = new FileOutputStream(f);
	book.write(output);
	System.out.println("okva");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
