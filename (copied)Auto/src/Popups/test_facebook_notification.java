package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_With_PageFactory.facebook_login;
import POM_With_PageFactory.notification;
import POM_With_PageFactory.unreadnotification;


public class test_facebook_notification {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		facebook_login fl=new facebook_login(driver);
		
		fl.userid();
		fl.getpass();
		fl.submit();
		Thread.sleep(2000);
		
		notification n=new notification(driver);
		
		n.notification();
		Thread.sleep(2000);
		
		unreadnotification un=new unreadnotification(driver);
		un.unread1();
		Thread.sleep(2000);
		driver.quit();
		}

}
