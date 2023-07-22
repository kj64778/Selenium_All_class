package com.java.Assert_demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertDemo {
	
	SoftAssert softassert = new SoftAssert();
	
	String name = "Kiran";
	
	
	
	@Test
	public void softassertDemo() {
		
	
		
		softassert.assertEquals("Karan", name);
		System.out.println("---Step1-----");
		
		softassert.assertEquals("KJ", name);
		System.out.println("--------step2----");
		
		softassert.assertEquals("Kiran", name);
		System.out.println("--------step3----");
		
//		softassert.assertAll();
	}
	
	

}
