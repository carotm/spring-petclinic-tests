package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {

	public static WebDriver getDriver() {
		return  new FirefoxDriver();
	}

	public static String getBaseUrl() {
		return System.getProperty("base.url", "http://localhost:8080/petclinic");
	}
}
