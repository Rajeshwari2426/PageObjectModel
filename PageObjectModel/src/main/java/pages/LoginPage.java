package pages;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{
	@FindBy(id="email")
	 WebElement email;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginBtn;
	@FindBy(xpath="//a[@aria-label='Home']")
	WebElement homeBtn;
	@FindBy(className="_9ay7")
	WebElement ErrorMsg;
	//Initialisation
	public LoginPage(){
	PageFactory.initElements(driver, this);
	}
	//Utilisation
	public void loginUser() {
		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();	
			homeBtn.click();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@SuppressWarnings("static-access")
	public void loginUsingXlxs() {
		List<List<String>> values=new LinkedList<List<String>>();
		try {
			values.addAll(utility.excelReader());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		email.sendKeys(values.get(0).get(0));
		password.sendKeys(values.get(0).get(1));
		loginBtn.click();
		homeBtn.click();
		
	}
	public String validateIinvalidLoginCred() {
		try {
			List<List<String>> values=new LinkedList<List<String>>();
			values.addAll(utility.excelReader());
			email.sendKeys(values.get(1).get(0));
			password.sendKeys(values.get(1).get(1));
			loginBtn.click();
			 message=ErrorMsg.getText();
			
			} catch (Exception e) {
			
		}
		return message;
	}
	public String verifyHomePage() {
		String homePageTitle=driver.getTitle();
		return homePageTitle;
	}
	
}
