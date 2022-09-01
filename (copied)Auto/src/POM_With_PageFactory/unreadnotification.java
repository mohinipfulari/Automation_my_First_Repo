package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class unreadnotification {
	
	@FindBy(xpath=("//div[@class='dflh9lhu datstx6m rq0escxv'][2]"))private WebElement unread;
	
	public unreadnotification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void unread1() {
		unread.click();
	}

}
