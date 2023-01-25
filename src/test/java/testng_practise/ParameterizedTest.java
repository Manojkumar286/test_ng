package testng_practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import PageObjectManager.Pageobjectmanager;

public class ParameterizedTest extends baseclass {
	Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test
	private void broswerLaunch() {
		browserlaunch("chrome");
	}
	
	@Test
	private void getUrl() {
		geturl("https://www.instagram.com/");
	}
	
	@Test
	@Parameters({"username","password"})
	private void inputData(String username,String password) {
		elementsendkeys(pom.getInstagram().getUsername(),username);
		elementsendkeys(pom.getInstagram().getPassword(), password);
	}
	
	@Test
	private void login_btn() {
		elementclick(pom.getInstagram().getSubmit());
		//quit();
	}
}
