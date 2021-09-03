package org.pom2;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 extends Baseclass1{
	public page2() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
private WebElement clickflight;
public WebElement getClickflight() {
	return clickflight;
}












}
