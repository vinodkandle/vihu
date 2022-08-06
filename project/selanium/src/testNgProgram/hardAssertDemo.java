package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssertDemo {
	WebDriver driver;
  @Test(invocationCount = 3,threadPoolSize = 1)//timeOut = 1000) method must have to execute within 10 sec otherwise give threadtimeout exception
  //in testng handling exception using expectedExceptions = errorName.class this attribute use in test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  logo.isDisplayed();
	  Assert.assertTrue(logo.isDisplayed());
	  String actualTitle ="Facebook – log in or sign up";
	  String realtitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, realtitle);
	  
  }
  @Test
  public void softassert() {
	  System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  logo.isDisplayed();
	  SoftAssert asser = new SoftAssert();
	  
	  
	  
	  asser.assertTrue(logo.isDisplayed());
	  String actualTitle ="Facebook – log in or sign up";
	  String realtitle = driver.getTitle();
	  asser.assertEquals(actualTitle, realtitle);
	  asser.assertAll();
	  
  }
}
