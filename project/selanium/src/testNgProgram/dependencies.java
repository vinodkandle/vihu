package testNgProgram;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class dependencies {
	public WebDriver driver ;

	  String mainwindow;
	
	
  @Test
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("disable-notifications");
	  driver = new ChromeDriver(opt);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  driver.get("https://www.naukri.com/");
	  mainwindow = driver.getWindowHandle();
	  
  }
  @Test(dependsOnMethods = "launchBrowser")
  public void jobs() {
	  WebElement job = driver.findElement(By.xpath("//div[text()='Jobs']"));
	  job.click();
	 Set<String> childwindow= driver.getWindowHandles();
	 Iterator<String> itr=childwindow.iterator();
	 while(itr.hasNext()) {
		 String child = itr.next();
		 if(!mainwindow.equalsIgnoreCase(child))
		 {
			 driver.switchTo().window(child);
			 WebElement search = driver.findElement(By.xpath("//div[@id='skill']//input[@name='qp']"));
    		 search.sendKeys("selanium");
    		 WebElement clickonSearch = driver.findElement(By.xpath("//button[@id='qsbFormBtn']"));
    		 clickonSearch.click();
			 
		 }
	 }
  }
}
