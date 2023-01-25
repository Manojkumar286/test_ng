package testng_practise;

import org.testng.annotations.Test;

import Baseclass.baseclass;

public class InvocationCount extends baseclass {

	@Test
	private void browserLaunch() {
		browserlaunch("chrome");
	}
	
	@Test(priority = 1)
	private void getUrl() {
		geturl("https://www.trends.ajio.com/");
	}
	
	@Test(invocationCount = 5,priority = 2)
	private void refreshpage() {
		driver.navigate().refresh();
	}
}
