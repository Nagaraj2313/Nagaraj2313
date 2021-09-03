package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyFbdateFW {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		File f = new File("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\Drivenframe.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(stream);
		// create sheet
		Sheet createSheet = book.createSheet("Sheet9");
		//facebook look 
		List<WebElement> dayclick = driver.findElements(By.id("day"));
		//size dayclick list of day
		for (int i = 0; i < dayclick.size(); i++) {
			//we want get all the list click get
			WebElement web = dayclick.get(i);
			// to text gettext(cinsole)
			String text = web.getText();
			System.out.println(text);
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(i);
			createCell.setCellValue(text);

		}

		FileOutputStream st = new FileOutputStream(f);
		book.write(st);
		System.out.println("ok");

	}
}
