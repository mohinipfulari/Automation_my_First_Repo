package LOCATOR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHONE_PAYLOGIN_XPATH {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32(1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phonepe.force.com/login?locale=us");
		
		//attribute
		driver.findElement( By.xpath("//input[@id='username']")).sendKeys("dnyanu@12345.com");
		
		//by index
		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("d123456");
		//by attribute
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//by text
		driver.findElement(By.xpath("//label[text()='Remember me']")).click();
		
		driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
		
		driver.quit();
		
		
	}

}
