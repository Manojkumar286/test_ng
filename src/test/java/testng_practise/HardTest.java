package testng_practise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTest {
	
	@Test(retryAnalyzer = Retryclass.class)
	private void Hard() {
		String expected="Manoj";
		String actual="manoj";
		Assert.assertEquals(expected,actual);
		System.out.println("Data Validation");
	}

}
