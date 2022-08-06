package selanium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location")

	}

}
