package org.logine;

import org.login.Baseclass1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage3 extends Baseclass1 {
public ButtonPage3() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="radiobutton_0")
private WebElement button;
@FindBy(id="continue")
private WebElement cont;
public WebElement getButton() {
	return button;
}
public WebElement getCont() {
	return cont;
}

	
	
	
	
	
	

}
