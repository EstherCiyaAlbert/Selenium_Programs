package seleniumprgmspack;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actual_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL Latitude\\OneDrive\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//To get title
				String Title = driver.getTitle();
				System.out.println(Title);
				
				
	   //CURRENT DATE AND TIME
				Calendar calendar_Date_Time = Calendar.getInstance();
				Date currentDateTime = calendar_Date_Time.getTime();
				System.out.println(currentDateTime);

				
	   //FUTURE DATE AND TIME
				Calendar calendar_Date_Time1 = Calendar.getInstance();
				calendar_Date_Time1.add(Calendar.DAY_OF_YEAR, 10);
				Date futureDateTime = calendar_Date_Time1.getTime();
				System.out.println(futureDateTime);
				
	  //PAST DATE AND TIME
				Calendar calendar_Date_Time2 = Calendar.getInstance();
				calendar_Date_Time2.add(Calendar.DAY_OF_YEAR, -19);
				Date pastDateTime = calendar_Date_Time2.getTime();
				System.out.println(pastDateTime);
				
	}

}
