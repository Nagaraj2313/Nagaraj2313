package org.logine;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 extends Baseclass1 {
public Page4() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement fName;
@FindBy(id="last_name")
private WebElement lName;
@FindBy(id="address")
private WebElement Address;
@FindBy(id="cc_num")
private WebElement CardNo;
@FindBy(id="cc_type")
private WebElement cardty;
@FindBy(id="cc_exp_month")
private WebElement expM;
@FindBy(id="cc_exp_year")
private WebElement expY;
@FindBy(id="cc_cvv")
private WebElement ccv;
@FindBy(id="book_now")
private WebElement booktn;
public WebElement getfName() {
	return fName;
}
public WebElement getlName() {
	return lName;
}
public WebElement getAddress() {
	return Address;
}
public WebElement getCardNo() {
	return CardNo;
}
public WebElement getCardty() {
	return cardty;
}
public WebElement getExpM() {
	return expM;
}
public WebElement getExpY() {
	return expY;
}
public WebElement getCcv() {
	return ccv;
}
public WebElement getBooktn() {
	return booktn;
}






















}
