package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends LoginPage {
	@FindBy(xpath = "//span[contains(text(),'Photo/video')]")
	WebElement Photo_videobtn;
	@FindBy(xpath = "//span[contains(text(),'Add photos/videos')]")
	WebElement addbtn;
	@FindBy(xpath = "//span[contains(text(),'Post')]")
	WebElement postbtn;
	@FindBy(xpath = "//p[@class='kmwttqpk kjdc1dyq l7ghb35v m8h3af8h']")
	WebElement comentbtn;

	public void postPic() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			homeBtn.click();
			Photo_videobtn.click();
			addbtn.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(
					"C:\\Users\\rajar\\eclipse-workspace\\PageObjectModel\\PageObjectModel\\resources\\repository\\Photo.exe");
//			 WebElement post = new WebDriverWait(driver, Duration.ofSeconds(10))
//				        .until(ExpectedConditions.elementToBeClickable(pic));
//			post.click();
			Thread.sleep(5000);
			postbtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void postVideo() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			homeBtn.click();
			Photo_videobtn.click();
			addbtn.click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec(
					"C:\\Users\\rajar\\eclipse-workspace\\PageObjectModel\\PageObjectModel\\resources\\repository\\video.exe");

			Thread.sleep(5000);
			postbtn.click();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		public void comment() {

			try {
				email.sendKeys(prop.getProperty("emailId"));
				password.sendKeys(prop.getProperty("password"));
				loginBtn.click();
				homeBtn.click();
				Thread.sleep(3000);
				comentbtn.sendKeys("nice");
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}

}
