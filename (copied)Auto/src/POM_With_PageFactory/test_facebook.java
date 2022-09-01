package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_facebook {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		facebook_login f=new facebook_login(driver);
		
		f.userid();
		f.getpass();
		f.submit();
		Thread.sleep(2000);
		
		notification n=new notification(driver);
		n.notification();
		Thread.sleep(2000);
		
		unreadnotification u=new unreadnotification(driver);
		u.unread1();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
