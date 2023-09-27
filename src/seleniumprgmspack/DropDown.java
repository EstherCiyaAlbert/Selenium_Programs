package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();      
	    driver.navigate().to("https://demo.automationtesting.in/Register.html");
	    driver.manage().window().maximize();
	    
	  //1)To select from dropdown using "selectByVisibleText()" || [[For select tag]] ||(in skill)
			Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
			drop.selectByVisibleText("C++");
	    
	  //2)Select by Index
			//Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
			//skill.selectByIndex(3);
		
	   //3)Select by value
			//Select skill = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
			//skill.selectByValue("APIs");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");

			
	}

}
