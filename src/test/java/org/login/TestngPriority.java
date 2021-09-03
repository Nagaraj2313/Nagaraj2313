package org.login;

import org.testng.annotations.Test;

public class TestngPriority {
	@Test(priority= -12)
public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=-1, enabled=false)
	public void test2() {
System.out.println("test2");
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
