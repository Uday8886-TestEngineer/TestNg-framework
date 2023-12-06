package TestngXmls;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngXml {
	
	@Test
	
	public void Login() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
   String Actualvalue= driver.findElement(By.tagName("h1")).getText();
	String customervalue="Logged In Successfully";	
	
	Assert.assertEquals(Actualvalue, customervalue);
	}

	
	@Test
	public void Uday() {
		System.out.println("uday");
	}
	@Test
	public void saharsh() {
		System.out.println("saharsh");	
	}
	@Test
	public void jessi() {
		System.out.println("jessi");
	}
	@Test
	public void kalyani() {
		System.out.println("kalyani");
	}
	
}


   