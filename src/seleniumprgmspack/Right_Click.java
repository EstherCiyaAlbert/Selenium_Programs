package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Create object of Action class
			Actions action = new Actions(driver);
		
		//Find Element using locator and store into WebElement
			WebElement element = driver.findElement(By.cssSelector("#authentication > span"));
			
		//Perform Right click operation using action(object) on element.
			action.contextClick(element).perform();
		

	}

}
