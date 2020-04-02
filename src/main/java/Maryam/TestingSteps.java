package Maryam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	static WebDriver driver;
	static 	Website pf;
	//static WebDriverWait wait;
	
	@When("^user go to login page$")
	public void user_go_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
	//	driver.get("http://driver.get(\"http://newtours.demoaut.com/\");
		
		
	
	    
	}


	@When("^user enters a valid user name$")
	public void user_enters_a_valid_user_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		//driver.findElement(By.name("userName")).sendKeys("user@phptravels.com");
		
		PageFactory obj = new PageFactory();
		
		obj.sendingusername();
		
	    
	}

	@When("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("demouser");
	}

	@Then("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login")).click();
	}

	@Then("^user print the page title$")
	public void user_print_the_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("After Logout:"+driver.getTitle());
	}



	@When("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}


	@When("^user click on log out button$")
	public void user_click_on_log_out_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
	}



}
