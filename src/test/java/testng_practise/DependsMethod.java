package testng_practise;
import org.testng.annotations.Test;
import Baseclass.baseclass;
import PageObjectManager.Pageobjectmanager;
public class DependsMethod extends baseclass {
	Pageobjectmanager pom = new Pageobjectmanager(driver);
	@Test(priority = 1)
	private void browserLaunch() {
		browserlaunch("chrome");
		System.out.println("BrowserLaunch");
	}
	
	@Test(dependsOnMethods = "browserLaunch")
	private void getUrl() {
		geturl("https://www.instagram.com/");
		System.out.println("GetUrl");
	}

	@Test(dependsOnMethods = "getUrl")
	private void landOnLoginpage() {
		isdisplayed(pom.getInstagram().getInsta_logo());
	System.out.println("LoginPage");
	}

	@Test(dependsOnMethods = "landOnLoginpage")
	private void userName() {
		elementsendkeys(pom.getInstagram().getUsername(), "Manoj");
		System.out.println("Username");
	}

	@Test(dependsOnMethods = "userName")
	private void passWord() {
		elementsendkeys(pom.getInstagram().getPassword(), "123@123");
		System.out.println("Password");
	}

	@Test(dependsOnMethods = "passWord")
	private void Login_btn() {
		elementclick(pom.getInstagram().getSubmit());
		System.out.println("LoginButton");
	}
}
