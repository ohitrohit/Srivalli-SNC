package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WhyAssertion {

	@Test
	public void demo() {
		String s1 = "hello";
		String s2 = "hi";
	//	if(s1.equals(s2))
	//		System.out.println("pass");
	//	else
	//		System.out.println("fail");
		
		Assert.assertEquals(s1, s2);
	}
}
