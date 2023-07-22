package com.java.ListneR;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_Demo_Class implements ITestListener {
	
	WebDriver driver;

	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Faile But within Success Percentage");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test Faile With Timeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}
	
	

}
