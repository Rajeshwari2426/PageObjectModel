package pages;

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
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public String verifyHomePage() {
		String homePageTitle=driver.getTitle();
		return homePageTitle;
	}
	
}
