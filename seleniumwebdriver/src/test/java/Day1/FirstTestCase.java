package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

/* 
 * Test case 
 * 1) launch browser
 * 2) open url https://demo.opencart.com/
 * 3) validate title should be "Your score"
 * 4) close browser 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
		// 1) launch the browser (Chrome)
		ChromeDriver driver= new ChromeDriver();
		// WebDriver driver = new ChromeDriver(); ( we can write this script as well)
		
		//2) open url https://demo.opencart.com/
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		// 3) validate title should be "Your score"
		
		String act_title =driver.getTitle();
		
		if (act_title.equals("Your Store"))
		{
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
		}
		
		// 4 ) close browser 
		driver.close();
		// driver.quit ( we can use this also)

	}

}
