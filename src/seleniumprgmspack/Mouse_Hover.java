package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement live = driver.findElement(By.xpath("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/a"));
	    ac.moveToElement(live).build().perform();
	    
	    WebElement appautomate = driver.findElement(By.xpath("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div/a"));
	    appautomate.click();
		
	}

}
