

import java.sql.Date;
import java.text.DateFormat;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {
	public static void main(String str[]) throws ATUTestRecorderException
	{
		//Scanner sc = new Scanner(System.in);
		//String data=sc.nextLine();
		ATUTestRecorder recorder = new ATUTestRecorder("D:\\ScriptVideos\\","TestVideo-1",false); 

		//1. connecting driver with script
		WebDriverManager.chromedriver().setup();
		
		//2. Create Webdriver object for accessing browser element
		// It will open browser
		WebDriver driver = new ChromeDriver();
		recorder.start();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//3. Go to URL
		driver.get("https://www.google.com/");
		
		WebElement textbox=driver.findElement(By.id("APjFqb"));
		textbox.click();
		textbox.sendKeys("Selenium");
		
	driver.findElement(By.name("btnK")).submit();
		recorder.stop();
		
		
	}

}
