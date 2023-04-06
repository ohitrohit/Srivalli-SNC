package distributedparallelexcution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ThirdTest {
	@Test
	public void demo() {
		Reporter.log("third Test" , true);
		//Assert.fail();
	}
}
