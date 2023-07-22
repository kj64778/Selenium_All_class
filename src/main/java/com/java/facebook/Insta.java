package com.java.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insta {
	static int array[] = { 21, 98, 13, 9, 34 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver drive = new ChromeDriver();

//		drive.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//		
//		drive.findElement(By.xpath("//input[@name='email']/..//child::label")).sendKeys("7774820145");

		int maxNumber = findLargestNumber();
		System.out.println("Maximum number in the array: " + maxNumber);
	}

	private static int findLargestNumber() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;

	}

}
