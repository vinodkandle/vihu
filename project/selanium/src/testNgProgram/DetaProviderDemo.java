package testNgProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DetaProviderDemo {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement btn = driver.findElement(By.xpath("//button[text()='Log In']"));
	  email.sendKeys(username);
	  pass.sendKeys(password);
	  btn.click();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "test@gmail.com", "1234567" },
      //new Object[] { "A", "b" },
    };
  }
}
