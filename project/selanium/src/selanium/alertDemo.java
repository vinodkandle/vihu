package selanium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement clickme = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme.click();
		//driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement clickme5after5sec = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		clickme5after5sec.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement cancel = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		cancel.click();
		wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement senddata = driver.findElement(By.xpath("//button[@id=\'promtButton\']"));
		
		js.executeScript("arguments[0].click();", senddata);
		driver.switchTo().alert().sendKeys("vinod kandale");
		driver.switchTo().alert().accept();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		

	}

}
