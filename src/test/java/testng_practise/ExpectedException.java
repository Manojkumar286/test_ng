package testng_practise;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions = Exception.class)
	private void calculation() {
		int a=10;
		System.out.println(a/0);
	}
}
