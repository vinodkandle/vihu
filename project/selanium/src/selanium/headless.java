package selanium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		ChromeOptions src = new ChromeOptions();
		src.addArguments("--headless");
		WebDriver driver = new ChromeDriver(src);
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		

	}

}
