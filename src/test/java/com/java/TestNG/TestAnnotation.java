package com.java.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {
	
	 public TestAnnotation() {
		
	}

	@Test
	public void test1() {

		System.out.println("This is Test 1 method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class Method");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This is Before Groups Method");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("This is After Groups Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method");
	}

	@Test(groups = {"Sanity"})
	public void test2() {
		System.out.println("This is Test 2 Method with Sanity Testing");
	}
	@Test(groups = {"Sanity"})
	public void test3() {
		System.out.println("This is Test 3 Method with Sanity Testing");
	}
	@Test(groups = {"Sanity", "Regrassion"})
	public void test4() {
		System.out.println("This is Test 4 Method wit Sanity and Regrassion Testing");
	}
	
	
	@Test(groups = {"Regrassion"})
	public void test5() {
		System.out.println("This is Test 5 Method with Regrassion Testing");
	}
	
	@Test(groups = {"Regrassion"})
	public void test6() {
		System.out.println("This is Test 2 Method");
	}
	@Test(groups = {"Smoke"})
	public void test7() {
		System.out.println("This is Test 6 Method with Regrassion Testing");
	}
	
	@Test(groups = {"Smoke","Regrassion"})
	public void test8() {
		System.out.println("This is Test 8 Method with Smoke and  Regrassion Testing");
	}
	
	@Test(groups = {"Smoke"})
	public void test9() {
		System.out.println("This is Test 9 Method with Smoke testing");
	}
}
