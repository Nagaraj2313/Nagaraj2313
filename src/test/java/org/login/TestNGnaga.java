package org.login;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGnaga extends Baseclass1 {

	@Test(dataProvider="naga")
	public void login(String Username,String Password,int a,int b) throws IOException {
		getdriver("Chrome");
		launchurl("http://adactinhotelapp.com/");
		WebElement locators = locators("id", "username");
		locators.sendKeys(Username);
		WebElement locators2 = locators("id", "password");
		locators2.sendKeys(Password);
//		locators2.sendKeys(getFromExxel("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\DataDriven\\\\book\\\\excelpom.xlsx", "Sheet1", 1, 1));
		locators("id", "login").click();
		WebElement locators3 = locators("id", "location");
		selectvisible(locators3, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 2));
		WebElement l1 = locators("id", "hotels");
		selectvisible(l1, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 3));
		WebElement locators4 = locators("id", "room_type");
		selectvisible(locators4, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 4));
		WebElement l3 = locators("id", "room_nos");
		selectvisible(l3, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 5));
		WebElement l4 = locators("id", "datepick_in");
		clear(l4);
		l4.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 6));
		WebElement l5 = locators("id", "datepick_out");
		clear(l5);
		l5.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 7));
		WebElement l6 = locators("id", "adult_room");
		selectvisible(l6, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 8));
		WebElement l7 = locators("id", "child_room");
		selectvisible(l7, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 9));
		locators("id", "Submit").click();
		locators("id", "radiobutton_0").click();
		locators("id", "continue").click();
		locators("id", "first_name").sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 10));
		locators("id", "last_name").sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 11));
		locators("name", "address").sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 12));
		locators("id", "cc_num").sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 13));
		WebElement loc = locators("id", "cc_type");
		selectvisible(loc, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 14));
		WebElement cardxdate = locators("id", "cc_exp_month");
		selectvisible(cardxdate, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 15));
		WebElement ccyear = locators("id", "cc_exp_year");
		selectvisible(ccyear, getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 16));

		locators("id", "cc_cvv").sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet1", 1, 17));
		locators("id", "book_now").click();

		implicitywait();
	WebElement element = locators("name", "order_no");
	String getAttribute = GetAttribute(element);
	System.out.println(getAttribute);
	
	excelRight("C:\\Users\\nagaraj\\eclipse-workspace\\DataDriven\\book\\excelpom.xlsx", "Sheet4", a, b, getAttribute);}
	
	
	
	
@DataProvider(name="naga")
public Object[][] data(){
	return new Object[][]{

	{"vijaykumar220997","Vijay@123",5,1},
//	{"arun2222","arun2222",8,8},
	{"dhinesh07","dhinesh07",9,1},
//	{"mahavishnu20","Vishnu@20",10,1}};
	};
}
	}
