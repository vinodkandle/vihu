package selanium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mauseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\project\\selanium\\chromejar\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id=\'doubleClickBtn\']"));
		act.doubleClick(doubleclick).perform();
		
		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclick).perform();
		
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Buttons']"));
		act.moveToElement(scroll).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		js.executeScript("arguments[0].click", clickme);
		act.click(clickme).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Interactions']"));
		act.moveToElement(scrolldown);
		
		WebElement source =driver.findElement(By.xpath("//div[text()='Drag me']"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(source, destination);
	}

}
