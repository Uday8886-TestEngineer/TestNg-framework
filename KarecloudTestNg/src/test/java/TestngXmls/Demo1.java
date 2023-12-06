package TestngXmls;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeSuite
	public  void demo() {
		System.out.println("uday before suit");
	}
	@AfterMethod
	public void demo13() {
		System.out.println("Rajesh after method");
	}
	@BeforeClass
	public void demo2() {
			System.out.println("saharsh before class");
	}
	
	@Test
	public void demo4() {
		System.out.println("prabhas test");
	}
	@AfterTest
	public void demo14() {
		System.out.println("Naveen after test");
	}
	@AfterClass
	public void demo11() {
		System.out.println("Laatha after class");
	}
	@BeforeMethod
	public void demo3() {
	}
	@Test
	public void demo5() {
		System.out.println("salaar test");
	}
		@AfterClass
		public void demo10() {
			System.out.println("IT VIDYA after class");
	}
	@BeforeTest
	public void demo1() {
		System.out.println("kalyani before test");
	}
	@Test
		public void demo6() {
			System.out.println("darling test");
		}
	@AfterSuite
	public void demo7() {
		System.out.println("prasanna sir after suit");
	}
	@Test
	public void demo8() {
		System.out.println("RK sir test");
	}
	
	}


