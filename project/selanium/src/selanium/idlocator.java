package selanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vinodkandle@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("12345");
		
		//WebElement btn = driver.findElement(By.className("_42ft"));
		//btn.click();
		
		//WebElement linktext = driver.findElement(By.linkText("Forgotten password"));
		//linktext.click();
		//WebElement partialLinktext = driver.findElement(By.partialLinkText("Forgotten"));
		//partialLinktext.click();
		WebElement xpathclass = driver.findElement(By.xpath(("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")));
		xpathclass.click();
	}

}
