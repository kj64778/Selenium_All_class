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

public class Listner_FailTestCase_take_screeshot implements ITestListener {

//	WebDriver driver;
	
	

//	public void onTestStart(ITestResult result) {
//		System.out.println("On Test Start");
//	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success");
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Hello Tester");

		String name = result.getName();

		TakesScreenshot screenShot = (TakesScreenshot)Listner_Pass_Fail_TestCase.driver;

		File file = screenShot.getScreenshotAs(OutputType.FILE);

		try {

			String path = System.getProperty("user.dir");
			FileUtils.copyFile(file, new File(path + "\\TakeScreenShotFolder\\ListnerSS" + name + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Input output Exception : File not found ");
		}
	}

//	public void onTestSkipped(ITestResult result) {
//		System.out.println("On Test Skipped");
//	}
//
//	public void onStart(ITestContext context) {
//		System.out.println("On Start");
//	}
//
//	public void onFinish(ITestContext context) {
//		System.out.println("On Finish");
//	}

}
