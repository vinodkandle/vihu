package testNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class groups {
	public WebDriver driver;
  @Test(groups= {"sanity,regression"}, priority =1)
  public void launchBrouser() {
	  System.setProperty("webdriver.chrome.driver","D:\\project\\selanium\\chromejar\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
  }
  @Test(groups = "sanity" ,priority =2  ,enabled =false)
  public void getname() {
	  String existName = "Facebook – log in or sign up";
	  String name =driver.getTitle();
	  
	  org.testng.Assert.assertEquals(existName, name);
  }
  @Test(groups = "regression", priority =3)
  public void EnterCredentials() {
	  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	  
	  WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
	  email.sendKeys("test@gmail.com");
	  pass.sendKeys("123456");
	  btn.click();
  }
  @Test(groups = {"sanity","regression"}, priority =4)
  public void tearDown() {
	  driver.close();
  }
}
