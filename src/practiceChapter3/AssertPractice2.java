package practiceChapter3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice2 {


	@Test
	public void sample1() {
		SoftAssert soft = new SoftAssert();
		String h1= "hello";
		String h2= "hi";
		soft.assertEquals(h1, h2);
		System.out.println("lets see");
		soft.assertAll();
	}
	@Test
	public void Sample2() {
		SoftAssert soft = new SoftAssert();
		String m1= "ram ram";
		String m2= "ram ram";
		soft.assertEquals(m1, m2);
		System.out.println("lets see2");
		soft.assertAll();
}
}