package testNgProgram;

import java.util.Iterator;
import java.util.Set;
import testNgProgram.inheritedDependencies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class childclass(){
	WebDriver driver;
  @Test(dependsOnGroups = "latest")
  public void jobs() {
	  WebElement job =driver.findElement(By.xpath("//div[text()='Jobs']"));
		job.click();
	  Set<String> child =driver.getWindowHandles();
	  Iterator<String> itr = child.iterator();
	  while(itr.hasNext())
	  {
		  String childWindow = itr.next();
		  if(!mainwindow.equalsIgnoreCase(childWindow))
		  {
			  WebElement searchtag = driver.findElement(By.xpath("//div[@id='skill']//input[@name='qp']"));
			  searchtag.sendKeys("selanium");
			  WebElement clicksearch = driver.findElement(By.xpath("//button[text()='Search ']"));
			  clicksearch.click();
		  }
	  }
  }
}
