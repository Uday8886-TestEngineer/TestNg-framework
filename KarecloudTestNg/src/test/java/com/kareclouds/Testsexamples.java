package com.kareclouds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testsexamples {
	ChromeDriver driver;
	@BeforeMethod
	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	@Test
	public void validloginfunction() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.id("submit")).click();
	}
		

		
	}
	
	

