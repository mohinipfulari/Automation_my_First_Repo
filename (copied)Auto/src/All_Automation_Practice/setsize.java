package All_Automation_Practice;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	Dimension D=new Dimension(100,200);
	
	Thread.sleep(5000);
	
	driver.close();
	}
}
