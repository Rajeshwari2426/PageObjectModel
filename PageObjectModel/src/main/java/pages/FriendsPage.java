package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FriendsPage extends LoginPage{
	
	@FindBy(xpath = "//a[@aria-label='Friends']//i[@data-visualcompletion='css-img']")
	WebElement friendsBtn;
	
	@FindBy(xpath = "//input[@placeholder='Search Facebook']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//input[@placeholder='Search Facebook']")
	WebElement Btn;
	
	public void searchFriend() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			friendsBtn.click();
			searchBtn.click();
			searchBtn.sendKeys("Rajeshwari");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
