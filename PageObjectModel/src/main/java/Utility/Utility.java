package Utility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility extends Base{
	public  static void initializeDriver() throws IOException {
		
		file=new FileInputStream("C:\\Users\\rajar\\eclipse-workspace\\PageObjectModel\\PageObjectModel\\resources\\config.properties");
		prop=new Properties();
		prop.load(file);
		
		if (prop.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}else {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}

	public static void closeDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}

	
}
