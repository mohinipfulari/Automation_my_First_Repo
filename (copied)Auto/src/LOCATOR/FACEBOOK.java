package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.tagName("input")).sendKeys("dnyanu5@123.com");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("dnyanu5@123.com");
		
		//driver.findElement(By.name("email")).sendKeys("dnyanu5@123.com");
		
		//driver.findElement(By.id("email")).sendKeys("dnyanu5@123.com");
		
		driver.findElement(By.cssSelector("input[autofocus='1']")).sendKeys("dnyanu5@");
	}

}
