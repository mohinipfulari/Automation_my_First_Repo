package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_gmail {
	
	@FindBy(xpath=("//input[@type='email']"))private WebElement mail;
	@FindBy(xpath=("//span[text()='Next']"))private WebElement click;
	
	public login_gmail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void email() {
		mail.sendKeys("dnyanrajbhutekar5@gmail.com");
	}
	public void clicknext() {
		click.click();
	}

}
