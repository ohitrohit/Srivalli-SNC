package practiceChapter3;

import org.testng.annotations.Test;

public class SecondTest {

	@Test(groups = {"sanity" , "smoke"})
	public void demo1() {
		System.out.println("demo1");
	}
	@Test(groups = "smoke")
	public void demo2() {
		System.out.println("demo2");
	}
	@Test(groups = {"regression" , "sanity"})
	public void demo3() {
		System.out.println("demo3");
	}
}
