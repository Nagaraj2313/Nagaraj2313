package org.pom2;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Baseclass1 {
	public Page3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="inputName")
	private WebElement textname;
	@FindBy(id="address")
	private WebElement textAddress;
	@FindBy(id="city")
	private WebElement textcity;
	@FindBy(id="state")
	private WebElement textState;
	@FindBy(id="zipCode")
	private WebElement textcode;
	@FindBy(id="cardType")
	private WebElement textcard;
	@FindBy(id="creditCardNumber")
	private WebElement textcardnumber;
	@FindBy(id="creditCardNumber")
	private WebElement textmonth;
	
	public WebElement getTextname() {
		return textname;
	}
	public WebElement getTextAddress() {
		return textAddress;
	}
	public WebElement getTextcity() {
		return textcity;
	}
	public WebElement getTextState() {
		return textState;
	}
	public WebElement getTextcode() {
		return textcode;
	}
	public WebElement getTextcard() {
		return textcard;
	}
	public WebElement getTextcardnumber() {
		return textcardnumber;
	}
	public WebElement getTextmonth() {
		return textmonth;
	}
	public WebElement getTextyear() {
		return textyear;
	}
	public WebElement getCardholdername() {
		return cardholdername;
	}
	public WebElement getClickbt() {
		return clickbt;
	}
	public WebElement getBt() {
		return bt;
	}

	@FindBy(id="creditCardYear")
	private WebElement textyear;
	@FindBy(id="nameOnCard")
	private WebElement cardholdername;
	@FindBy(id="rememberMe")
	private WebElement clickbt;
	@FindBy(xpath="//input[@value='Purchase Flight']")
	private WebElement bt;
	
	
	
	
	
	
	
	
	
	
	
}
