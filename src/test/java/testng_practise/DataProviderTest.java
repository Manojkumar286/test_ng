package testng_practise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import PageObjectManager.Pageobjectmanager;

public class DataProviderTest extends baseclass {
	Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test
	private void browserLaunch() {
		browserlaunch("chrome");
	}

	@Test(priority = 1)
	private void getUrl() {
		geturl("https://www.instagram.com/");
	}
@Test(dataProvider = "details",priority = 2)
	private void inputData(String username, String password) {
		elementsendkeys(pom.getInstagram().getUsername(), username);
		elementsendkeys(pom.getInstagram().getPassword(), password);
	}

	@DataProvider
	private Object[][] details() {
		return new Object[][] { 
			{ "Manoj", "Kumar@123" }, 
			{ "Kumar", "Manoj@123" }, 
			{ "Mano", "Mano@123" }
		};
	}

	
	@AfterMethod
	private void Login_btn() {
		elementclick(pom.getInstagram().getSubmit());
		//quit();
	}
	
}
