package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FriendsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import utility.LogExample;
import utility.Utility;

public class Base {
	protected static WebElement element;
	protected static WebDriver driver;
	protected static FileInputStream file;
	protected static FileInputStream excelfile;
	protected static Properties prop;
	protected static Utility utility;
	protected static XSSFWorkbook xWorkbook;
	protected static XSSFSheet xsheet;
	protected static XSSFCell xCell;
	protected static XSSFRow xRow;
	protected static Object[][] data;

	public static LoginPage LoginP;
	public static HomePage homeP;
	public static ProfilePage profileP;
	public static FriendsPage friendsP;
	
	protected static String message;
	public static Logger logger = Logger.getLogger(Base.class); 

	final static String File_Path = System.getProperty("user.dir") + File.separator + "resources" + File.separator
			+ "repository" + File.separator + "LoginTestData.xlsx";

	static {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
	}

	public Base() {
		try {
			prop = new Properties();
			file = new FileInputStream(
					"C:\\Users\\rajar\\eclipse-workspace\\PageObjectModel\\PageObjectModel\\resources\\config.properties");
			prop.load(file);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
