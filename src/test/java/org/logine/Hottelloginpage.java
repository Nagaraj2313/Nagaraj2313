package org.logine;


import org.login.Baseclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hottelloginpage extends Baseclass1{
	public Hottelloginpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement textUserName;
	
	@FindBy(name="password")
	private WebElement textpassword;
	
	@FindBy(id="login")
	private WebElement clickbtn;

	public WebElement getTextUserName() {
		return textUserName;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getClickbtn() {
		return clickbtn;
	}
	
	






}
