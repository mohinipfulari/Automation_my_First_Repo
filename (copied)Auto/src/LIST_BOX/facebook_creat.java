package LIST_BOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_creat {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(200);
	driver.findElement(By.xpath(("(//div[@class='_6ltg'])[2]"))).click();
	Thread.sleep(3000);
	
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	
	Select s=new Select(day);
	
	s.selectByIndex(2);//3
	//s.selectByValue("25");//25
	//s.selectByVisibleText("25");
	
	Thread.sleep(2000);
	driver.quit();
	
	}
}
