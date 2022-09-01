package LIST_BOX_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class creat_new_facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=create+new+facebook+account&sxsrf=ALiCzsYsF19YY1I9MzMErvDWN4pED6MUfw%3A1657195648174&ei=gMzGYpyYCoq54t4Pi4ih2Ao&oq=creat+&gs_lcp=Cgdnd3Mtd2l6EAEYBDIHCCMQsQIQJzIECAAQQzIFCAAQgAQyCggAELEDEIMBEAoyBAgAEEMyBAgAEAoyBAgAEEMyBQgAEIAEMgQIABAKMgQIABAKOgcIABBHELADOgcIABCwAxBDOgQIIxAnOgoILhDHARDRAxBDOgsIABCABBCxAxCDAToICAAQsQMQgwE6CAgAEIAEELEDSgQIQRgASgQIRhgAUKdFWO5PYIx7aAVwAHgAgAHfAYgBtwmSAQUwLjQuMpgBAKABAcgBCsABAQ&sclient=gws-wiz");
	
	driver.findElement(By.xpath("(//div[@role='heading'])[2]")).click();
	
	Thread.sleep(2000);
	WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
	
	Select s=new Select(day);
	
	//s.selectByIndex(2);
	//s.selectByValue("5");
	s.selectByVisibleText("10");
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	}
	

}
