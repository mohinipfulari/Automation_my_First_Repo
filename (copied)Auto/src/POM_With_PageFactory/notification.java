package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class notification {
	
	@FindBy(xpath=("(//div[@class='rq0escxv l9j0dhe7 du4w35lb'])[2]"))private WebElement noti;
	
	public notification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void notification() {
		noti.click();
	}

}
