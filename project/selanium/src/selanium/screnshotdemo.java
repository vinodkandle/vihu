package selanium;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screnshotdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,"D:\\project\\selanium\\screenshots"+timestamp()+".jpeg");
		
	
			
			
		}
	public static String timestamp() {
		
		return SimpleDateFormat("yyyy-mm-dd").format(new Date());
	}
	private static DateFormat SimpleDateFormat(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
