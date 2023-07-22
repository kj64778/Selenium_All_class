package com.java.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Class {
	
	@Test
	@Parameters("data1")
	public void test1(String a) {
		System.out.println(a);
	}

}
