package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	Thread.sleep(2000);	
	
	login_gmail lg=new login_gmail(driver);
	lg.email();
	lg.clicknext();
	Thread.sleep(2000);
	
	enterpass e=new enterpass (driver);
	e.pass();
	e.submit();
	Thread.sleep(2000);
	driver.quit();
	}

}
