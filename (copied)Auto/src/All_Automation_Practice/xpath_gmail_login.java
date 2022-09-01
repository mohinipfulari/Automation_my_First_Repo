package All_Automation_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_gmail_login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=gmail+log+in&oq=gmail+log+in&aqs=chrome..69i57.14581j0j7&sourceid=chrome&ie=UTF-8");
		Thread.sleep(4000);
         
		driver.findElement(By.xpath("//h3[contains(text(),'Sign in - Google Accounts')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rahulsbhutekar9794@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}