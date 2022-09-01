package HandlingofDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/search?q=amazon&oq=&aqs=chrome.0.35i39i362l8.93606j0j7&sourceid=chrome&ie=UTF-8");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@role='heading'])[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@dir='auto']")).sendKeys("samsung");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String reviews = driver.findElement(By.xpath("((//div[@class='sg-row'])[5]//span)[6]")).getText();
	System.out.println(reviews);
	
	Thread.sleep(2000);
	driver.quit();
	
	
	
	
}
}
