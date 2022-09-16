package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

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
	protected static XSSFRow  xRow;
	protected static Object[][] data;
	
	public static LoginPage LoginP;
	protected static String message;
	final static String File_Path=System.getProperty("user.dir")+
			File.separator+"resources"+
			File.separator+"repository"+
			File.separator+"LoginTestData.xlsx";
	
	
	
	static {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		}
	
	public Base() {
		try {
			prop=new Properties();
			file=new FileInputStream(".\\config.properties");
			prop.load(file);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
