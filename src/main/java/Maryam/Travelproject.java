 package Maryam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelproject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.phptravels.net/login/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		//Thread.sleep(5000);
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		

	}
}
	
