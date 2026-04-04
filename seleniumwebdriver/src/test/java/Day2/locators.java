package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=marketplace/extension");
		driver.manage().window().maximize();
		
		// name
		//driver.findElement(By.name("filter_search")).sendKeys("Mac");
		// in search column we can write mac
		
		//id
		//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println("logoDisplaystatus");
		// it will return true or false 
		
		// linktext & partial link text 
		// driver .findElement(By.linkText("Tablets")).click();
		// driver .findElement(By.partiallinkText("Table")).click();
		// we will prefer linktext
		
		//ClassName
	//List<WebElement>headerLinks=driver.findElements(By.className("visible-xs"));
  //System.out.println("total number of header links :"+ headerLinks.size());
	// from this we can find total number of header links that's 3 
		
	//  TagName
		List<WebElement>links= driver.findElements(By.tagName("a"));
	System.out.println("total number of header links :"+ links.size());
		//from this we can find total number of Tag link  that's 147
		
		//List<WebElement>images=driver.findElements(By.tagName("img"));
		//System.out.println("total number of images :"+ images.size());
		// image size  is 51 
		
		
		
		

	}

}
