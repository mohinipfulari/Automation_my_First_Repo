package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_PATH {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dnyanu@5.com");
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("901152346");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
