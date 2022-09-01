package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class enterpass {
	@FindBy(xpath=("//input[@type='password']"))private WebElement pwd;
	@FindBy(xpath=("(//div[@class='VfPpkd-RLmnJb'])[2]"))private WebElement click1;
	
	public enterpass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
   public void pass() {
	   pwd.sendKeys("9011608564");
	   
   }public void submit() {
	   click1.click();
   }
}
