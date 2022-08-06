package selanium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlemultiplewindo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String mainwindoString = driver.getWindowHandle();
		WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
		job.click();
		
		             Set<String> childwindow =driver.getWindowHandles();
		             Iterator<String> itr =childwindow.iterator();
		             while(itr.hasNext())
		            	 ;
		             {
		            	 String child = itr.next();
		            	 if(!mainwindoString.equalsIgnoreCase(child))
		            	 {
		            		 driver.switchTo().window(child);
		            		 WebElement search = driver.findElement(By.xpath("//div[@id='skill']//input[@name='qp']"));
		            		 search.sendKeys("selanium");
		            	 }
		             }

	}

}
