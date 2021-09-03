package org.pom2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageFinal extends Baseclass1 {
	public static void main(String[] args) throws IOException  {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Baseclass1 base = new Baseclass1();
		base.getdriver("Chrome");
		base.launchurl("https://blazedemo.com/");
	
Blazebook bl = new Blazebook();
WebElement sc = bl.getSelectcountry();
Select select =  new Select(sc);
select.selectByVisibleText(getFromExxel("C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\excel\\blazedemoframe.xlsx", "Sheet1", 1, 0));


WebElement sct = bl.getSelectcountryto();
Select s1 = new Select(sct);
s1.selectByVisibleText(getFromExxel("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\Mavensample\\\\excel\\\\blazedemoframe.xlsx", "Sheet1", 1, 1));

WebElement getoption = bl.getoption();
getoption.click();

page2 pa = new page2();
WebElement clickflight = pa.getClickflight();
clickflight.click();


Page3 p = new Page3();
WebElement textname = p.getTextname();
textname.sendKeys(getFromExxel("C:\\\\\\\\Users\\\\\\\\nagaraj\\\\\\\\eclipse-workspace\\\\\\\\Mavensample\\\\\\\\excel\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 2));

WebElement textAddress = p.getTextAddress();
textAddress.sendKeys(getFromExxel("C:\\\\Users\\\\nagaraj\\\\eclipse-workspace\\\\Mavensample\\\\excel\\\\blazedemoframe.xlsx", "Sheet1", 1, 3));

WebElement textcity = p.getTextcity();
textcity.sendKeys(getFromExxel("C:\\\\\\\\Users\\\\\\\\nagaraj\\\\\\\\eclipse-workspace\\\\\\\\Mavensample\\\\\\\\excel\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 4));

WebElement textState = p.getTextState();
textState.sendKeys(getFromExxel("C:\\\\\\\\Users\\\\\\\\nagaraj\\\\\\\\eclipse-workspace\\\\\\\\Mavensample\\\\\\\\excel\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 5));

WebElement textcode = p.getTextcode();
textcode.sendKeys(getFromExxel("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\nagaraj\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Mavensample\\\\\\\\\\\\\\\\excel\\\\\\\\\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 6));

WebElement textcard = p.getTextcard();
Select s = new Select(textcard);
s.selectByVisibleText(getFromExxel("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\nagaraj\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Mavensample\\\\\\\\\\\\\\\\excel\\\\\\\\\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 7));

WebElement textcardnumber = p.getTextcardnumber();
textcardnumber.sendKeys(getFromExxel("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\nagaraj\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Mavensample\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\excel\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 8));

WebElement textmonth = p.getTextmonth();
textmonth.sendKeys(getFromExxel("C:\\\\\\\\Users\\\\\\\\nagaraj\\\\\\\\eclipse-workspace\\\\\\\\Mavensample\\\\\\\\excel\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 9));

WebElement textyear = p.getTextyear();
textyear.sendKeys(getFromExxel("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\nagaraj\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Mavensample\\\\\\\\\\\\\\\\excel\\\\\\\\\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 10));

WebElement cardholdername = p.getCardholdername();
cardholdername.sendKeys(getFromExxel("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\nagaraj\\\\\\\\\\\\\\\\eclipse-workspace\\\\\\\\\\\\\\\\Mavensample\\\\\\\\\\\\\\\\excel\\\\\\\\\\\\\\\\blazedemoframe.xlsx", "Sheet1", 1, 11));

WebElement clickbt = p.getClickbt();
clickbt.click();

WebElement bt = p.getBt();
bt.click();

























}
}