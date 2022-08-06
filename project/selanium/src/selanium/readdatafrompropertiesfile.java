package selanium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdatafrompropertiesfile {

	public static void main(String[] args) throws IOException {
		FileInputStream src = new FileInputStream("D:\\project\\selanium\\config.properties");
		
		Properties prop = new Properties();
		
		prop.load(src);
		
		System.setProperty(prop.getProperty("key"), prop.getProperty("value"));
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get(prop.getProperty("url"));
	}

}
