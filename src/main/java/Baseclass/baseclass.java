package Baseclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class baseclass {
	public static WebDriver driver;

	public static void browserlaunch(String browser) {
		try {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			System.out.println("Unable to get browser :" + e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		windowmax();
	}

	public static void windowmax() {
		driver.manage().window().maximize();
	}

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println("Unable to get url :" + e.getMessage());
		}
	}

	public static void elementsendkeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Unable to sendkeys :" + e.getMessage());
		}
	}

	public static void elementclick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Unable to click :" + e.getMessage());
		}
	}

	public static boolean isdisplayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Invalid is displayed elements :" + e.getMessage());
		}
		return displayed;
	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Unable to quit :" + e.getMessage());
		}
	}

	public static String gettext(WebElement element) {
		String text = null;
		try {
			text = element.getText();
		} catch (Exception e) {
			System.out.println("Unable to get text :" + e.getMessage());
		}
		return text;
	}

	public static void dropdown(WebElement element, String option, String i) {

		try {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("Index")) {
				s.selectByIndex(Integer.parseInt(i));
			} else if (option.equalsIgnoreCase("Text")) {
				s.selectByVisibleText(i);
			} else if (option.equalsIgnoreCase("Value")) {
				s.selectByValue(i);
			}
		} catch (Exception e) {
			System.out.println("Unable to select dropdown :" + e.getMessage());
		}

	}

	public static void mouseover(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println("Unable to Mouseover :" + e.getMessage());
		}
	}

	public static void windowhandles(String titlename) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
				String title = driver.switchTo().window(string).getTitle();
				if (titlename.equalsIgnoreCase(title)) {
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Unable to windowhandles :" + e.getMessage());
		}
	}

}
