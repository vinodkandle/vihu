package selanium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsinselanium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		//Thread.sleep(10);
	
		
		/*
		 * WebElement firstname
		 * =driver.findElement(By.xpath("//input[@type='text' and @name='firstname']"));
		 * firstname.sendKeys("vinod");
		 */
		
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='text' and @name='firstname']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='firstname']"))).sendKeys("Ravi");
	}

}
