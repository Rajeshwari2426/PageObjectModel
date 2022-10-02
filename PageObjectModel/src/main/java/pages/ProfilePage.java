package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends LoginPage {
	
	@FindBy(xpath = "//a[@class='qi72231t nu7423ey tav9wjvu flwp5yud tghlliq5 gkg15gwv s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 om3e55n1 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 icdlwmnq i85zmo3j alzwoclg ny5l3ck6 obv5v25f f9xcifuu bmgto6uh']//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")
	WebElement profileBtn;
	
	@FindBy(xpath = "//div[@aria-label='Update profile picture']//i[@class='gneimcpu b0w474w7']")
	WebElement profilePicBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Upload Photo')]")
	WebElement uploadBtn;
	
	@FindBy(xpath = "//div[@class='om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l k70v3m9n fdgfg23c n75z76so ed17d2qt']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//span[contains(text(),'See All Photos')]")
	WebElement seeAllPicsBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Add Bio')]")
	WebElement addBioBtn;
	
	@FindBy(xpath = "//textarea[@placeholder='Describe who you are']")
	WebElement bioTextBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement bioSaveBtn;
	
	@FindBy(xpath = "//div[@aria-label='Edit Bio']//div[@class='i85zmo3j alzwoclg jcxyg2ei dkyav5mx mw5ieb4x is65gj9g']")
	WebElement editBioBtn;

	public void postProfilePic() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			profileBtn.click();
			profilePicBtn.click();
			uploadBtn.click();

			Thread.sleep(1000);

			Runtime.getRuntime().exec(
					"C:\\Users\\rajar\\eclipse-workspace\\PageObjectModel\\PageObjectModel\\resources\\repository\\profilepic.exe");

			Thread.sleep(5000);
			saveBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void seeAllPhotos() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			profileBtn.click();
			seeAllPicsBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addBio() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			profileBtn.click();
			Thread.sleep(0500);
			addBioBtn.click();
			bioTextBtn.sendKeys("hello");
			bioSaveBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editBio() {

		try {
			email.sendKeys(prop.getProperty("emailId"));
			password.sendKeys(prop.getProperty("password"));
			loginBtn.click();
			profileBtn.click();
			Thread.sleep(500);
			editBioBtn.click();
			bioTextBtn.sendKeys("hello");
			bioSaveBtn.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
