package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_getText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).getText();
	
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
