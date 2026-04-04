package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize(); // Maximize the browser window
		
		
		// Tag id    Syntax - tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T- shirt");
		// in search  bar it will write T- shirt
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T- shirt");
		// we cam remove input then it will write the same 
		
		
		// Tag Class  Syntax-tag.classname
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Pant");
		// in search  bar it will write Pant
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Pant");
		// we cam remove input then it will write the same 
		
		
		// Tag Attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Blanket");
		// in search  bar it will write Blanket
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Blanket");
		// we cam remove input then it will write the same 
		
	}

}
