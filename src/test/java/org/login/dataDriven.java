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

public class dataDriven {
public static void main(String[] args) throws IOException {
   File file = new File("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\numeric.xlsx");
   
   FileInputStream Stream = new  FileInputStream(file);
   
   Workbook book = new XSSFWorkbook(Stream);
   //to get Sheet
   Sheet sheet = book.getSheet("Sheet1");
   //to get row
    Row row = sheet.getRow(1);
    //to get the cell
    Cell cell = row.getCell(2);
    
//    //to read long is numeric value we get 
  double numericCellValue = cell.getNumericCellValue();
  long l = (long)numericCellValue;
  //long use pana string name use pananum
  String valueOf = String.valueOf(l);
  System.out.println(valueOf);
}


}
