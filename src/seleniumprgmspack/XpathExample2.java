package seleniumprgmspack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		
		//WebElement Fullname = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[2]/input"));
		//Fullname.sendKeys("Jez Joseph");
		
		//WebElement email = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[3]/input"));
		//email.sendKeys("jez.joseph@gmail.com");
		
		//WebElement Telephone = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[4]/input"));
		//Telephone.sendKeys("123456789");
		
		//WebElement File = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[6]/input"));
		//File.sendKeys("C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\ST\\SDLC_STLC.jpeg");
		//try
		//{Thread.sleep(5000);}
		//catch(InterruptedException e)
		//{e.printStackTrace();}
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, 500)");
		
		//Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select")));
		//gender.selectByVisibleText("Male");
		
		//WebElement exp = driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[1]"));
		//exp.click();
		
		////JavascriptExecutor jx = (JavascriptExecutor) driver;
		////jx.executeScript("document.getElementByID('ip').checked = true;");
		
		//WebElement Skills = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[1]"));
		//Skills.click();
		
		//WebElement Skills1 = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[2]"));
		//Skills1.click();
		
		//WebElement Submit = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[10]/input"));
		//Submit.click();  
		

		
		WebElement Fullname = driver.findElement(By.xpath("//input[@id='username']"));
		Fullname.sendKeys("Jez Joseph");
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("jez.joseph@gmail.com");
		
		WebElement Telephone = driver.findElement(By.xpath("//input[@id='tel']"));
		Telephone.sendKeys("123456789");
		
		WebElement File = driver.findElement(By.xpath("//*[@name='datafile']"));
		File.sendKeys("C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\ST\\SDLC_STLC.jpeg");
		try
		{Thread.sleep(5000);}
		catch(InterruptedException e)
		{e.printStackTrace();}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		Select gender = new Select(driver.findElement(By.xpath("//*[@name='sgender']")));
		gender.selectByVisibleText("Male");
		
		WebElement exp = driver.findElement(By.xpath("//input[@name='experience']"));
		exp.click();
		
		//JavascriptExecutor jx = (JavascriptExecutor) driver;
		//jx.executeScript("document.getElementByID('ip').checked = true;");
		
		WebElement Skills = driver.findElement(By.xpath("//*[@id='ip']"));
		Skills.click();
		
		WebElement Skills1 = driver.findElement(By.xpath("//*[@value='automationtesting']"));
		Skills1.click();
		
		WebElement Submit = driver.findElement(By.xpath("//*[@name='commit']"));
		Submit.click();
		
		//WebElement ok = driver.findElement(By.xpath(""));
		//ok.click();
		
		
			

	}

}
