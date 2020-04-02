package stepdef;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.Finalpf;

public class Finalstepdef {
   static WebDriver driver;
   static JavascriptExecutor js;
   static Actions builder;
   static Finalpf pf;
   
	@Given("^user go to automationpractice webpage$")
	public void user_go_to_automationpractice_webpage() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		builder = new Actions(driver);
		pf= PageFactory.initElements(driver, Finalpf.class);
		driver.get("http://automationpractice.com/index.php/");
   
}
   @When("^user click on login button enter valid username password and submit login button$")
	public void user_click_on_login_button_enter_valid_username_password_and_submit_login_button() {
	   pf.getLogin().click();
		

	js.executeScript("window.scrollBy(0,300)");
   
	   pf.getEmail().sendKeys("maryamsadiq00@gmail.com");
		pf.getPwd().sendKeys("Tech12");
   pf.getSubmit().click();
	
   }
   
   @Then("^user get the home page and verify the website title$")
   public void user_get_the_home_page_and_verify_the_website_title() {
	   String title= driver.getTitle();
		// 
		System.out.println("Actual title: "+title);
		// we created an object expectedtitle to be matched 
		String expectedtitle= "My account - My Store";
		System.out.println("Expected title: "+expectedtitle);
		// we can find it two ways to verify something using Assert method or If else method
	Assert.assertEquals(expectedtitle, title);
		if(title.equals(expectedtitle)) {
			System.out.println("Both title matches");
			// if both equal it will don't go to else method 
			//if not equal then it will go to else method
		}
		else {
			System.out.println("Don't match");
		}
   }
   
		@When("^user click on dresses button on upper left corner$")
		public void user_click_on_dresses_button_on_upper_left_corner_below_display_showing_one_to_five_item() {
			pf.getDresses().click();
		
			
			js.executeScript("window.scrollBy(0,1100)");
			
			
			
		}
		@Then("^user print all the prices values in sorted order$")
		public void user_print_all_the_prices_values_in_sorted_order() {
			
			//OPTION TO GIVE TEXT IN A LIST THATS WHY WE USED ARRAYLIST
			  ArrayList<String> pricelist = new ArrayList<String>();
			  pricelist.add(pf.getPrice1().getText());
			  pricelist.add(pf.getPrice2().getText());
			  pricelist.add(pf.getPrice3().getText());
			  pricelist.add(pf.getPrice4().getText());
			  pricelist.add(pf.getPrice5().getText());
			 /*Unsorted List: ArrayList content before sorting*/
			   System.out.println("Before Sorting:");
			   // to use for loop method we need to create an object for the for loop method 
			   for(String prices: pricelist){
					System.out.println(prices);
			   
			   }
			   //GIVES option to get list and put in descending order
			   /* Sorting in descending order*/
			   Collections.sort(pricelist, Collections.reverseOrder());
			    
			   /* Sorted List in descending order*/
			   System.out.println("ArrayList in descending order:");
			   for(String prices: pricelist){
					System.out.println(prices);
			   }
			   }
		@When("^user select the second dress on that list price is changing every minute$")
		public void user_select_the_second_dress_on_that_list_price_is_changing_every_minute(){
			builder.moveToElement(pf.getHoverover()).perform();
			  
		}
		@When("^user add the dress to the shopping cart and proceed$")
		public void user_add_the_dress_to_the_shopping_cart_and_proceed() throws Throwable {
			
			pf.getAddtocart().click();
			Thread.sleep(2000);
			 pf.getProceed().click();
			 
		}
	@Then ("^user on the next page verify the total price with shipping logout and close the browser$")
	public void user_on_the_next_page_verify_total_price_with_shipping_logout_and_close_the_browser() throws Throwable{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		pf.getTotal().getText();

		// we created two string objects to compare the actual price from website with the expected price
		  String totalprice = pf.getTotal().getText();
		  System.out.println("Total price with shipping: "+totalprice);
		  String expectedtotalprice = pf.getTotal().getText();
		  if(totalprice.equals(expectedtotalprice)) {
			  System.out.println("Both prices matched");
		  }
		  else {
			  System.out.println("prices don't match");
		  }
		 js.executeScript("window.scrollBy(0,-500)");
		 pf.getLogout().click();
		 
		  Thread.sleep(2000);
		  driver.close();
	}
		
		
}