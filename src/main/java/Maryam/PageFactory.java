package Maryam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory {
	WebDriver driver;
	
	
	//public void PageFactory(WebDriver driver) {
	
		//this.driver=driver;
	//	PageFactory
	
		

	//@FindBy(how = How.NAME, using = "userName")
	private WebElement putusername;
	
	
	
	public void sendingusername() {
		putusername.sendKeys("userName");
		
		
		
	}
	
	public void openBrowser() {
		//System.setproperty("After Logout:"+driver.getTitle());
		WebDriver driver = new ChromeDriver();
	
		
	}
	

}
