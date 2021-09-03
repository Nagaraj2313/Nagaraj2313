package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNG {
	@Test(dataProvider="SampleData")
	public void test1(String Username,String Password) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagaraj\\eclipse-workspace\\Mavensample\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(Username);
			driver.findElement(By.id("pass")).sendKeys(Password);
		}
	@DataProvider(name="SampleData")
	public Object[][]data(){
		return new Object[][] {
			{"Nagaraj2313","Naga@123"}
		};
	}
	
}
