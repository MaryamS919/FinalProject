package Maryam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://learn.letskodeit.com/p/practice");
		//RADIO BUTTON EXAMPLE
		WebElement BMW = driver.findElement(By.id("bmwradio"));
		BMW.click();
		//SELECT CLASS EXAMPLE
		WebElement dropDown = driver.findElement(By.id("carselect"));
		Select selectDrop = new Select(dropDown);
		selectDrop.selectByVisibleText("Honda");
		
		//SELECT MULTIPLE CLASS EXAMPLE
		WebElement multiselect = driver.findElement(By.id("multiple-select-example"));
		Select dropMulti = new Select(multiselect);
		dropMulti.selectByVisibleText("Apple");
		dropMulti.selectByVisibleText("Peach");
		
		//CHECKBOX EXAMPLE 
		WebElement checkbmw = driver.findElement(By.id("bmwcheck"));
		checkbmw.click();
		
	
		// Switch Window Example
				// Store and Print the name of the First window on the console
				String swHandle = driver.getWindowHandle();
				System.out.println("This is first window: " + swHandle);
				// Click on the Button "New Message Window"
				driver.findElement(By.id("openwindow")).click();
				// Store and Print the name of all the windows open
				Set<String> swHandles = driver.getWindowHandles();
				System.out.println("Old window plus new window names: " + swHandles);
				System.out.println("Window title before change: " + driver.getTitle());
				// Pass a window handle to the other window
				for (String handle1 : driver.getWindowHandles()) {
					System.out.println("Changing window: " + handle1);
					driver.switchTo().window(handle1);
				}
				System.out.println("Window title after change: " + driver.getTitle());
				// Close new window
				driver.close();
				// Go back to old window
				driver.switchTo().window(swHandle);
		
		
	}
	//WebElement salertexample = driver.findElement(By.id("Enter Your Name"));
	
		
	}


