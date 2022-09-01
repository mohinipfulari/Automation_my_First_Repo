package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook_login {
	
	@FindBy(xpath=("//input[@id='email']"))private WebElement id;
	@FindBy(xpath=("//input[@name='pass']"))private WebElement pwd;
	@FindBy(xpath=("//button[@value='1']"))private WebElement btnclick;
	
	public facebook_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void userid() {
		id.sendKeys("dnyaneshwarbhutekar5@gmail.com");
	}
	public void getpass() {
		pwd.sendKeys("Dnyan9011608564");
	}
	public void submit() {
		btnclick.click();
	}
	
	

}
