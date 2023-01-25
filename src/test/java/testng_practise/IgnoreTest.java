package testng_practise;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import PageObjectManager.Pageobjectmanager;

public class IgnoreTest extends baseclass {

	Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 1)
	private void browserLaunch() {
		browserlaunch("chrome");
	}

	@Test(priority = 2)
	private void getUrl() {
		geturl("https://www.instagram.com/");
	}

	
	@Test(priority = 3)
	private void landOnLoginpage() {
		isdisplayed(pom.getInstagram().getInsta_logo());
	}

	@Test(priority = 4)
	private void userName() {
		elementsendkeys(pom.getInstagram().getUsername(), "Manoj");
	}

	@Test(priority = 5, enabled = false)
	private void passWord() {
		elementsendkeys(pom.getInstagram().getPassword(), "123@123");
	}

	@Test(priority = 6)
	private void Login_btn() {
		elementclick(pom.getInstagram().getSubmit());
	}
}
