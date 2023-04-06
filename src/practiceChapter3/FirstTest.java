package practiceChapter3;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(groups = "sanity")
	public void demo1() {
		System.out.println("demo1");
	}
	@Test(groups = "smoke")
	public void demo2() {
		System.out.println("demo2");
	}
	@Test(groups = {"regression" , "smoke"})
	public void demo3() {
		System.out.println("demo3");
	}
}
