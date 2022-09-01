package WEBELEMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		//boolean out = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		//System.out.println(out);
		
		
		WebElement out1 = driver.findElement(By.xpath("//input[@type='submit']"));
		boolean result = out1.isEnabled();
		System.out.println(result);
		
		Thread.sleep(2000);
		driver.quit();

}}
