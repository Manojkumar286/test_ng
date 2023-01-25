package testng_practise;

import org.testng.annotations.Test;

public class GroupsTest {

	@Test(priority = 1, groups = "Music")
	private void Spotify() {
		System.out.println("Play List");
	}

	@Test(priority = 2, groups = "Music")
	private void wynk() {
		System.out.println("Play List1");
	}

	@Test(priority = 3, groups = "Flipkart")
	private void Phone() {
		System.out.println("Vivo");
	}

	@Test(priority = 4, groups = "Amazon")
	private void tshirt() {
		System.out.println("Shopping Tshirt");
	}

	@Test(priority = 4, groups = "Amazon")
	private void Jeans() {
		System.out.println("Shopping Jeans");
	}
}
