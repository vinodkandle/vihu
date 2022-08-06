package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class inheritedDependencies {
public WebDriver driver;
public String mainwindow;

		@Test
		public void latest() {
			System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.naukri.com/");
			mainwindow = driver.getWindowHandle();
			
		}

	

}
