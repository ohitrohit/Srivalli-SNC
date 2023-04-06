package groupExecution;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(groups= "Smoke")
	public void test() {
		System.out.println("test0");
	}
	
	@Test(groups= "Sanity")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups= {"Smoke","Sanity"})
	public void test2() {
		System.out.println("test2");
	}
}
