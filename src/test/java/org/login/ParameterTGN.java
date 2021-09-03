package org.login;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTGN {
	@Parameters({"Username"})
	@Test(priority= -12)
	public void test1(String Username) {
			System.out.println("Test1");
			System.out.println(Username);
		}
	    @Parameters({"Password"})
		@Test(priority=-1)
		public void test2(String Password) {
	System.out.println("test2");
	System.out.println(Password);
		}
		@Test(priority=14)
		public void test3() {
			System.out.println("test3");
				}
		@Test(priority=-211)
		public void test4() {
			System.out.println("test4");
				}
}
