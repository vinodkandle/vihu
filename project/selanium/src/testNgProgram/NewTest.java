package testNgProgram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver; 
  @Test?>
  public void f() {
	  System.out.println("i am in f");
	  System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
       driver = new ChromeDriver();
	  //driver.get();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.location = 'https://www.lambdatest.com'");
  }
}
