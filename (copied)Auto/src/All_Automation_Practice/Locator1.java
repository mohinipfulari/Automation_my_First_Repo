package All_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.tagName("input")).sendKeys("dnyanu@gmai.com");
		//driver.findElement(By.name("email")).sendKeys("dnyanu123@.com");
		//driver.findElement(By.id("u_0_3_Qo")).sendKeys("123456756");
		//driver.findElement.(By.className(null))
		driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("abcd@");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
