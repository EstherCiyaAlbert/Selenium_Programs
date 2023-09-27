package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//JS class 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1)To scroll down the web page by pixel.
		//SYNTAX: js.executeScript("window.scrollBy(x-pixels, y-pixels)");
		//This will scroll down the page by 1000 pixel vertical
				//js.executeScript("window.scrollBy(0, 1000)"); 
	    
		
		//2)To scroll down the web page by the visibility of the element
		//SYNTAX: js.executeScript("arguments[0].scrollIntoView();", Element);
		//Find element by link text and store in variable "Element"
				//WebElement Element = driver.findElement(By.linkText("Linux")); 
		//This will scroll the page till the element is found
				//js.executeScript("arguments[0].scrollIntoView();", Element);
		
		
		//3)To scroll down the web page at the bottom of the page	
		//SYNTAX:js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//This will scroll the web page till end.
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		//4)Horizontal scroll of the web page.
		//SYNTAX: js.executeScript("arguments[0].scrollIntoView();", Element);		
				WebElement Element = driver.findElement(By.linkText("VBScript"));
		//This will scroll the page Horizontally till the element is found.
				js.executeScript("arguments[0].scrollIntoView();", Element);
	    
			
				
		
				

/*	JavascriptExecutor in Selenium to click a button
	js.executeScript("document.getElementByID('element id').click();");
	
	JavascriptExecutor in Selenium to send text
	js.executeScript("document.getElementByID('element id').value = 'xyz';");
	
	JavascriptExecutor in Selenium to interact with checkbox
	js.executeScript("document.getElementByID('element id').checked = false;");
	
	JavascriptExecutor in Selenium to refresh the browser window
	js.executeScript("location.reload()");   */
				
		//driver.close();
	}

}
