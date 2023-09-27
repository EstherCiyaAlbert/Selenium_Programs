package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Using Absolute xpath
				//WebElement search = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
				//search.sendKeys("Watches for women");
		
				//WebElement lens = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));		
				//lens.click();
		
				//WebElement search1 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
				//search1.clear();
		
				//WebElement search2 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
				//search2.sendKeys("Watches for men");
		
				//WebElement lens1 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));		
				//lens1.click();
		
		
		
		//Using Relative xpath
		
			//		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			//		search.sendKeys("Watches for women");
			//		
			//		WebElement lens = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
			//		lens.click();
			//		
			//		WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			//		search1.clear();
			//
			//		WebElement search2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			//		search2.sendKeys("Watches for men");
			//
			//		WebElement lens1 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));		
			//		lens1.click();
		
		
		
		//Using OR in Relative Xpath
		//				WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @placeholder='Search Amazon.in']"));
		//				search.sendKeys("Watches for women");
		//			
		//				WebElement lens = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' or @type='submit']"));
		//				lens.click();
		//	
		//				WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		//				search1.clear();
		//
		//				WebElement search2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @class='nav-input nav-progressive-attribute']"));
		//				search2.sendKeys("Watches for men");
		//
		//				WebElement lens1 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' or @class='nav-input nav-progressive-attribute']"));		
		//				lens1.click();
	
		
		
				
		
		//Using AND in Relative Xpath
				
//				WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']"));
//				search.sendKeys("Watches for women");
//			
//				WebElement lens = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' and @type='submit']"));
//				lens.click();
//	
//				WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']"));
//				search1.clear();
//
//				WebElement search2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @class='nav-input nav-progressive-attribute']"));
//				search2.sendKeys("Watches for men");
//
//				WebElement lens1 = driver.findElement(By.xpath("//*[@id='nav-search-submit-button' and @class='nav-input nav-progressive-attribute']"));		
//				lens1.click();
				
				
		
				
		//Using CONTAINS in Relative Xpath		
		/*		WebElement search = driver.findElement(By.xpath("//input[contains(@id,'tabsearch')]"));
				search.sendKeys("Watches for women");

				WebElement lens = driver.findElement(By.xpath("//input[contains(@id,'search-submit')]"));		
				lens.click();

				WebElement search1 = driver.findElement(By.xpath("//input[contains(@id,'twotab')]"));
				search1.clear();
			
				WebElement search2 = driver.findElement(By.xpath("//input[contains(@id,'tabsearchtext')]"));
				search2.sendKeys("Watches for men");

				WebElement lens1 = driver.findElement(By.xpath("//input[contains(@id,'nav-search-')]"));		
				lens1.click();
				*/
				
				
				
				
				
		//Using STARTS-WITH in Relative Xpath		
		/*		WebElement search = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch')]"));
				search.sendKeys("Watches for women");

				WebElement lens = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit')]"));		
				lens.click();

				WebElement search1 = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearch')]"));
				search1.clear();
			
				WebElement search2 = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtext')]"));
				search2.sendKeys("Watches for men");

				WebElement lens1 = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit')]"));		
				lens1.click();				
				*/
	
		
		
		//Using TEXT() in Relative Xpath
//				WebElement miniTV = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
//				miniTV.click();
//				
				
		
		//Using Chained-xpath in Relative Xpath
			WebElement search =	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'] // input[@value name='field-keywords']"));
			search.sendKeys("Watches for Women");
		
		//driver.quit();
		
	}

}
