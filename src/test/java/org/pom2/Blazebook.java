package org.pom2;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazebook extends Baseclass1 {
	public Blazebook() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="fromPort")
	private WebElement Selectcountry;
	@FindBy(name="toPort")
	private WebElement Selectcountryto;
	@FindBy(xpath="//input[@value='Find Flights']")
	private WebElement option;
	
	public WebElement getSelectcountry() {
		return Selectcountry;
	}
	public WebElement getSelectcountryto() {
		return Selectcountryto;
	}
	public WebElement getoption() {
		return option;
	}
	

}
