package coding;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Finalproject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php/");
		
		WebElement login= driver.findElement(By.xpath("//*[@class='login']"));
		login.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("maryamsadiq00@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//*[@id='passwd']"));
		pwd.sendKeys("Tech12");
		WebElement submit = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		submit.click();
		// We usedb get tile to get the actual title
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
		
		
		WebElement dresses = driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]"));
		dresses.click();
		
		js.executeScript("window.scrollBy(0,1100)");
		
		WebElement price1 = driver.findElement(By.xpath("(//*[@class='price product-price'])[2]"));
		WebElement price2 = driver.findElement(By.xpath("(//*[@class='price product-price'])[4]"));
		WebElement price3 = driver.findElement(By.xpath("(//*[@class='price product-price'])[6]"));
		WebElement price4 = driver.findElement(By.xpath("(//*[@class='price product-price'])[8]"));
		WebElement price5 = driver.findElement(By.xpath("(//*[@class='price product-price'])[10]"));
		//OPTION TO GIVE TEXT IN A LIST THATS WHY WE USED ARRAYLIST
		  ArrayList<String> pricelist = new ArrayList<String>();
		  pricelist.add(price1.getText());
		  pricelist.add(price2.getText());
		  pricelist.add(price3.getText());
		  pricelist.add(price4.getText());
		  pricelist.add(price5.getText());
		
		   
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
		   Actions builder = new Actions(driver);
		   WebElement hoverover= driver.findElement(By.xpath("(//*[@class='right-block'])[2]"));
		   // we need to use action method to move our mouse 
		   builder.moveToElement(hoverover).perform();
		   
		   //add to the cart
		   WebElement addtocart= driver.findElement(By.xpath("(//*[@title='Add to cart'])[2]"));
		   addtocart.click();
		   WebElement proceed = driver.findElement(By.xpath("(//*[@class='icon-chevron-right right'])[2]"));
		   Thread.sleep(2000);
		   proceed.click();
		   
			js.executeScript("window.scrollBy(0,0)");
			Thread.sleep(2000);
		   //verify the price
		WebElement total = driver.findElement(By.xpath("//*[@id='total_price']"));
		total.getText();
		// we created two string objects to compare the actual price from website with the expected price
		  String totalprice = total.getText();
		  System.out.println("Total price with shipping: "+totalprice);
		  String expectedtotalprice = total.getText();
		  if(totalprice.equals(expectedtotalprice)) {
			  System.out.println("Both prices matched");
		  }
		  else {
			  System.out.println("prices don't match");
		  }
		  js.executeScript("window.scrollBy(0,-500)");
		  WebElement logout = driver.findElement(By.xpath("//*[@class='logout']"));
		  Thread.sleep(2000);
		  logout.click();
		  Thread.sleep(2000);
		  driver.close();
	}
		   

		   
	
}