package com.kareclouds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Beforetest {
	ChromeDriver driver;
@BeforeTest

	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	@Test(priority=3)
	public void validloginfunction() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
   Thread.sleep(3000);
	}
	@Test(priority=2)
	public void invalidlusernamevalidpasswordloginfunction() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("student123");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
}
	@Test(priority=1)
	public void validlusernameinvalidpasswordloginfunction() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password1234");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void closebrowser() {
		driver.close();
		
	}
	
}
