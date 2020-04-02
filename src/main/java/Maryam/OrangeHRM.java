package Maryam;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OrangeHRM {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
	//driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	//driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
	//String actual = driver.findElement(By.xpath("//*[contains(text(),'Linda Anderson')]")).getText();
	
	System.out.println("this is actual messgae");
	String expected="Linda Anderson";
	//Assert.assertEquals(expected, actual);
	
	driver.close();
	
	
	
	
}
}
