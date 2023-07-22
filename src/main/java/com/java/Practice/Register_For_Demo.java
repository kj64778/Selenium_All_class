package com.java.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register_For_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://nxtgenaiacademy.com/demo-site/");

		boolean registerForDemo = driver.findElement(By.xpath("//h3[contains(text(),'Register For Demo')]"))
				.isDisplayed();

		System.out.println("Register For Demo is Display : " + registerForDemo);

		driver.findElement(By.xpath("//label[contains(text(),'First Name  ')]//following-sibling::input"))
				.sendKeys("Kiran");

		driver.findElement(By.xpath("//label[contains(text(),'Last Name  ')]//following-sibling::input"))
				.sendKeys("Jadhav");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]//preceding-sibling::input")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Street Address')]//preceding-sibling::input"))
				.sendKeys("Pune, Maharashtra");

		driver.findElement(
				By.xpath("//label[contains(text(),'Apt, Suite, Bldg. (optional)')]//preceding-sibling::input"))
				.sendKeys("Navle brigde");

		driver.findElement(By.xpath("//label[contains(text(),'City')]//preceding-sibling::input"))
				.sendKeys("polt no 1, Shree Ram");

		driver.findElement(By.xpath("//label[contains(text(),'Postal / Zip Code')]//preceding-sibling::input"))
				.sendKeys("Pune");

		driver.findElement(By.xpath("//*[@id=\"item-vfb-13\"]/div/span[6]/span/span[1]")).click();

		driver.findElement(By.xpath("//li[contains(text(),'Albania')]")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Email ')]//following-sibling::input"))
				.sendKeys("Automation123@gmail.com");

		driver.findElement(By.xpath("//label[contains(text(),'Enter in MM/DD/YY Format')]//preceding-sibling::input"))
				.sendKeys("07/12/2023");

//		driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-hour-container\"]")).click();

		driver.findElement(By.xpath("//li[contains(text(),'04')]")).click();

		driver.findElement(By.xpath("//*[@id=\"select2-vfb-16-min-container\"]")).click();

		driver.findElement(By.xpath("//li[contains(text(),'25')]")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Mobile Number ')]//following-sibling::input"))
				.sendKeys("1234567890");

		driver.findElement(By.xpath("//label[contains(text(),'Selenium WebDriver')]//preceding-sibling::input"))
				.click();

		driver.findElement(By.xpath("//label[contains(text(),'UFT')]//preceding-sibling::input")).click();

		driver.findElement(By.xpath("//label[contains(text(),'TestNG')]//preceding-sibling::input")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Core Java')]//preceding-sibling::input")).click();

		driver.findElement(By.xpath("//label[contains(text(),'Functional Testing')]//preceding-sibling::input"))
				.click();

		driver.findElement(By.xpath("//label[contains(text(),'Others')]//preceding-sibling::input")).click();

		driver.findElement(
				By.xpath("//label[contains(text(),'Enter your query ')]//following-sibling::div//child::textarea"))
				.sendKeys(
						"Perform Live Interactive Browser Compatibility Testing. Free 60 Min Of Testing Every Month. LambdaTest - Most Powerful Cross Browser Automation Testing Tool. Start Free Trial. 24/7 Support. Enterprise Ready. 3000+ Browsers Online. Enterprise Grade Security.");

		driver.findElement(By.xpath("//label[contains(text(),'Example: 99')]//preceding-sibling::input"))
				.sendKeys("99");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}

}
