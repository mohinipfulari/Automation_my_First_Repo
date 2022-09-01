package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dnyan5@gmail.com");
		
		 WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		 email.sendKeys("dnyanu%@gmail.com");
		 
		 Thread.sleep(2000);
		 email.clear();
		 
		 Thread.sleep(2000);
		 email.click();
		 Thread.sleep(2000);
		 driver.quit();
	}

	
	}


