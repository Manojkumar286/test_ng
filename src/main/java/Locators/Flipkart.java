package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.baseclass;

public class Flipkart extends baseclass{
	public Flipkart(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath = "//button[text()='✕']")
public WebElement signin;

}
