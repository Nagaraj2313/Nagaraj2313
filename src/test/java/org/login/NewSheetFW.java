package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class NewSheetFW {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\Drivenframe.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook workb = new XSSFWorkbook(stream);
	// create new sheet 
	Sheet createSheet = workb.createSheet("Sheet6"); 
	//enna row la name create
	Row createRow = createSheet.createRow(2);
	Cell createCell = createRow.createCell(3);
	createCell.setCellValue("nagaraj");
	FileOutputStream st = new FileOutputStream(f);
	workb.write(st);
	System.out.println("ok open");
		

}
}
