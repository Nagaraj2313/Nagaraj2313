package org.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablemiddleoption extends Baseclass1 {
	
	public static void main(String[] args) {
//		getdriver("Chrome");
//		launchurl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
//		List<WebElement> elements = locatorElements("tagName", "table");
//		locators(locator, value)
//		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		WebElement element = driver.findElement(By.tagName("table"));
		WebElement element2 = driver.findElement(By.tagName("thead"));
		List<WebElement> findElements = driver.findElements(By.tagName("th"));
//		for (int i = 0; i < findElements.size(); i=i+2) {
		String text;
		if (findElements.size()%2==0) {
			WebElement webElement = findElements.get(findElements.size()/2);
			 text = webElement.getText();
			
	}else {
		WebElement webElement = findElements.get((findElements.size()-1)/2);
		 text = webElement.getText();
		 System.out.println(text);
	}
//			WebElement web = findElements.get(i);
//			String text = web.getText();
//			System.out.println(text);
//			}
		List<WebElement> rowElement = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < rowElement.size(); i=i+2) {
			WebElement webrow = rowElement.get(i);
			String text2 = webrow.getText();
			System.out.println(text2);
			List<WebElement> findElements2 = webrow.findElements(By.tagName("td"));
//			for (int j = 0; j <findElements2.size(); j=j+2) {
//				WebElement dataElement = findElements2.get(j);
//				String text = dataElement.getText();
//				System.out.println(text);
//				
			
			if (findElements2.size()%2==0) {
				WebElement webEl2 = findElements2.get(rowElement.size()/2);
				String text3 = webEl2.getText();
				System.out.println(text3);
			}else {
				WebElement ele = findElements2.get((findElements2.size()-1)/2);
				String text3 = ele.getText();
				System.out.println(text3);
				
			}
				
			}
	}}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	

