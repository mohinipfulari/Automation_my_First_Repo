package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonINDEX {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='sl-sobe-carousel-sub-card-image'])[2]")).click();
		
		Thread.sleep(3000);
		
	driver.quit();
	}
}
