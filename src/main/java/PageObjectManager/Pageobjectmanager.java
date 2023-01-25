package PageObjectManager;

import org.openqa.selenium.WebDriver;

import Baseclass.baseclass;
import Locators.Flipkart;
import Locators.Instagram;

public class Pageobjectmanager extends baseclass {
public Pageobjectmanager(WebDriver driver) {
	this.driver=driver;
}

   private Instagram Instagram;

public Instagram getInstagram() {
	if (Instagram==null) {
		Instagram=new Instagram(driver);
	}
	return Instagram;
}
   
private Flipkart flipkart;

public Flipkart getFlipkart() {
	if (flipkart==null) {
		flipkart=new Flipkart(driver);
	}
	return flipkart;
}

   
   


}
