package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Upload {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		WebElement fileInput = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
		fileInput.sendKeys("C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\ST\\sql");
		
		//Wait for a few seconds to ensure the file is uploaded
		try {
			 Thread.sleep(5000);
			}
	    catch(InterruptedException e) 
			{
		     e.printStackTrace();				  
			}
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}

	}


