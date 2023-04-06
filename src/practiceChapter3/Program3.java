package practiceChapter3;

import org.testng.annotations.Test;

public class Program3 {

	@Test(invocationCount = 1 , priority=-5)
	public void demo1() {
		System.out.println("hello world");
	}
	@Test(invocationCount = 3 , priority = -4)
	public void demo2() {
		System.out.println("i am rohit");
	}
	@Test(invocationCount = 3 , priority = -3)
	public void demo3() {
		System.out.println("i failed many time");
	}
	@Test(enabled = false)
	public void demo4() {
		System.out.println("being ignore");
	}
	@Test(invocationCount = 5 , priority = 1)
	public void demo5() {
		System.out.println("have guts to rise");
	}
	@Test(invocationCount = 6 , priority = 2)
	public void demo6() {
		System.out.println("hardwork for success");
	}
	@Test(invocationCount = 10 , priority = 3)
	public void demo7() {
		System.out.println("successfull");
	}
}
