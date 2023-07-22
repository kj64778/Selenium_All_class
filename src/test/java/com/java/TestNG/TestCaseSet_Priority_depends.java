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

public class TestCaseSet_Priority_depends {

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

	@Test(groups = { "Sanity" })
	public void test2() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Sanity" })
	public void test3() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Sanity", "Regrassion" },enabled = true,priority = 1)
	public void test4() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Regrassion" },priority = 2,dependsOnMethods = {"test6"})
	public void test5() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Regrassion" })
	public void test6() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Smoke" })
	public void test7() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Smoke", "Regrassion" })
	public void test8() {
		System.out.println("This is Test 2 Method");
	}

	@Test(groups = { "Smoke" },priority = 1)
	public void test9() {
		System.out.println("This is Test 2 Method");
	}

}
