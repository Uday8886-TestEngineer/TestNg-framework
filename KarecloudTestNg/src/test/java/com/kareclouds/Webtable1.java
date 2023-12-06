package com.kareclouds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtable1 {
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {	
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		}
		@Test
		public void webTable() {
		List<WebElement>TotalColumns=driver.findElements(By.xpath("//table[@id='abc']//tbody/tr/th"));
		System.out.println("number of columns"+" "+TotalColumns.size());
		List<WebElement>Totalrows=driver.findElements(By.xpath("//table[@id='abc']//tbody/tr"));
		System.out.println("number of rows"+" "+Totalrows.size());
		List<WebElement>Columns_rows=driver.findElements(By.xpath("//table[@id='abc']//tbody/tr/td"));
		System.out.println("number of rows"+" "+Columns_rows.size());
		for(int i=0;i<TotalColumns.size();i++) {
		for(int j=0;i<Totalrows.size();j++) {
		WebElement data=driver.findElement((By.xpath("//table[@id='abc']tbody/tr["+i+"]/td["+j+"]")));
		System.out.print(data.getText()+" ");
		}
		System.out.println();
		}
		}
		@AfterTest
		public void CloseBrowser() {
		driver.close();
		}
	}
	

