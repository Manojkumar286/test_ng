package insta.com.stepdefinition;

import org.junit.Assert;

import Baseclass.baseclass;
import PageObjectManager.Pageobjectmanager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Insta_login extends baseclass {
	Pageobjectmanager pom = new Pageobjectmanager(driver);
	
	@Given("User Browser Launch")
	public void user_browser_launch() {
	  browserlaunch("chrome");
	    
	}
	@Given("User Navigate To Url")
	public void user_navigate_to_url() {
	  geturl("https://www.instagram.com/accounts/login/");
	    
	}
	@Given("User Land On Login Page Successfull")
	public void user_land_on_login_page_successfull() {
	  Assert.assertTrue(isdisplayed(pom.getInstagram().getInsta_logo()));
	    
	}
	@Given("User Enter Valid Username")
	public void user_enter_valid_username() {
	  elementsendkeys(pom.getInstagram().getUsername(),"Manoj");
	    
	}
	@Given("User Enter Valid Password")
	public void user_enter_valid_password() {
	  elementsendkeys(pom.getInstagram().getPassword(),"123466");
	    
	}
	@Given("User Click Login Button")
	public void user_click_login_button() {
	  elementclick(pom.getInstagram().getSubmit());
	    
	}
	@Then("Loged In Successfull")
	public void loged_in_successfull() {
	  
	    
	}
}
