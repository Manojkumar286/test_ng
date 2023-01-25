package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.baseclass;

public class Instagram extends baseclass {
public Instagram(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

	@FindBy(xpath = "//i[@aria-label='Instagram']")
	private WebElement Insta_logo;
	
	@FindBy(name = "username")
	private WebElement Username;
	
	@FindBy(name = "password")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;

	public WebElement getInsta_logo() {
		return Insta_logo;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	



}
