package selanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement frame11= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frame11.getText());
		
		//driver.switchTo().parentFrame();orrr
		String mainwindowString = driver.getWindowHandle();
		driver.switchTo().window(mainwindowString);
		
		
		driver.switchTo().frame("frame2");
		WebElement frame22= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frame22.getText());
	}

}
