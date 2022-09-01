package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FLIPKART_XPATH {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
          
		
		driver.findElement( By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("dngdrsrd@gmail.com");
		
		driver.findElement( By.xpath("//input[@type='password']")).sendKeys("123456789+");
		
		driver.findElement( By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
