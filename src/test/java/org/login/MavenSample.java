package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenSample {
public static void main(String[] args) throws IOException  {
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
//
		
	
	
	File file = new File("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\Drivenframe.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbook = new XSSFWorkbook(stream);
	
    Sheet sheet = workbook.getSheet("Sheet1");
//  Row row = sheet.getRow(2);
// Cell cell = row.getCell(0);
// String stringCellValue = cell.getStringCellValue();
//    System.out.println(stringCellValue);
//	
//	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue );
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}