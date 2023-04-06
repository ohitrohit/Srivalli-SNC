package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsPractice {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuit");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	@Test
	public void Test() {
		System.out.println("@test");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("@AfterSuite");
	}

}
