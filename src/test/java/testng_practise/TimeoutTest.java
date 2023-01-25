package testng_practise;

import org.testng.annotations.Test;

public class TimeoutTest {
	
	@Test(timeOut = 5000)
	private void login() throws InterruptedException {
		System.out.println("Browser Launch");
		
		Thread.sleep(3000);
		System.out.println("Get Url");
		
		System.out.println("Username");
		Thread.sleep(1000);
		System.out.println("Password");
		
		System.out.println("Login");
	}
}
