package selanium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesmethodpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\project\\selanium\\chromejar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement img = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		img.click();
		
		WebElement onepluse = driver.findElement(By.xpath("//span[text()='OnePlus']//preceding-sibling::div//input//following-sibling::i"));
		onepluse.click();
		
		WebElement budds = driver.findElement(By.xpath("//span[text()='OnePlus Nord Buds |True Wireless Earbuds| 12.4mm Titanium Drivers | Playback:Up to 30hr case | 4-Mic Design + AI Noise Cancellation| IP55 Rating |Fast Charging: 10min for 5hr Playback (Black Slate)||']"));

		budds.click();
	}

}
