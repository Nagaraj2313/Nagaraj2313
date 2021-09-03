package org.vignesh;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pom2.page2;

public class Page01 extends Baseclass1 {
	public Page01() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="fromPort")
	private WebElement fromport;
	@FindBy(name="toPort")
	private WebElement toport;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement findflights;
	public WebElement getFromport() {
		return fromport;
	}
	public WebElement getToport() {
		return toport;
	}
	public WebElement getFindflights() {
		return findflights;
	}
	
}
