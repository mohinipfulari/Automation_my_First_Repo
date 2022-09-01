package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_clear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		 WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("dnyanu5@gmail.com");
		
		 //driver.findElement(By.xpath("//input[@id='email']")).clear()	;
		driver.findElement(By.xpath("//input[@name='pass']")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1452672");
		
		email.clear();
		
		Thread.sleep(2000);
		
		email.sendKeys("rahul@gmail.com");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
