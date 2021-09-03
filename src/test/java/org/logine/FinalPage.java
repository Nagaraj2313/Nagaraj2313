package org.logine;

import java.io.IOException;

import javax.annotation.concurrent.ThreadSafe;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class FinalPage extends Baseclass1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Baseclass1 ba = new Baseclass1();
		ba.getdriver("Chrome");
		ba.launchurl("https://adactinhotelapp.com/");


		Hottelloginpage ho = new Hottelloginpage();

		WebElement textUserName = ho.getTextUserName();
		textUserName.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 0));
		WebElement textpassword = ho.getTextpassword();
		textpassword.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 1));
		WebElement clickbtn = ho.getClickbtn();
		clickbtn.click();

		SelectClass se = new SelectClass();
		WebElement location = se.getLocation();
		Select s = new Select(location);
		s.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 2));

		WebElement hotel = se.getHotel();
		Select s1 = new Select(hotel);
		s1.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 3));

		WebElement room = se.getRoom();
		Select s2 = new Select(room);
		s2.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 4));

		WebElement roomNo = se.getRoomNo();
		Select s3 = new Select(roomNo);
		s3.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 5));

		WebElement datep = se.getDatep();
		//dateku anga already date irudha name clear kuduthutu sendkey pani add pananum
		datep.clear();
		datep.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 6));

		WebElement datepickO = se.getDatepickO();
		datepickO.clear();
		datepickO.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 7));

		WebElement roommember = se.getRoommember();
		Select s4 = new Select(roommember);
		s4.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 8));

		WebElement childroom = se.getChildroom();
		Select s5 = new Select(childroom);
		s5.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 9));

		WebElement subbtn = se.getSubbtn();
		subbtn.click();

		ButtonPage3 bt =  new ButtonPage3();
		bt.getButton().click();
		bt.getCont().click();


		Page4 p = new Page4();
		
		WebElement getfName = p.getfName();
		getfName.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1,10));

		WebElement getlName = p.getlName();
		getlName.sendKeys(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 11));

		WebElement address = p.getAddress();
		address.sendKeys(getFromExxel("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\Mavensample\\\\excel\\\\excelpom.xlsx", "Sheet1", 1, 12));

		WebElement cardNo = p.getCardNo();
		cardNo.sendKeys(getFromExxel("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\Mavensample\\\\excel\\\\excelpom.xlsx", "Sheet1", 1, 13));

		WebElement cardty = p.getCardty();
		Select s8 = new Select(cardty);
		s8.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx","Sheet1", 1, 14));

	WebElement expM = p.getExpM();
		Select s9 = new Select(expM);
		s9.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 15));
		
		WebElement expY = p.getExpY();
		Select ss = new Select(expY);
		ss.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet1", 1, 16));

	WebElement ccv = p.getCcv();
		ccv.sendKeys(getFromExxel("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\Mavensample\\\\excel\\\\excelpom.xlsx", "Sheet1", 1, 17));
		WebElement booktn = p.getBooktn();
		booktn.click();
		Thread.sleep(10000);
		WebElement locators = locators("name", "order_no");
		String attribute = locators.getAttribute("Value");
		System.out.println(attribute);
		
		excelRight("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\excelpom.xlsx", "Sheet2", 3, 0, attribute);

	
}
}
