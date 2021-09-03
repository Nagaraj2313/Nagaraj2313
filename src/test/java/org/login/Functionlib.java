package org.login;

import org.openqa.selenium.WebElement;

public class Functionlib extends Baseclass1{
public static void main(String[] args) {
	 Functionlib lib= new Functionlib();
	 lib.getdriver("Chrome");
	 lib.launchurl("https://en-gb.facebook.com/");
	 WebElement textusername = lib.locators("id", "email");
     lib.textEnter(textusername, "Welcome");	 
     WebElement textPass = lib.locators("name", "pass");
     lib.textEnter(textPass, "nagaraj123");
}	
	

}
