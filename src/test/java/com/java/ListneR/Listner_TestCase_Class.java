package com.java.ListneR;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ Listner_Demo_Class.class })
public class Listner_TestCase_Class {

	@Test
	public void test1() {
		System.out.println("This is 1st Test Case");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("This is 2nd Test Case");
	}

	@Test
	public void test3() {
		System.out.println("This is 3rd Test Case");

		Assert.assertTrue(false);
	}

	@Test
	public void test4() {
		System.out.println("This is  4thTest Case");
		throw new SkipException("Skip this test case");
	}
}
