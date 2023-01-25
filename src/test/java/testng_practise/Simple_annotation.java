package testng_practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import PageObjectManager.Pageobjectmanager;

public class Simple_annotation extends baseclass {
	Pageobjectmanager pom= new Pageobjectmanager(driver);
	@BeforeSuite
	private void Setproperty() {
		System.out.println("Set property");
	}
	
	@BeforeTest
	private void browserlaunch() {
		//browserlaunch("chrome");
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void geturl() {
		//geturl("https://www.flipkart.com/");
	System.out.println("Get Url");
	}
	
	@BeforeMethod
	private void signin() {
		//elementclick(pom.getFlipkart().signin);
	System.out.println("Sign In");
	}
	@Test
	private void dresses() {
		System.out.println("dresses");
	}
	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}
	@AfterMethod
	private void signoff() {
		System.out.println("Sign Off");
	}
	@AfterClass
	private void homepage() {
		System.out.println("Home Page");
	}
	@AfterTest
	private void close() {
		System.out.println("Close");
	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("delete cookies");
	}
}
