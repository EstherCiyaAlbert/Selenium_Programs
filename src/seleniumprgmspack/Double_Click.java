package seleniumprgmspack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Double_Click {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Launch the Application Under Test(AUT)
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
		//Double click the button to launch right click menu options
			Actions ac = new Actions(driver);
			
			WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			ac.doubleClick(link).perform();
			
		//Click on OK on the displayed window
			WebElement element = driver.findElement(By.xpath(""));
			element.click();
			
			
	}

}
