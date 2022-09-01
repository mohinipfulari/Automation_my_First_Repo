package All_Automation_Practice;

import java.awt.Point;
import java.awt.geom.Point2D;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
         Point P = new Point(300,400);
		
		Thread.sleep(5000);
         
		driver.close();
         
	}

}
