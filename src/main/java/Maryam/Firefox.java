package Maryam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Screenshot.captureScreenShot(driver, "firefoxtest");
	}
	

}
