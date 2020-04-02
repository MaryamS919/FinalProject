package Maryam;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Excel {
static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.premierleague.com/tables");
		driver.findElement(By.xpath("//*[@class='btn-primary cookies-notice-accept']")).click();
		driver.manage().window().maximize();
		
		List<WebElement> teams =(driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]")));
		
		FileInputStream fis= new FileInputStream(new File("./excel/Untitled 1.xls"));
		HSSFWorkbook wb= new HSSFWorkbook(fis);
		HSSFSheet sheet= wb.getSheetAt(0);
		
		for (WebElement teamnames: teams) {
			System.out.println(teamnames.getText().trim());
		}
	}

}
