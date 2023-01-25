package testng_practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseclass.baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest extends baseclass {
	
	@Test
	@Parameters("browser")
	private void browserLaunch(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	@Test
	private void getUrl() {
		geturl("https://www.instagram.com/");
	}
	
	
}
