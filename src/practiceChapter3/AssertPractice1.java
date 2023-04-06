package practiceChapter3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertPractice1 {

	@Test
	public void sample1() {
		String h1= "hello";
		String h2= "hi";
		Assert.assertEquals(h1, h2);
		System.out.println("lets see");
		
	}
	@Test
	public void Sample2() {
		String m1= "ram ram";
		String m2= "ram ram";
		Assert.assertEquals(m1, m2);
		System.out.println("lets see2");
	}
}
